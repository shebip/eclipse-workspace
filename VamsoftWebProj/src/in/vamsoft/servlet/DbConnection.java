package in.vamsoft.servlet;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {

  static Connection con;

  public static Connection getConnection() {
    
    
    try {
      InputStream in=DbConnection.class.getClassLoader().getResourceAsStream("/home/vamsoft/Desktop/db.properties");
   
    Properties properties=new Properties();
    properties.load(in);
    String driver=properties.getProperty("driver");
    String url=properties.getProperty("url");
    String username=properties.getProperty("username");
    String password=properties.getProperty("password");
    Class.forName(driver);
    con=DriverManager.getConnection(url,username,password);
    return con;
   
    } catch (ClassNotFoundException | IOException | SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return null;
    
  }
  public static void closeConnection()
  {
    try {
      con.close();
    } catch (SQLException e) {
      System.err.println("Connection not Closed");
    }
  }
  

}
