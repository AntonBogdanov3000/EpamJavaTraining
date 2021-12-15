package by.bogdanov.controller;

import by.bogdanov.controller.command.Command;
import by.bogdanov.controller.command.CommandProvider;
import by.bogdanov.service.ServiceFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ControllerServlet extends HttpServlet {


    public void init(){
       ServiceFactory.getInstance().getConnectionService().startConnection();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        processRequest(request, response);

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        processRequest(request, response);

    }
    public CommandProvider provider = new CommandProvider();

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String jspPage ;
        String commandName;
        String redir = request.getParameter("path");
        if(request.getParameter("command").isEmpty()){
            String s = "/WEB-INF/jsp/" + request.getParameter("path");
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(s);
            requestDispatcher.forward(request,response);
        }else {
        commandName = request.getParameter("command");
        Command command = provider.getCommand(commandName);
        jspPage = "/WEB-INF/jsp/" + command.execute(request);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jspPage);
        dispatcher.forward(request, response);
        }
        //response.sendRedirect(request.getParameter("path"));

    }


}
