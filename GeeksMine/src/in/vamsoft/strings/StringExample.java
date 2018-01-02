package in.vamsoft.strings;

public class StringExample {
  public static void main(String[] args) {
    
    //StringExample s= new StringExample();
    String s1="My String Example";
    System.out.println(s1.length());
    System.out.println(s1.charAt(4));
    System.out.println(s1.substring(7, 9));
    System.out.println(s1.indexOf(s1));
    System.out.println(s1.hashCode());
    System.out.println(s1.endsWith("e"));
    System.out.println(s1.substring(3,8));
    System.out.println(s1.concat("shebi"));
  }

}
