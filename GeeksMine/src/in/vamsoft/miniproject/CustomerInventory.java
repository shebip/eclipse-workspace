package in.vamsoft.miniproject;

public class CustomerInventory {
  int customerId;
  String customerName;
  
  public CustomerInventory(int customerId, String customerName) {
    super();
    this.customerId = customerId;
    this.customerName = customerName;
  }
  public int getCustomerId() {
    return customerId;
  }
  public String getCustomerName() {
    return customerName;
  }
  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }
  @Override
  public String toString() {
    return "CustomerInventory [customerId=" + customerId + ", customerName=" + customerName + "]";
  }

}
