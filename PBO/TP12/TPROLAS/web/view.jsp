<%-- 
    Document   : view
    Created on : 30 Nov 2025, 04.04.02
    Author     : ihabh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Daftar Barang</h2>
        <table border="1" cellpadding="5" cellspacing="0">
            <tr>
                <th>ID</th>
                <th>Nama</th>
                <th>Harga</th>
            </tr>
            <%
            ResultSet rs = (ResultSet) request.getAttribute("list"); 
            if (rs != null) {
                while (rs.next()) { 
                    int id = rs.getInt("id"); 
                    String nama = rs.getString("nama"); 
                    double harga = rs.getDouble ("harga"); 
            %>
            <tr>
                <td><%= id %></td>
                <td><%= nama %></td>
                <td><%= harga %></td>
            </tr>
            <%
                }
            }
            %>
        </table>
        <a href="form.jsp">Tambah Barang</a> 
    </body>
</html>
