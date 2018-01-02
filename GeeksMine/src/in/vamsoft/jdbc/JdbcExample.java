package in.vamsoft.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcExample {
  
  public static void main(String[] args) {
    try {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.10.77:1521:xe","hr","password");
    PreparedStatement statement=con.prepareStatement("delete  from emp66 where rollno=4");
    int result=statement.executeUpdate();
    System.out.println("rows deleted"+result);
    con.close();
  
  } catch (Exception e) {
    System.out.println("Exception caught");
  }
   
}
}