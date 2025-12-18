package controller;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import dao.EventDAO;
public class EventServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        String name = req.getParameter("ename");
        String date = req.getParameter("edate");
        EventDAO.addEvent(name, date);
        res.sendRedirect("dashboard.jsp");
    }
}