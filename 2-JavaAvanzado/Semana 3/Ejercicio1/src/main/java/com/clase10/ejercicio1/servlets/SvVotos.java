/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.clase10.ejercicio1.servlets;

import com.clase10.ejercicio1.logica.ControladoraLogica;
import com.clase10.ejercicio1.logica.Voto;
import com.clase10.ejercicio1.logica.Votos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvVotos", urlPatterns = {"/SvVotos"})
public class SvVotos extends HttpServlet {

    private List<Votos> listaVotos = new ArrayList<>();
    private ControladoraLogica control = new ControladoraLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Votos> votosPartidos = control.mostrarVotos();

        Map<String, Long> cuentaVotosOrdenados = votosPartidos.stream()
                .collect(Collectors.groupingBy(Votos::getNombre, TreeMap::new, Collectors.counting()));

        request.setAttribute("resultados", cuentaVotosOrdenados);

        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        String partido = request.getParameter("partido");
        Votos voto = new Votos();
        voto.setNombre(partido);

        control.añadirVotos(voto);
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
