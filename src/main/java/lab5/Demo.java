package lab5;

import java.sql.*;

public class Demo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/devices";
        String username = "root";
        String password = "admin";
        DBStructureService service = new DBStructureService(url,username,password);
        service.getConnection();
        service.createAllTables();
        service.dropAllTables();
    }
}
