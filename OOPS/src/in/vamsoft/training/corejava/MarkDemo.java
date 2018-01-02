package in.vamsoft.training.corejava;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MarkDemo {

	public static void main(String[] args) throws Exception{
		
		try(InputStream is = new BufferedInputStream(new FileInputStream("/home/vamsoft/Desktop/New/myfile1.txt"),1);){
		System.out.println("Characters printed");
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		
		is.mark(15);
		System.out.println("Mark() invoked");
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		if(is.markSupported())
		{
			is.reset();
			System.out.println("reset() is invoked");
			System.out.println((char)is.read());
			System.out.println((char)is.read());
			
		}
		else
		{
			System.out.println("Input stream is not supported");
		}

	}catch (Exception e) {
		e.printStackTrace();
	}
	}

	}
