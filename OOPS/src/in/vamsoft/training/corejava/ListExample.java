package in.vamsoft.training.corejava;
import java.util.*;  
public class ListExample{  
public static void main(String args[]){ 


  
  List<Integer> al=new ArrayList<Integer>();  
  al.add(1);
  al.add(2);
  al.add(3);
  al.add(4);
  al.add(5);
  System.out.println(al);
  Iterator itr=al.iterator();
  while(itr.hasNext()) {
  	System.out.println(itr.next());
  	List<Integer> al2=new ArrayList<Integer>(al.subList(1, 4));
    System.out.println("SubList stored in ArrayList: "+al2);
  	
  }
 
  }  
   
}
