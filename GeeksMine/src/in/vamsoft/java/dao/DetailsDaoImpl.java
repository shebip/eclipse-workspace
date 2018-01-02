package in.vamsoft.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DetailsDaoImpl implements DetailsDao{

  @Override
  public void addDetails() {
  System.out.println("Inside add method");
  List<Details> list=new ArrayList<Details>();
  list.add(new Details(1,"shebi","chennai",22));
  list.add(new Details(2,"abi","chennai",20));
  for(Details d:list) {
    System.out.println(list);
  }
  }

  @Override
  public void viewFromDb() {
    try {
      Class.forName("org.postgresql.Driver");
      System.out.println("DB check");
      Connection con=DriverManager.getConnection("jdbc:postgresql://192.168.10.123:5432/shebidb","shebivam","$HEBI123");
      System.out.println("Opened database successfully");
      Statement stmt = con.createStatement();
      String sql = "select * from details;";
      stmt.executeUpdate(sql);
      con.close();
    }
    catch(Exception e) {
      e.getMessage();
    }
    
  }
  

}
