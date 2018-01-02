package in.vamsoft.customer;

public class CustomerDaoFactory {
  
  public static CustomerDao getInstance() {
    
    CustomerDao ob=new CustomerDaoImpl();
    return ob;
    
    
  }
}
