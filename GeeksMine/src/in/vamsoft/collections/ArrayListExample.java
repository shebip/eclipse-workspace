package in.vamsoft.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

public class ArrayListExample {

  public static void main(String[] args) {
    ArrayList<String> list=new ArrayList<String>();
    list.add("abi");
    list.add("akash");
    list.add("akash");
    
    Iterator itr=list.iterator();
    while(itr.hasNext()) {
      System.out.println(itr.next());
    }
    for(String obj:list)  
      System.out.println(obj);  
    PriorityQueue<String> queue=new PriorityQueue<String>();  
    queue.add("Amit"); 
   // System.out.println(""                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  );
     
  }

}
