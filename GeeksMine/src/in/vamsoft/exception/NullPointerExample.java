package in.vamsoft.exception;

public class NullPointerExample {

  public static void main(String[] args) {
    try {
    String s=null;
    System.out.println(s.length()); 
    }catch(NullPointerException e){
      System.out.println("NullPointer excception is caught");
    }
  }

}
