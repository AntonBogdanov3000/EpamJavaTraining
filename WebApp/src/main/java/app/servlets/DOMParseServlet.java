package app.servlets;

import app.model.Model;
import app.service.DomParser.MedicinesDOMBuilder;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class DOMParseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Model model = Model.getInstance();
        MedicinesDOMBuilder builder = model.getMdb();
        model.parseDOM();
        req.setAttribute("DOM", builder);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/parse.jsp");
        requestDispatcher.forward(req,res);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    }
}
