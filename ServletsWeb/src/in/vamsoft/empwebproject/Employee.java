package in.vamsoft.empwebproject;

import java.util.Date;

public class Employee {
  
  int empid;
  String fname;
  double salary;
  Date doj;
  String deptid;
  public Employee(int empid, String fname, double salary, Date doj, String deptid) {
    super();
    this.empid = empid;
    this.fname = fname;
    this.salary = salary;
    this.doj = doj;
    this.deptid = deptid;
  }
  public int getEmpid() {
    return empid;
  }
  public void setEmpid(int empid) {
    this.empid = empid;
  }
  public String getFname() {
    return fname;
  }
  public void setFname(String fname) {
    this.fname = fname;
  }
  public double getSalary() {
    return salary;
  }
  public void setSalary(double salary) {
    this.salary = salary;
  }
  public Date getDoj() {
    return doj;
  }
  public void setDoj(Date doj) {
    this.doj = doj;
  }
  public String getDeptid() {
    return deptid;
  }
  public void setDeptid(String deptid) {
    this.deptid = deptid;
  }
  

}
