package in.vamsoft.test;

import in.vamsoft.customer.CustomerDao;
import in.vamsoft.customer.CustomerDaoFactory;

public class CustomerTest {

  public static void main(String[] args) {
    CustomerDao ob=CustomerDaoFactory.getInstance();
    ob.addCustomer();

  }

}
