package bai_tap_lon;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

/*
 * Try hard with Library BufferedReader
 */
public class File1 {
	public static String MoFile(String File) throws IOException  {
		FileInputStream FileInput = null;
		BufferedReader Reader = null;    //Khởi tạo đối tượng nhận và đọc file trong thư viện BufferedReader
		
		try {
			FileInput = new FileInputStream(File);
			Reader = new BufferedReader(new InputStreamReader(FileInput));
			
			String line = Reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = Reader.readLine();
			}
		}catch(FileNotFoundException ex){
			System.err.println("có lỗi xảy ra");
		}
		finally {
			try {
				FileInput.close();
				Reader.close();
			}catch(FileNotFoundException ex){
				System.out.println("Lỗi");
			}
		}
		return line;
	}
}
