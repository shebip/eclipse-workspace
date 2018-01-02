package in.vamsoft.strings;

import java.util.StringTokenizer;

public class StringBufferExample {
  public static void main(String[] args) {
    StringBuffer buffer=new StringBuffer("Shebi");
    int p=buffer.length();
    int q=buffer.capacity();
    System.out.println(p);
    System.out.println(q);
    // To append String
    System.out.println(buffer.append("Pushparaj"));
    System.out.println(buffer.reverse());
    System.out.println(buffer.reverse());
    System.out.println(buffer.delete(0,3));
    //Comparing string values
    String s1="shebi";
    String s2="shebi";
    String s3= new String("shebi");
    String s4= new String("shebi");
    String s5="abi";
    
    System.out.println("Comparing with equals");
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s1.equals(s5));
    
    System.out.println("Comparing with =");
    System.out.println(s1==s2);
    System.out.println(s1==s3);
    System.out.println(s1==s5);
    
    System.out.println("Comparing with CompareTo");
    System.out.println(s1.compareTo(s3));
    System.out.println(s1.compareTo(s2));
    
    
  }

}
