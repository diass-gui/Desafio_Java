package projetojava.mvc.configBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBD{

//    private static final String URL = "jdbc:mysql://localhost:3306/banco";
//    private static final String USER = "root";
//    private static final String PASSWORD = "senha";

    private static final String URL = "jdbc:mysql://localhost:3306/projeto_Java";
    private static final String USER = "gui";
    private static final String PASSWORD = "213@@556bl20";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}