package in.vamsoft.training.corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoDemo {
	public static void main(String[] args) throws IOException {
		
	  String option = null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do {
		System.out.println("Enter Text");
	
			
			String name=br.readLine();
			System.out.println(" "+name);
			System.out.println("Do you want to continue");
		}
		  while(option.equalsIgnoreCase("continue"));
			br.close();
		

	}
}
			
			
		
		

