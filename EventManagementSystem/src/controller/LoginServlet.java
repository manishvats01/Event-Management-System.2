package controller;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        String user = req.getParameter("username");
        String pass = req.getParameter("password");
        if(user.equals("admin") && pass.equals("admin")) {
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            res.sendRedirect("dashboard.jsp");
        } else {
            res.sendRedirect("login.jsp");
        }
    }
}