package in.vamsoft.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcStatement {

  public static void main(String[] args) {

    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");

      System.out.println("hi");
      Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.10.77:1521:xe", "hr", "password");
      Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
      ResultSet rs = st.executeQuery("select * from emp66");

      // int rs1=st.executeUpdate("delete from emp66");
      // System.out.println(""+rs1);

      while (rs.next()) {
        System.out.println(rs.getInt(1) + "" + rs.getString(2));
      }
      conn.close();

    } catch (Exception e) {

      e.printStackTrace();
      System.out.println("Class not found");
    }
  }

}
