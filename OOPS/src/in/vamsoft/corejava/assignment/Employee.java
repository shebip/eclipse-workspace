package in.vamsoft.corejava.assignment;

public class Employee {
 private int empId;
 private String name;
 private String ssn;
 private double salary;
 private String deptName;
 private double budget;
 public Employee(int empId, String name, String ssn, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}

public Employee() {
	System.out.println("Employee.Employee()");
}

public String getName() {
	return name;
}
public String getSsn() {
	return ssn;
}
public double getSalary() {
	return salary;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public void raiseSalary(double increase)
{
	if(salary>0) {
		salary+=increase;
		System.out.println("Increased salary"+salary);
	}
	
}



public Employee(int empId, String name, String ssn, double salary,String deptName,double budget) {
	super();
	this.empId = empId;
	this.name = name;
	this.ssn = ssn;
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", ssn=" + ssn + ", salary=" + salary + ", deptName="
			+ deptName + ", budget=" + budget + "]";
}

 
 
}

