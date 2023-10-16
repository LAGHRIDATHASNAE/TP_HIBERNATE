<%-- 
    Document   : welcome.jsp
    Created on : 10 oct. 2023, 12:24:24
    Author     : lenovo
--%>

<%@page import="ma.projet.entities.Client"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!Client c; %>
        <%
         
        HttpSession s = request.getSession();
        if (s != null) {
             c = (Client) s.getAttribute("client");
        }
        else{
            response.sendRedirect("authentification.jsp");
        }
        %>
        <h1>Bienvenue, <%= c.getNom() + " " + c.getPrenom()%> </h1>
        <form action="DeconnexionController">
            <input type="submit" value="Se déconneter" name="sedeconneter">
        </form>

    </body>
</html>
