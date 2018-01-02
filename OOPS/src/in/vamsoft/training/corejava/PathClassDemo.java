package in.vamsoft.training.corejava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathClassDemo {

	public static void main(String[] args) {
		Path p = Paths.get("/home/vamsoft/Desktop/New/number.txt");
		Path p1 = Paths.get("/home/vamsoft/Desktop/New/number.txt");
		System.out.println("paths Equal" +p.equals(p1));
		System.out.println("Executing path methods");
		System.out.println("File Name"+p.getFileName());
		System.out.println("File System" +p.getFileSystem());
		System.out.println("patent" +p.getParent());
		System.out.println("Name Count" +p.getNameCount());
		System.out.println("Root" +p.getRoot());
		System.out.println("Name at subscript" +p.getName(1));
		System.out.println("Finished executing Path methods");
		
		Path destPath=Paths.get("/home/vamsoft/Desktop/New/test.txt");
		try {
			Files.copy(p,destPath, StandardCopyOption.REPLACE_EXISTING,
					StandardCopyOption.COPY_ATTRIBUTES);
			System.out.println("File Copied");
			}catch(IOException e) {
				e.printStackTrace();
			}

	}

}
