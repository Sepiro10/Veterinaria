/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.progmascota;

import java.util.List;

/**
 *
 * @author sebas
 */
public interface Iveterinaria <m extends Mascotas>{
    List<m> eliminar(int indice);
    List<m> getArr();
    void insertar(m obj);
}
