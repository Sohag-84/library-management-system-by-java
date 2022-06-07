package lms;

import java.sql.*;

public class ConnectionProvider {
  public static Connection getCon(){
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
          return con;
      }catch(ClassNotFoundException | SQLException e){
          return null;
      }
  }  
}
