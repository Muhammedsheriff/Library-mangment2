/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylibrary;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author dell
 */
public class mylibrary {
    public Connection newConnection ()
    { 
   Connection con = null ;
   Statement st ;
   ResultSet rs ; 
   String url ="jdbc:ucanaccess://E:\\Library OOP\\Database7.accdb ";
   try{
    con=DriverManager.getConnection(url);
    st=con.createStatement();
    String sql = "Select * from owner";
    rs=st.executeQuery(sql);
    while(rs.next())
    {
     String id,pass,name ;   
     id=rs.getString("ID");
     pass=rs.getString("password");
     name=rs.getString("Name");
     
   System.out.println(id+" "+pass+" "+name); 
    }
    }    
   catch(Exception sqlEx )
   {
 System.out.print(sqlEx);
   }
   return con;
}

}



