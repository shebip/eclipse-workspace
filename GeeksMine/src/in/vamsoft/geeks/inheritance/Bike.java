package in.vamsoft.geeks.inheritance;

public class Bike extends Vehicle{

  String brake;
     public Bike(String engine, int wheel,String brake) {
    super(engine, wheel);
    System.out.println("Bike.Bike()");
    System.out.println(engine);
    System.out.println(brake);
    System.out.println(wheel);
    // TODO Auto-generated constructor stub
  }


 
  
public static void main(String[] args) {
 Vehicle v=new Vehicle("brake", 6);
 Bike b=new Bike("engine", 2, "brake");
 Vehicle vb=new Bike("brakeVb", 10, "brakeVb");
 
 
}
}
