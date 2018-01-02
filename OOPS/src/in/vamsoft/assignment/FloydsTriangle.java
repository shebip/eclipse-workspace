package in.vamsoft.assignment;

public class FloydsTriangle {
  public void floyd() {
    int i, j, val = 1;
    for (i=1; i<=4; i++)
    {
        for (j=1; j<=i; j++){
          System.out.print(val+" ");
          val++;
        }
        System.out.println();
    }
  }
  public void floyd1() {
    int i, j, val = 1;
    for (i=1; i<=4; i++)
    {
        for (j=1; j<=i; j++){
          System.out.print(i+" ");
          val++;
        }
        System.out.println();
    }
  }
  public void floyd2() {
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= i; j++) {
          if ((i + j) % 2 == 0) {
              System.out.print("1 ");
          } else {
              System.out.print("0 ");
          }
      }
      System.out.println();
  }
  }
  

}
