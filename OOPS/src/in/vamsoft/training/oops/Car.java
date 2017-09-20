package in.vamsoft.training.oops;

public abstract class Car extends Vehicle {

  public Car() {
    System.out.println("Car.Car()");
  }

  public void handBrake() {
    System.out.println("Car.handBrake()");
  }

  public void start() {
    System.out.println("Car.start()");
  }
}
