package in.vamsoft.loginexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class LoginCheck {

  static final Logger logger = Logger.getLogger(LoginCheck.class);

  /**
   * The validateLogin() used to whether user is valid or not.
   * 
   * @return database.
   */

  public int validateLogin() {
    try {
      Class.forName("org.postgresql.Driver");
      Connection connection = DriverManager.getConnection("jdbc:postgresql:"
          + "//192.168.10.123:5432/shebidb", "shebivam",
          "$HEBI123");

    } catch (SQLException | ClassNotFoundException e) {
      logger.error("Data you trying to retrieve is not found");
    }
    return 0;
  }

}
