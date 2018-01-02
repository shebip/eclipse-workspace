package in.vamsoft.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class DbUtils {
  Connection con;
  public DbUtils() {
    con=DbConnection.getConnection();
    try {
      PreparedStatement statement=con.prepareStatement("select * from empcopy");
      ResultSet rs=statement.executeQuery();
      while(rs.next()) {
        System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getDouble(3)+""+rs.getDate(4)+""+rs.getInt(5));
      }
      } catch (SQLException e) {
      System.out.println("Exception Caught");
      e.printStackTrace();
    }
    
    
  }

}
