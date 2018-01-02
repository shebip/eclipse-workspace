package in.vamsoft.servlet;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CustomerDao {
  
  static Connection con;
  
  public CustomerDao() {
    con=DbConnection.getConnection();
  }
  public int addCustomer(Customer e) {
    int status=0;
    try {

      System.out.println("Try block Executed");
     
      PreparedStatement prepare = con.prepareStatement("insert into customershebi values(?,?,?,?,?,?)");
      prepare.setString(1, e.getCustomerName());
      System.out.println("Prepare ststement executed");
      System.out.println("line 1");
    
      prepare.setDate(2, Date.valueOf(e.getDob()));
      System.out.println("line 2");
      prepare.setString(3, e.getAddress());
      System.out.println("line 3");
      prepare.setInt(4, Integer.parseInt(e.getPhoneno()));
      System.out.println("line 4");
      prepare.setString(5, e.getGender());
      System.out.println("line 5");
      prepare.setString(6, e.getHobby());
      System.out.println("line 6");
      prepare.executeUpdate();
      System.out.println("The Values Inserted Successfully");

    } catch (SQLException err) {

      System.out.println("The Values Are Not updated into the database");

    }
    return status;

  }
  


}
