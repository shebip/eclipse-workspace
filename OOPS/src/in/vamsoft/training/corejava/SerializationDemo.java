package in.vamsoft.training.corejava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		/*Employee employee=new Employee(1, "shebi", 2000);
		ObjectOutputStream ob=new ObjectOutputStream(new FileOutputStream("obj.txt"));
		ob.writeObject(employee);
		System.out.println("Object written");*/
		
		ObjectInputStream obj=new ObjectInputStream(new FileInputStream("obj.txt"));
		Employee employee=(Employee) obj.readObject();
		System.out.println(employee);

	}

}
