package in.vamsoft.loginexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseUtils {
  /**
   * Method to insert values in database.
   * @param fname to store firstname.
   * @param lname to store lastname.
   * @param email to store email.
   * @param password to store password.
   */

  public void addDetails(String fname, String lname, String email, String password) {

    try {
      Class.forName("org.postgresql.Driver");
      Connection con = DriverManager.getConnection("jdbc:postgresql:"
          + "//192.168.10.123:5432/shebidb", "shebivam",
          "$HEBI123");
      System.out.println("Connection Established");
      PreparedStatement st = con.prepareStatement("insert into UserCreation(firstname,"
          + "lastname,email,password) values(?,?,?,?)");

      st.setString(1, fname);
      st.setString(2, lname);
      st.setString(3, email);
      st.setString(4, password);

      int rs2 = st.executeUpdate();
      con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
