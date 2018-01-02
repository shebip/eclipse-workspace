package in.vamsoft.geeks.inheritance;

public class Vehicle {
  String engine;
  int wheel;
 
 
  public Vehicle(String engine, int wheel) {
    
    super();
    System.out.println(wheel);
    System.out.println("I am in Vehicle");
    this.engine = engine;
    this.wheel = wheel;
  }
  public String getEngine() {
    System.out.println("Vehicle.getEngine()");
    return engine;
  }
  public void setEngine(String engine) {
    this.engine = engine;
  }
  public int getWheel() {
    System.out.println("Vehicle.getWheel()");
    return wheel;
  }
  public void setWheel(int wheel) {
    this.wheel = wheel;
  }
  
  @Override
  public String toString() {
    return "Vehicle [engine=" + engine + ", wheel=" + wheel + "]";
  }
  
}
