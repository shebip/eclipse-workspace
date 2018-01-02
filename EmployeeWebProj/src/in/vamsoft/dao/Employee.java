package in.vamsoft.dao;

public class Employee {
  int deptId;
  String empName;
  double salary;
  public Employee(int deptId, String empName, double salary) {
    super();
    this.deptId = deptId;
    this.empName = empName;
    this.salary = salary;
  }
  public Employee() {
    // TODO Auto-generated constructor stub
  }
  public int getDeptId() {
    return deptId;
  }
  public void setDeptId(int deptId) {
    this.deptId = deptId;
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
  @Override
  public String toString() {
    return "Employee [deptId=" + deptId + ", empName=" + empName + ", salary=" + salary + "]";
  }

}
