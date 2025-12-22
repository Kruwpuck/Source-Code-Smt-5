<%-- 
    Document   : index
    Created on : 20 Dec 2025, 15.00.49
    Author     : ihabh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String error = "";
    if ("POST".equalsIgnoreCase(request.getMethod())) {
        String u = request.getParameter("username");
        String p = request.getParameter("password");

        if ("admin".equals(u) && "1234".equals(p)) {
            session.setAttribute("login", "yes");
            response.sendRedirect("product/view.jsp");
            return;
        } else {
            error = "Username atau password salah!";
        }
    }
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Login</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
  <div class="container py-5">
    <div class="row justify-content-center">
      <div class="col-md-5">
        <div class="card shadow-sm">
          <div class="card-body p-4">
            <h4 class="mb-3">Login</h4>

            <% if (!error.isEmpty()) { %>
              <div class="alert alert-danger"><%= error %></div>
            <% } %>

            <form method="post">
              <div class="mb-3">
                <label class="form-label">Username</label>
                <input class="form-control" type="text" name="username" required>
              </div>

              <div class="mb-3">
                <label class="form-label">Password</label>
                <input class="form-control" type="password" name="password" required>
              </div>

              <button class="btn btn-primary w-100" type="submit">Login</button>
              <div class="text-muted small mt-3">
                Hint: admin / 1234
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>
