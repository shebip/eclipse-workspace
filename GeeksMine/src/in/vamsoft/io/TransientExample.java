 package in.vamsoft.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientExample implements Serializable {
 
  
  // Normal variables
  int i = 10, j = 20;

  // Transient variables
  transient int k = 30;

  // Use of transient has no impact here
  transient static int l = 40;
  transient final int m = 50;

  public static void main(String[] args) throws Exception {
    TransientExample input = new TransientExample();

    // serialization
    FileOutputStream fos = new FileOutputStream("/home/vamsoft/Desktop/New/abc.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(input);

    // de-serialization
    FileInputStream fis = new FileInputStream("/home/vamsoft/Desktop/New/abc.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);
    TransientExample output = (TransientExample) ois.readObject();
    System.out.println("i = " + output.i);
    System.out.println("j = " + output.j);
    System.out.println("k = " + output.k);
    System.out.println("l = " + output.l);
    System.out.println("m = " + output.m);
  }
}