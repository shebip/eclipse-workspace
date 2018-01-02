package in.vamsoft.customer;

public class Customer {

  int customerId;
  String customerName;
  int contactNo;

  public Customer(int customerId, String customerName, int contactNo) {
    super();
    this.customerId = customerId;
    this.customerName = customerName;
    this.contactNo = contactNo;
  }

  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public int getContactNo() {
    return contactNo;
  }

  public void setContactNo(int contactNo) {
    this.contactNo = contactNo;
  }

  @Override
  public String toString() {
    return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", contactNo=" + contactNo + "]";
  }

}
