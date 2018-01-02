package in.vamsoft.servlets;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class ConnectionManager {
  static Connection con;

  public static Connection getConnection() {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.10.77:1521:xe","hr","password");
      System.out.println("hi");
    } catch (ClassNotFoundException| SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return con;

  }

  public static boolean closeConnection() throws SQLException {
    con.close();
    return true;
  }

}