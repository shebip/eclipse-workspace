package in.vamsoft.corejava.assignment;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Engineer e=new Engineer(101, "Shebi", "123-456-78", 10000);
		Manager m=new Manager(102, "Abi", "054-12-345", 20000,"IT");
		Admin a=new Admin(103, "Akash", "108-23-34", 30000);
		Director d=new Director(104, "Admiral", "109-567", 40000,"Global marketing",1000000);
    EmployeeTest et=new EmployeeTest();
    et.printEmployee(e);
  	et.printEmployee(m);
  	et.printEmployee(a);
  	et.printEmployee(d);
  	e.raiseSalary(1000.0);
    		
	}
	public void printEmployee(Employee h)
	{
		System.out.println(h);
		
	}

}
