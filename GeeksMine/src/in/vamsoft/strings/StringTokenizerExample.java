package in.vamsoft.strings;

import java.util.StringTokenizer;

public class StringTokenizerExample {

  public static void main(String[] args) {
    
    StringTokenizer str=new StringTokenizer("Hi how are you");
    while(str.hasMoreTokens())
    {
      System.out.println(str.nextToken());
    }
   
  }

}
