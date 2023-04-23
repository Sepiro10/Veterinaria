/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progmascota;

/**
 *
 * @author sebas
 */
public class Perros extends Mascotas{
        protected String entrenamiento;
        
        public Perros(){
        }

    public Perros(String condicion, String nombre, String color, String raza, int edad, String tipo) {
        super(condicion, nombre, color, edad, raza, tipo);
    }

    public String getEntrenamiento() {
        return entrenamiento;
    }

    public void setEntrenamiento(String entrenamiento) {
        this.entrenamiento = entrenamiento;
    }
}
