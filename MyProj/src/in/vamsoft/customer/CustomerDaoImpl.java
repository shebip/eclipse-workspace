package in.vamsoft.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerDaoImpl implements CustomerDao {

  @Override
  public void addCustomer() {
    Connection con=DatabaseConnection.getConnection();
    try {
      PreparedStatement ps= con.prepareStatement("insert into sam_cust values(?,?,?)");
      ps.setInt(1, 1);
      ps.setString(2, "Shebi");
      ps.setInt(3, 65464);
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    
    
   
  }

}
