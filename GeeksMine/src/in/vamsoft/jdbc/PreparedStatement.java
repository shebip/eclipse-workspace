package in.vamsoft.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PreparedStatement {

  public static void main(String[] args) {

    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.10.77:1521:xe", "hr", "password");
      //PreparedStatement stmt=con.prepareStatement("insert into Emp values(?,?)");      
      } 
    catch (Exception e) {

      e.printStackTrace();
    }

  }

}
