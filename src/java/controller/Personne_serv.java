/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Personne;

/**
 *
 * @author toshiba
 */
@WebServlet(name = "Personne_serv", urlPatterns = {"/Personne_serv"})
public class Personne_serv extends HttpServlet {

       @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int age = Integer.parseInt(request.getParameter("age"));

       Personne P = new Personne();
        String message = P.calculerRest(age);

        request.setAttribute("message", message);
        RequestDispatcher dispatcher = request.getRequestDispatcher("affiche.jsp");
        dispatcher.forward(request, response);     } }
