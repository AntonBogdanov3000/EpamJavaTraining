package by.bogdanov.dao.connection;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionCreator {
    private static final Properties properties = new Properties();
    private static final String DATA_BASE;
    private final static ConnectionCreator INSTANCE = new ConnectionCreator();
    static {
        try{
            properties.load(new FileReader("src/main/resources/database.properties"));
            String driverName = (String) properties.get("db.driver");
            Class.forName(driverName);
        } catch (ClassNotFoundException | IOException e){
            e.printStackTrace();
        }
        DATA_BASE = (String) properties.get("db.url");
    }
    private ConnectionCreator(){}
    public static ConnectionCreator getInstance(){
        return INSTANCE;
    }
    public Connection createConnection() throws SQLException{
        return DriverManager.getConnection(DATA_BASE,properties);
    }
}
