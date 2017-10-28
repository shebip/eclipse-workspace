package in.vamsoft.training.corejava;

import java.util.*;  
class SalComparator implements Comparator<Employee>{  
public int compare(Employee e1,Employee e2){  
if(e1.Salary==e2.Salary)  
return 0;  
else if(e1.Salary>e2.Salary)  
return 1;  
else  
return -1;  
}  
}  
public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Employee> treeSet=new TreeSet<>();
	}

}
