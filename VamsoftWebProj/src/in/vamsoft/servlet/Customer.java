package in.vamsoft.servlet;

import java.time.LocalDate;

public class Customer {
  
 
  String customerName;
  LocalDate dob;
  String address;
  String phoneno;
  String gender;
  String hobby;
  public Customer(String customerName, LocalDate dob, String address, String phoneno, String gender, String hobby) {
    super();
    this.customerName = customerName;
    this.dob = dob;
    this.address = address;
    this.phoneno = phoneno;
    this.gender = gender;
    this.hobby = hobby;
  }
  public Customer() {
    super();
    // TODO Auto-generated constructor stub
  }
  public String getCustomerName() {
    return customerName;
  }
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }
  public LocalDate getDob() {
    return dob;
  }
  public void setDob(LocalDate dob) {
    this.dob = dob;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public String getPhoneno() {
    return phoneno;
  }
  public void setPhoneno(String phoneno) {
    this.phoneno = phoneno;
  }
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }
  public String getHobby() {
    return hobby;
  }
  public void setHobby(String hobby) {
    this.hobby = hobby;
  }

  
}
