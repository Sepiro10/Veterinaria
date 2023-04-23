/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.progmascota;

import com.mycompany.progmascota.Gatos;
import com.mycompany.progmascota.Perros;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sebas
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

    private final ArrayList<Mascotas> animal = new ArrayList<>();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) {
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("datos", animal);
        request.getRequestDispatcher("Impresion.jsp").forward(request, response);
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String orden = request.getParameter("orden");
        switch (orden) {
            case "listar":
                String nombre = request.getParameter("nombre");
                String color = request.getParameter("color");
                String raza = request.getParameter("raza");
                String tipo = request.getParameter("tipo");
                int edad = Integer.parseInt(request.getParameter("edad"));

                if (tipo.equals("perro")) {
                    String entrenamiento = request.getParameter("entreno");
                    Mascotas perro = new Perros(entrenamiento, nombre, raza, color, edad, tipo);
                    this.animal.add(perro);
                } else {
                    String enfe = request.getParameter("enfermo");
                    Mascotas gato = new Gatos(enfe, nombre, raza, edad, color, tipo);
                    this.animal.add(gato);
                }

                break;
            case "eliminar":
                int i = Integer.parseInt(request.getParameter("i"));
                this.animal.remove(i);

                break;
            default:
                throw new AssertionError();
        }
        double prom = 0;
        for (Mascotas obj : animal) {
            prom += obj.getEdad();
        }
        
        request.setAttribute("prom", prom/animal.size());
        request.setAttribute("datos", animal);
        request.getRequestDispatcher("Impresion.jsp").forward(request, response);
    }

}
