package in.vamsoft.strings;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerExample {
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList();
    al.add("shebi");
    al.add("abi");
    al.add("akash");
    
    
    //set empty value()method
    StringJoiner joiner = new StringJoiner(",");
    joiner.setEmptyValue("Is empty\n");
    
    //add() method
    System.out.println("Inside add()");
    joiner.add(al.get(0)).add(al.get(1));
    System.out.println(joiner);
    
    //length() method
    System.out.println("Length() method "+ joiner.length());
    StringJoiner joiner2=new StringJoiner(":");
    joiner2.add(al.get(1)).add(al.get(2));
    
    
    //merge() method
    System.out.println("Inside merge");
    joiner.merge(joiner2);
    
    
    //to string() method
    System.out.println("ToString method"+joiner.toString());
  }
}
