package electricity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/ebs";
    private static final String USER = "root";
    private static final String PASSWORD = "Pratik39";

    private Connection connection;

    public MySQLConnection(){
        try{
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL JDBC Driver Registered!");
        } catch (ClassNotFoundException e){
            System.err.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        }
    }

    public Connection openConnection(){
        try{
//            establish connection
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Connection Successfull!!");
        }catch (SQLException e){
            System.out.println("Connection failed");
            e.printStackTrace();
        }
        return connection;
    }
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Connection closed successfully!");
            } catch (SQLException e) {
                System.err.println("Failed to close connection!");
                e.printStackTrace();
            }
        }
    }
}
