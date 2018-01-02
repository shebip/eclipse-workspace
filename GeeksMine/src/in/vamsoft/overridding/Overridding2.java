package in.vamsoft.overridding;

class Vehicle {
  void run() {
    System.out.println("Vehicle is running");
  }
}

class Overridding2 extends Vehicle {
  void run() {
    System.out.println("Bike is running safely");
  }

  public static void main(String args[]) {
    Overridding2 obj = new Overridding2();
    obj.run();
    Vehicle v = new Vehicle();

    v.run();
  }
}