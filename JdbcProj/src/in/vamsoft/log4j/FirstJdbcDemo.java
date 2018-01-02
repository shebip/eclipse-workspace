package in.vamsoft.log4j;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class FirstJdbcDemo {
  public static Logger logger = Logger.getLogger(FirstJdbcDemo.class);

  public static void main(String[] args) {
    logger.info("Main method execution started");
    Connection connection = null;
    java.sql.Statement st=null;
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.10.77", "hr", "password");
      logger.info("connection done");
      st = connection.createStatement();
      ResultSet resultSet = st.executeQuery("select * from empshebi");
      while(resultSet.next());{
      	System.out.println(resultSet.getInt("empid"));
      	
      }
    } catch (ClassNotFoundException e) {
      logger.error("Error in loading database driver", e);
    } catch (SQLException e) {
      logger.error("Error while establishing the connection", e);
    } finally {
      try {
        connection.close();

      } catch (SQLException e) {
        logger.error("Error while closing connection", e);
      }
    }

  }
}
