package in.vamsoft.enums;

public class EnumExample1 {
  enum Color {
    RED, BLUE, PINK, SILVER, GREY, BLACK;
    // enum constructor called separately for each
    // constant
    private Color() {
      System.out.println("Constructor called for : " + this.toString());
    }

    // Only concrete (not abstract) methods allowed
    public void colorInfo() {
      System.out.println("Universal Color");
    }
  }

  public static void main(String[] args) {
    Color c1 = Color.RED;
    System.out.println(c1);
    c1.colorInfo();
    System.out.println(Color.BLUE);
    Color arr[] = Color.values();
    System.out.println(Color.values());
    for (Color col : arr) {
      System.out.println(col + "at Index" + col.ordinal());
    }
    System.out.println(Color.valueOf("RED"));
  }
}
