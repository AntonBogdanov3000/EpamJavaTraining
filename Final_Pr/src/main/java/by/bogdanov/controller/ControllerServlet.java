package by.bogdanov.controller;

import by.bogdanov.controller.command.Command;
import by.bogdanov.dao.DaoException;
import by.bogdanov.dao.pool.ConnectionPool;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ControllerServlet extends HttpServlet {

    private static final String DB_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/carshop";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "admin";
    private static final int DB_POOL_START_SIZE = 10;
    private static final int DB_POOL_MAX_SIZE = 50;
    private static final int DB_POOL_CHECK_CONNECTION_TIMEOUT = 0;

    public void init(){
       // try{
        //    ConnectionPool.getInstance().init(DB_DRIVER_CLASS,DB_URL,DB_USER,DB_PASSWORD,DB_POOL_START_SIZE,
       //             DB_POOL_MAX_SIZE,DB_POOL_CHECK_CONNECTION_TIMEOUT);
            // }catch (DaoException e){
        //    destroy();
       // }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       // processRequest(request, response);
        response.getWriter().write("Hello");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //processRequest(request, response);
        response.getWriter().write("Hello");
    }
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        Command command = (Command) request.getAttribute("command");
    }
}
