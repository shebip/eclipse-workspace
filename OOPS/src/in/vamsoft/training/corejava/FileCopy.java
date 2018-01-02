package in.vamsoft.training.corejava;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("");
				FileOutputStream fos=new FileOutputStream("");)
				
				{
					int c=0;
					while((c=fis.read())!=-1){
						fos.write(c);
						
					}
					System.out.println("File Copied");
				}
				catch (Exception e) {
					e.printStackTrace();
				}

	}

}
