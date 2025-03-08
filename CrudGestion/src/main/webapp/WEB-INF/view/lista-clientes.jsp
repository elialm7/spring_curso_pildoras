<%-- 
    Document   : lista-clientes
    Created on : Mar 6, 2025, 7:23:33 PM
    Author     : Elias
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styles.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hemos llegado a la lista de futuros clientes!!</h1>
     
     <table>
         <tr>
             <th>ID</th>
             <th>Nombre</th>
             <th>Apellido</th>
             <th>Email</th>
             <th>Modificar</th>
             <th>Eliminar</th>
         </tr>
         <c:forEach var="clienteTemp" items="${clientes}">
             
             <c:url var="linkEliminar" value="/cliente/eliminarCliente">
                 <c:param name="clienteId" value="${clienteTemp.id}"/>
             </c:url>
             <c:url var="linkActualizar" value="/cliente/muestraFormularioActualizar">
                 <c:param name="clienteId" value="${clienteTemp.id}"/>
             </c:url>
             <tr>
                 <td>${clienteTemp.id}</td>
                 <td>${clienteTemp.nombre}</td>
                 <td>${clienteTemp.apellido}</td>
                 <td>${clienteTemp.email}</td>
                 <td>
                     <a href="${linkActualizar}">
                         <input type="button" value="Modificar"/>
                     </a>
                 </td>
                  <td>
                     <a href="${linkEliminar}">
                         <input type="button" value="Eliminar" 
                                onclick="
                                        if(!confirm('Estas seguro de querer eliminar este cliente?')) return false;
                                        "/>
                     </a>
                 </td>
             </tr>           
         </c:forEach>
     </table> 
        
        <br/><!-- comment -->
        
        <input type="button" value="Agregar Cliente"  onclick="window.location.href='muestraFormularioAgregar';return false;"/>
     
    </body>
</html>
