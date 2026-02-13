//package projetojava.mvc.repository;
//
//import org.apache.commons.dbcp2.BasicDataSource;
//import java.sql.Connection;
//import java.sql.SQLException;
//
//public class ConnectionBD {
//
//    private static final BasicDataSource dataSource = new BasicDataSource();
//
//    static {
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/meudb");
//        dataSource.setUsername("root");
//        dataSource.setPassword("password");
//
//        dataSource.setMinIdle(5);
//        dataSource.setMaxIdle(10);
//        dataSource.setMaxTotal(20);
//    }
//
//    private ConnectionBD() {
//
//    }
//
//    public static Connection getConnection() throws SQLException {
//        return dataSource.getConnection();
//    }
//}
