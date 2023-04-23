/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progmascota;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class Mascotas implements iCalculo{
   
   protected ArrayList<Mascotas> mascotas = new ArrayList<>();
   protected String nombre;
   protected String color;
   protected int edad;
   protected String raza;
   protected String tipo;
   protected String condicion;
   
   public Mascotas(){}

    public Mascotas(String condicion, String nombre, String color, int edad, String raza, String tipo) {
        this.condicion = condicion;
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.raza = raza;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }
    
    public List<Mascotas> getMascotas() {
        return this.mascotas;
    }

    public void setMascotas(Mascotas objeto) {
        this.mascotas.add(objeto);
    }
    
    public List<Mascotas> eliminar(int indice) {
        mascotas.remove(indice);
        return mascotas;
    }
    
    @Override
    public int promedio() {
            int  total=0,inin=0;
            for(Mascotas mascota:mascotas){
                inin=inin+ mascota.getEdad();
            }
            total=inin/mascotas.size();
            return total;
    }

}
