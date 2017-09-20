package in.vamsoft.training.oops;

public class SportsCar extends Car {

  public SportsCar(String model) {
	System.out.println("SportsCar.SportsCar()");
	System.out.println(model);
  }

  public SportsCar() {
	System.out.println("SportsCar.SportsCar()");
  }

  public void fourWheelDrive() {
	System.out.println("SportsCar.fourWheelDrive()");
  }

  public void stop() {
	System.out.println("SportsCar.stop()");
  }

  public void brake() {
	System.out.println("SportsCar.brake()");
  }
}
