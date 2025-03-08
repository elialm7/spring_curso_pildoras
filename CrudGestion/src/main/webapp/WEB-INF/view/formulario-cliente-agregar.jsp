<%-- 
    Document   : formulario-cliente-agregar
    Created on : Mar 7, 2025, 10:05:27 PM
    Author     : Elias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styles.css"/>
    </head>
    <body>
        <h1>hemos llegado al formulario de insertar</h1>
        <form:form action="insertarCliente" modelAttribute="nuevoCliente" method="POST">
            <table>
                <tr>
                    <td>Nombre</td>
                    <td><form:input path="nombre"/></td>
                </tr>
                  <tr>
                    <td>Apellido</td>
                    <td><form:input path="apellido"/></td>
                </tr>
                  <tr>
                    <td>Email</td>
                    <td><form:input path="email"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Insertar"/>
                    </td>
                </tr>
                
            </table>
        </form:form>
    </body>
</html>
