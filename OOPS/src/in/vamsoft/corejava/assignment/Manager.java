package in.vamsoft.corejava.assignment;

public class Manager extends Employee{
	private String deptName;
	String[] staff=new String[20];
	private int empCount=0;

	public Manager(int empId, String name, String ssn, double salary, String deptName) {
		super(empId, name, ssn, salary);
		this.deptName = deptName;
	}

	public Manager(int empId, String name, String ssn, double salary) {
		super(empId, name, ssn, salary);
		// TODO Auto-generated constructor stub
	}

	public String getDeptName() {
		return deptName;
	}
	
	

}
