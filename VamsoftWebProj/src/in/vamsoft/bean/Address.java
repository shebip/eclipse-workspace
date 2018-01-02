package in.vamsoft.bean;

public class Address {
  String houseNo;
  String city;

  public Address(String houseNo, String city) {
    super();
    this.houseNo = houseNo;
    this.city = city;
  }


  public Address() {
    // TODO Auto-generated constructor stub
  }

  public String getHouseNo() {
    return houseNo;
  }

  public void setHouseNo(String houseNo) {
    this.houseNo = houseNo;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Override
  public String toString() {
    return "Address [houseNo=" + houseNo + ", city=" + city + "]";
  }

}

