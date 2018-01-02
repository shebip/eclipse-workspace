package in.vamsoft.miniproject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BookStoreOnline {
  public static void main(String[] args)

  {
   /* Set<Integer> set=new TreeSet<>();
    set.add(1);
    set.add(2);
    
    System.out.println(set.toString());
    
    List<Integer> list= Arrays.asList(1,2,3);
    
    System.out.println(list);
    
    HashMap<Integer, String> map = new HashMap<>();
    map.put(100, "Two States");
    map.put(200, "Harry Potter");
    map.put(300, "Half Girlfriend");
    System.out.println(map);*/

    HashMap<String,Integer> map1=new HashMap<>();
    map1.put("Ajith", 100);
    map1.put("Ajith", 200);
    map1.put("Ajith", 300);
    map1.put(null, 400);
    map1.put(null, 500);
    map1.put(null, 600);
    System.out.println(map1);
    /*// forEach loop
    for (HashMap.Entry<Integer, String> m : map.entrySet()) {
      System.out.println(""+map.entrySet());
    
      System.out.println(m.getKey() + " " + m.getValue());
    }

    // Lambda expression
    map.forEach((Integer, String) -> System.out.println(Integer + ", " + String));

    // String s1 = scanner.nextLine();
    while (true) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the book you want");
      int select=Integer.parseInt(scanner.next());
      String book=map.get(select);
      System.out.println(book);
      System.out.println("You have selected ");
      
    }*/
    
  }
}