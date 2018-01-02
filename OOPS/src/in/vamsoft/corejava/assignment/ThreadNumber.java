package in.vamsoft.corejava.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThreadNumber extends Thread {
	FactorialThread ft;
	int num;

	public FactorialThread getFt() {
		return ft;
	}

	public void setFt(FactorialThread ft) {
		this.ft = ft;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public void run() {
	
		try {
			Scanner s=new Scanner(new File("/home/vamsoft/Desktop/New/Number.txt"));
			while(s.hasNextLine())
			{
				
				num=s.nextInt();
				synchronized (ft) {

					ft.notify();
				}
				
				
			}s.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}