package in.vamsoft.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFromFile {
  /*
   * Program to read from file.
   */
  public static void main(String[] args) {

    try {
      InputStream inputstream = new FileInputStream("/home/vamsoft/Desktop/New/readfromfile.txt");
      int i = -1;
      while ((i = inputstream.read()) != -1) {
        System.out.println(i + "  " + (char) i);
      }
      inputstream.close();

    } catch (FileNotFoundException e) {
      System.out.println("File you have search is not found");
    } catch (Exception e) {

      System.out.println("");
    }
  }

}
