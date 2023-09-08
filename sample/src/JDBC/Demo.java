package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step1        
        Class.forName("com.mysql.cj.jdbc.Driver");
        //step2
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/training","root","password");
        //step3 PreparedStatement 
        //PreparedStatement pst=con.prepareStatement("create table employee(empid int,empname varchar(20))");
        //step4
        //pst.execute();
        //step3 PreparedStatement 
        PreparedStatement pst=con.prepareStatement("update employee set empname=?  where empid=? ");
        pst.setString(1, "vijay kumar");
        pst.setInt(2,101);
        //step4
        pst.executeUpdate();
        //setp5
        con.close();
        System.out.println("Table is created successfully");
        
        
        
        
    }
}
