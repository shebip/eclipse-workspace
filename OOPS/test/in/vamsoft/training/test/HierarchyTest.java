
package in.vamsoft.training.test;

import in.vamsoft.training.oops.Car;
import in.vamsoft.training.oops.SportsCar;

public class HierarchyTest {

	public static void main(String[] args) {

		SportsCar car = new SportsCar("suv");
		Car c1=new SportsCar();
		System.out.println(c1.toString());
		System.out.println(car);

	}

}
