import electricity.MySQLConnection;

import java.sql.Connection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main ( String[] args ) {

        MySQLConnection mySQLConnection = new MySQLConnection();
        Connection connection = mySQLConnection.openConnection();


    }
}