package in.vamsoft.customer;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DatabaseConnection {
  static Connection con;
  public static Connection getConnection() {
    try {
      FileReader reader=new FileReader("src/db.properties");
      Properties properties=new Properties();
      properties.load(reader);
      String driver=properties.getProperty("driver");
      String url=properties.getProperty("url");
      String username=properties.getProperty("username");
      String password=properties.getProperty("password");
      Class.forName(driver);
      con = DriverManager.getConnection(url, username, password);
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    return con;
    
  }
  

}
