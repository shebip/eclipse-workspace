package DaoSample;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmployeeDaoMain {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter employee id");
		int empId=s.nextInt();
		System.out.println("Please enter name");
		String empName=s.next();
		System.out.println("Salary");
		Double salary=s.nextDouble();
		System.out.println("Please enter the date of join");
		LocalDate doj=LocalDate.parse(s.next(),DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println("Please enter the DeptId");
	  System.out.println("DeptId");
	  int deptId=s.nextInt(); 
		
		Employee emp=new Employee(empId, empName, salary, doj, deptId);
		EmployeeDao dao=null;
		try {
			dao = EmployeeDaoImplFactory.getEmployeeDaoImplobj(emp);
			dao.addEmployee(emp);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
}
