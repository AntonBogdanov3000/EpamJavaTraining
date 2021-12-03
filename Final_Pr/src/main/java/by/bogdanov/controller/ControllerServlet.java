package by.bogdanov.controller;

import javax.servlet.http.HttpServlet;

public class ControllerServlet extends HttpServlet {

    private static final String DB_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/carshop";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "admin";
    private static final int DB_POOL_START_SIZE = 10;
    private static final int DB_POOL_MAX_SIZE = 50;
    private static final int DB_POOL_CHECK_CONNECTION_TIMEOUT = 0;
}
