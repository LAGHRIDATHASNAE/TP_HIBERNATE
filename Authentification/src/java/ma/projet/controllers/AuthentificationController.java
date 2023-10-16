/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.controllers;

import com.mysql.jdbc.Util;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ma.projet.entities.Client;
import ma.projet.services.ClientService;

/**
 *
 * @author lenovo
 */
@WebServlet(name = "AuthentificationController", urlPatterns = {"/AuthentificationController"})
public class AuthentificationController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String login = request.getParameter("login");
            String password = request.getParameter("password");
            ClientService cl = new ClientService();
             Client c = cl.getByEmail(login);
        
        if (c != null) {
            if (c.getPassword().equals(cl.MD5(password))) {
                HttpSession session = request.getSession();
                session.setAttribute("client", c);
                //c.setEtat(1);
                cl.update(c);
                response.sendRedirect("welcome.jsp");
            } else {
                response.sendRedirect("authentification.jsp?msg=mot de passe incorrect");
            }
        } else {
            response.sendRedirect("authentification.jsp?msg=Email introvable");
        }
//Source : www.exelib.net
            // Authentication successful
            // Store user information in session or issue an authentication token
            
        
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
