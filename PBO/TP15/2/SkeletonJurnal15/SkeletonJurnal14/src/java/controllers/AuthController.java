package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "AuthController", urlPatterns = {"/AuthController"})
public class AuthController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // (#2.1) Lakukan send redirect langsung ke jsp index
        response.sendRedirect("index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        
        // (#2.2) Lakukan pengecekan apakah variabel action bernilai "login"
        if ("login".equals(action)) {
            // (#2.3) Lakukan get request parameter username
            String username = request.getParameter("username");
            // (#2.4) Lakukan get request parameter password 
            String password = request.getParameter("password");
            // (#2.5) Lakukan pengecekan pada if, jika var username bernilai "admin", dan var password bernilai "1234"
            if ("admin".equals(username) && "1234".equals(password)) {
                HttpSession session = request.getSession();
                // (#2.6) Lakukan set atribute session ke "user" dari variabel username sebelumnya
                session.setAttribute("user", username);
                response.sendRedirect(request.getContextPath() + "/product?menu=view");
            } else {
                response.sendRedirect(request.getContextPath() + "/index.jsp?error=1");
            }
        } else if ("logout".equals(action)) {
            HttpSession session = request.getSession(false);
            // (#2.7) Lakukan pengecekan jika session tidak bernilai null
            if (session != null) {
                // (#2.8) Lakukan pengecekan jika session invalidate dengan memanggil fungsi bawaannya
                session.invalidate();
            }
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        } else {
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        }
    }
}
