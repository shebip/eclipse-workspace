package in.vamsoft.assignment.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MetaDataInfo {

  /**
   * @param args
   *          used to get Values from the command line.
   */
  public static void main(String[] args) {

    Connection con = DbConnection.getConnection();
    try {
      DatabaseMetaData metaData = con.getMetaData();
      System.out.println(metaData.getDriverName());
      System.out.println(metaData.getDatabaseProductName());
      System.out.println(metaData.getDatabaseMajorVersion());
      System.out.println(metaData.getUserName());
      System.out.println(metaData.getMaxUserNameLength());
      System.out.println(metaData.getCatalogs());

    } catch (SQLException e) {

      System.err.println("No Meta data Found");

    }

  }

}
