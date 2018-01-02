package in.vamsoft.basics;

public class TypeConversionExample {
  public static void main(String[] args) {
    int i1=100;
    long l=i1;
    float f=l;
    System.out.println(i1);
    System.out.println(l);
    System.out.println(f);
    
    
   //EXPLICIT
    
    double d = 100.04; 
    long l1=(long) d;
    outer: //label for outer loop
      for (int i = 0; i < 10; i++) { 
        for (int j = 0; j < 10; j++) {
          if (j == 1)
            break outer;
          System.out.println(" value of j = " + j);
        }
      }
  }

}
