package in.vamsoft.exception;

public class ArrayIndexOutOfBounceExample {
  public static void main(String[] args) {
  
  try {
  int arr[]=new int[6];
  int i=arr[6];
  }catch(ArrayIndexOutOfBoundsException a) {
    System.out.println("Array Index is Out of Bounce");
  }
 
}
}