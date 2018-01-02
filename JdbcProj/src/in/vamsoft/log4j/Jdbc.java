

package in.vamsoft.log4j;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class Jdbc {
  public static Logger logger = Logger.getLogger(FirstJdbcDemo.class);

  public static void main(String[] args) throws SQLException {
    logger.info("Main method execution started");
    Connection connection = null;
    ResultSetMetaData rs=null;
    

  }
}

