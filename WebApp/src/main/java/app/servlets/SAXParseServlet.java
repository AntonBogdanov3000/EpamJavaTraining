package app.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import app.model.Model;
import app.service.SAXParser.MedicinesSAXBuilder;

public class SAXParseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        Model model = Model.getInstance();
        MedicinesSAXBuilder builder = model.getMsb();
        model.parseSax();
        req.setAttribute("SAX",builder);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/parseSAX.jsp");
        requestDispatcher.forward(req,res);
    }
}
