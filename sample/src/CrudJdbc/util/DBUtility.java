package CrudJdbc.util;

import java.sql.Connection;
import java.sql.SQLException;
public class DBUtility {
    public static String username="root";
    public static String password="root";
    public static String url="jdbc:mysql://127.0.0.1:3306/training";
    public static Connection con=null;
    
    public static Connection getDBConnection() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return con;        
    }
    
    public void getDBClosed() throws SQLException {
        con.close();        
    }
}