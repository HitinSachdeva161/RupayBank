/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class db {
    Statement stmt;
    ResultSet rs;
    Connection con;
    
    db()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost/dbbank";
            con=DriverManager.getConnection(url,"root","root");
            stmt=con.createStatement();
        }
        catch(Exception e)
        {
          System.out.println(e);
        }
    }
   public void update(String qry) throws Exception 
   {
     stmt.executeUpdate(qry);
   }
   public ResultSet execute(String qry) throws Exception 
   {
     rs=stmt.executeQuery(qry);
     return rs;
   }  
}
