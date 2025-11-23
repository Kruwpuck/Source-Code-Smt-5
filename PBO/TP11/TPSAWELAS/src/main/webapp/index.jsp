<%-- 
    Document   : index
    Created on : 23 Nov 2025, 11.41.17
    Author     : ihabh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>TP Modul 11 - JSP</title>
</head>
<body>

    <h1>TP Mod 11</h1>
    
    <a href="http://localhost:8080/index.jsp?page=login">
        <b>Login</b>
    </a>
    |
    <a href="http://localhost:8080/index.jsp?page=register">
        <b>Register</b>
    </a>

    <hr>

    <%
        String p = request.getParameter("page");
       
        if (p == null) {
            p = "login";
        }
    %>
    
    <% if (p.equals("login")) { %>
        <jsp:include page="login.jsp" flush="false"></jsp:include>
    <% } else { %>
        <jsp:include page="register.jsp" flush="false"></jsp:include>
    <% } %>

</body>
</html>
