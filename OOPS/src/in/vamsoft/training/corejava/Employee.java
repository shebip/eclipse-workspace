package in.vamsoft.training.corejava;


public class Employee {
  
  
  private int empCode;
  String empName;
  double Salary;
 
  
  public Employee(int empCode, String empName, double salary) {
    super();
    this.empCode = empCode;
    this.empName = empName;
    Salary = salary;
  }
  public String getEmpName() {
    return empName;
  }
  public void setEmpName(String empName) {
    this.empName = empName;
  }
  public double getSalary() {
    return Salary;
  }
  public void setSalary(double salary) {
    Salary = salary;
  }
  public int getEmpCode() {
    return empCode;
  }
 /*public void increment(double salary) {
   if(salary>=0.10) {
     System.out.println(salary);
   }
   else {
     System.out.println("Salary should be greater than  10%");
   }
    
 }*/



  
  
  
}
