package in.vamsoft.connection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class DbConnection {

  static Connection con = null;

  public static Connection getConnection() {
    try {
      FileReader reader = new FileReader("src/db.properties");
      Properties properties = new Properties();
      properties.load(reader);
      String driver = properties.getProperty("driver");
      String url = properties.getProperty("url");
      String username = properties.getProperty("username");
      String password = properties.getProperty("password");
      Class.forName(driver);
      con = DriverManager.getConnection(url, username, password);

    } catch (ClassNotFoundException | IOException | SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return con;
  }

}
