<%-- 
    Document   : index
    Created on : 30 Nov 2025, 02.59.32
    Author     : ihabh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="get" action=" PrakController">
            NIM: <input type="text" name="nim" /> <br />
            Nama: <input type="text" name="nama" /> <br />
        <input type="submit" value="Kirim" />
        </form>
        <%
         out.print(request.getAttribute("nim")+"<br />");
         out.print(request.getAttribute("nama")+"<br />");
        %>
    </body>
</html>
