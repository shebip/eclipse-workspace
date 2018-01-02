package in.vamsoft.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementExample1 {

  public static void main(String[] args) {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.10.77","hr" , "password");
      Statement st=con.createStatement();
      int insert=st.executeUpdate("insert into emp66 values(4,'aji')");
      System.out.println("Rows Updated"+insert);
      int delete=st.executeUpdate("delete from emp66 where name='ani'");
      System.out.println("Deleted rows"+delete);
      //Also update command 
      con.close();
    }
    catch(Exception e) {
      System.out.println("Exception caught");
    }
  }
}