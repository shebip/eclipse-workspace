package in.vamsoft.assignment.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author vamsoft This class is used to display all 
 *         employee details .
 *
 */
public class JdbcSelect {

  /**
   * @param args
   *          used for getting command line arguments.
   */
  public static void main(String[] args) {

    Connection con = DbConnection.getConnection();
    Statement st;
    try {
      st = con.createStatement();
      ResultSet rs = st.executeQuery("select * from employees");
      while (rs.next()) {
        System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
      }

    } catch (SQLException e) {

      System.err.println("Error" + e);

    }

  }

}
