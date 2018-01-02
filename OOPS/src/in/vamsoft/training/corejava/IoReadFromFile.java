package in.vamsoft.training.corejava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoReadFromFile {

	 
	    public static void main(String[] args) {
	        try {
	        	  BufferedReader consoleRead=new BufferedReader(new InputStreamReader(System.in));
	            BufferedWriter writer = new BufferedWriter(new FileWriter("myfile.txt",true));
	            BufferedReader reader=new BufferedReader(new FileReader("myfile.txt"));{
	            	
	            System.out.println("Please enter youre name");
	            String name=consoleRead.readLine();
	            writer.write("Name"+name);
	            writer.newLine();
	            
	            System.out.println("Please enter youre age");
	            String age=consoleRead.readLine();
	            writer.write("Age"+age);
	            writer.newLine();
	            }
	            consoleRead.close();
	            writer.close();
	            
	            String data="";
	            System.out.println("The data you ve entered in");
	            while((data=reader.readLine())!=null) {
	            	System.out.println(data);
	            	
	            	
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 
	    
	 
	}

}
