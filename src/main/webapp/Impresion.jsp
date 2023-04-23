<%-- 
    Document   : Impresion
    Created on : 19/04/2023, 8:03:06 p. m.
    Author     : sebas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.mycompany.progmascota.Gatos"%>
<%@page import="com.mycompany.progmascota.Perros"%>
<%@page import="com.mycompany.progmascota.Mascotas"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="Diseño.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>⚕ Lista Mascotas ⚕</h1>
            <table>
                <tr>
                    <th>Tipo</th>
                    <th>Nombre</th>
                    <th>Raza</th>
                    <th>Color</th>
                    <th>Edad</th>
                    <th>Enfermo/Entrenamiento</th>
                </tr>

                <%
                    List<Mascotas> animal = null;
                    Object objAnimal = request.getAttribute("datos");
                    if (objAnimal instanceof List<?> && !((List<?>) objAnimal).isEmpty() && ((List<?>) objAnimal).get(0) instanceof Mascotas) {
                        animal = (List<Mascotas>) objAnimal;
                    }
                    if (animal != null) {
                    int i = 0;
                        for (Mascotas obj : animal) {
                %>
                <tr>
                    <td><%= obj.getTipo()%></td>
                    <td><%= obj.getNombre()%></td>
                    <td><%= obj.getRaza()%></td>
                    <td><%= obj.getColor()%></td>
                    <td><%= obj.getEdad()%></td>
                    <td><%= obj.getCondicion()%></td>
                    
                    <td width="100px">
                        <form action="Controlador" method="post">
                            <input type="hidden" name="orden" value="eliminar">
                            <input type="hidden" name="i" value="<%=i%>">
                            <input type="submit" name="boton" value="Eliminar">
                        </form></td>


                </tr>
                <%
                    i++;
                    }%>
                    
                    <tr>
                        <td colspan="6">
                            El promedio de la edad es de: <%=request.getAttribute("prom")%>
                        </td>
                    </tr>
                    
                   <% 
                } else {
                %>
                
                <tr>
                    <td colspan="6">No se encontraron mascotas</td>
                </tr>
                <%
                    }
                %>
                <tr>
                    <td colspan="6">

                        <button onclick="href=location.href='index.html'">Regresar</button>

                    </td>
                </tr>
            </table>
        
    </body>
</html>
