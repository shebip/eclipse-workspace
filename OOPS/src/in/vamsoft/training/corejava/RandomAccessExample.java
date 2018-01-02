package in.vamsoft.training.corejava;

import java.io.RandomAccessFile;

public class RandomAccessExample {
	/*RandomAcessFile
	 * 
	 */
	public static void main(String[] args) {
		try {
			RandomAccessFile randomAccessFile= new RandomAccessFile("/home/vamsoft/Desktop/New/randomfile.txt", "rw");
			randomAccessFile.write("hello how are you".getBytes());
			randomAccessFile.seek(5);
			int c;
			while((c=randomAccessFile.read())!=-1) {
				System.out.println((char)c);
			}
		randomAccessFile.seek(randomAccessFile.length());
		randomAccessFile.write("Appending to files".getBytes());
		System.out.println();
		randomAccessFile.seek(0);
		while((c=randomAccessFile.read())!=-1) {
			System.out.println((char)c);
		}
		
	}catch (Exception e) {
		// TODO: handle exception
	}
	

}
}
