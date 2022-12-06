package lab6;

import lab1.components.CPU;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class CPUService {
    //TODO: create(insert into table)
    //update values into ROw
    //delete row

    final String url;
    final String username;
    final String password;
    final Connection connection;
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(url,username,password);
    }
    CPUService(String url, String username, String password) throws SQLException, ClassNotFoundException {
        this.url = url;
        this.username = username;
        this.password = password;
        connection = getConnection();
    }
    /*void create(CPU cpu)
    {

    }*/

//    void update(long id, CPU cpu)
    /*void remove(long id)
    {

    }*/
    /*List<CPU> selectAll()
    {

    }*/
}
