package in.vamsoft.training.corejava;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferwithFileChannel {

	public static void main(String[] args) throws IOException {
		RandomAccessFile afile=new RandomAccessFile("/home/vamsoft/Desktop/New/myfile.txt","rw");
		FileChannel inChannel=afile.getChannel();
	
		//create buffer with capacity 48 bytes
		ByteBuffer buf=ByteBuffer.allocate(10);
		
		int bytesRead=inChannel.read(buf);
		while(bytesRead != -1)
		{
			buf.flip(); //read from file write into buffer
			
			while(buf.hasRemaining()) {
				System.out.println((char) buf.get());//read 1 byte at a time
			}
			
			buf.clear();//make buffer ready for writing
			bytesRead=inChannel.read(buf);
		}
		afile.close();

	}

}
