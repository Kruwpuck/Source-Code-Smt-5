<%-- 
    Document   : form
    Created on : 30 Nov 2025, 04.05.31
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
        <form method="post" action="BarangController?menu=insert">
            Nama Barang: <input type="text" name="nama" /><br />
            Harga Barang: <input type="text" name="harga" /><br />
            <input type="submit" value="Tambah" />
        </form>
    </body>
</html>
