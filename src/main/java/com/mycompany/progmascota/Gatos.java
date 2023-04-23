/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progmascota;


/**
 *
 * @author sebas
 */
public class Gatos extends Mascotas{
    protected String toxoplas;
    
    public Gatos(){}

    public Gatos(String condicion, String nombre, String color, int edad, String raza, String tipo) {
        super(condicion, nombre, color, edad, raza, tipo);
    }

    public String isToxoplas() {
        return toxoplas;
    }

    public void setToxoplas(String toxoplas) {
        this.toxoplas = toxoplas;
    }
}
