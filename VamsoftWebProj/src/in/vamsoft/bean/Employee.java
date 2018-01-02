package in.vamsoft.bean;


import java.time.LocalDate;
import java.util.Date;

public class Employee {
  int empId;
  String empName;
  double salary;
  LocalDate doj;
  int deptId;
  Address add;
  public Employee(int empId, String empName, double salary, LocalDate doj, int deptId, Address add) {
    super();
    this.empId = empId;
    this.empName = empName;
    this.salary = salary;
    this.doj = doj;
    this.deptId = deptId;
    this.add = add;
  }
  public int getEmpId() {
    return empId;
  }
  public void setEmpId(int empId) {
    this.empId = empId;
  }
  public String getEmpName() {
    return empName;
  }
  public void setEmpName(String empName) {
    this.empName = empName;
  }
  public double getSalary() {
    return salary;
  }
  public void setSalary(double salary) {
    this.salary = salary;
  }
  public LocalDate getDoj() {
    return doj;
  }
  public void setDoj(LocalDate doj) {
    this.doj = doj;
  }
  public int getDeptId() {
    return deptId;
  }
  public void setDeptId(int deptId) {
    this.deptId = deptId;
  }
  public Address getAdd() {
    return add;
  }
  public void setAdd(Address add) {
    this.add = add;
  }
  
}