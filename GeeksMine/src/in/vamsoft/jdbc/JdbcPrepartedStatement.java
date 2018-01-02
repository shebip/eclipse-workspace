package in.vamsoft.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcPrepartedStatement {

  public static void main(String[] args) {

    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.10.77:1521:xe", "hr", "password");
      PreparedStatement statement = con.prepareStatement("insert into emp66 values(?,?)");
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter id");
      int id = scanner.nextInt();
      System.out.println("Please enter name");
      String name = scanner.next();
      statement.setInt(1, id);
      statement.setString(2, name);
      statement.executeUpdate();
      System.out.println("Data inserted successfully");
      Statement st = con.createStatement();
      ResultSet rs2 = st.executeQuery("select * from emp66");
      System.out.println("hi");
      while (rs2.next()) {
        System.out.println(rs2.getInt(1) + "" + rs2.getString(2));
      }
      System.out.println("data retreived from table");

    } catch (Exception e) {
      System.out.println("Driver not found");
    }

  }
}
