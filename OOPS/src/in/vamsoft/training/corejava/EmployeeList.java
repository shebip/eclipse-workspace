package in.vamsoft.training.corejava;

public class EmployeeList {
 int empId;
 String empName;
 double Salary;
public EmployeeList(int empId, String empName, double salary) {
	super();
	this.empId = empId;
	this.empName = empName;
	Salary = salary;
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
	return Salary;
}
public void setSalary(double salary) {
	Salary = salary;
}
}
