package in.vamsoft.java.dao;

public class Details { 
  private int id;
  private String name,address;
  private int age;
  
  public Details(int id, String name, String address, int age) {
    super();
    this.id = id;
    this.name = name;
    this.address = address;
    this.age = age;
  }
 
  public Details() {
    // TODO Auto-generated constructor stub
  }

  public String getName() {
    return name;
  }
  public String getAddress() {
    return address;
  }
  public int getId() {
    return id;
  }
  public int getAge() {
    return age;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public void setId(int id) {
    this.id = id;
  }
  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Details [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + "]";
  }
  
  

}
