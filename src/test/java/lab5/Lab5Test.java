package lab5;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.Assert.assertEquals;
public class Lab5Test {
    @Test(dataProvider = "getConnectionTestProvider", expectedExceptions = SQLException.class)
    public void getConnectionTest(String url,String username,String password) throws SQLException, ClassNotFoundException {
        DBStructureService service = new DBStructureService(url,username,password);
        service.getConnection();
    }
    @DataProvider
    public Object[][] getConnectionTestProvider()
    {
        return new Object[][] {
                {"asdqwe","root","admin"},
                {"jdbc:mysql://localhost:3306/devices", "root", "1234"},
                {"jdbc:mysql://localhost:3306/devices", "asdqwe","admin"}
        };
    }
    @Test
    public void createTablesTest() throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/devices";
        String username = "root";
        String password = "admin";
        DBStructureService service = new DBStructureService(url,username,password);
        service.getConnection();
        service.createAllTables();
    }
    @Test
    public void dropTablesTest() throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/devices";
        String username = "root";
        String password = "admin";
        DBStructureService service = new DBStructureService(url,username,password);
        service.getConnection();
        service.dropAllTables();
    }
}
