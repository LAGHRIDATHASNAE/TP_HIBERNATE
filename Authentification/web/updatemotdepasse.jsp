<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <fieldset>
            <legend>Nouveau mot de passe</legend>
            <form action="UpdatePasswordController" method="post">
                <table>
                    <tr>
                        <td>Mot de passe:</td>
                        <td><input type="password" name="password"></td>
                        <td>Confirmer le mot de passe :</td>
                        <td><input type="password" name="passwordcnf"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Modifier"</td>
                    </tr>
                    <tr><td><h4><%= request.getParameter("msg")%></h4></td></tr>
                </table>
            </form>
        </fieldset>
    </body>
</html>
//Source : www.exelib.net