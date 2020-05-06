package pack1;

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
		BufferedReader Reader = null;    //Khá»Ÿi táº¡o Ä‘á»‘i tÆ°á»£ng nháº­n vÃ  Ä‘á»�c file trong thÆ° viá»‡n BufferedReader
		String line = null;
		try {
			FileInput = new FileInputStream(File);
			Reader = new BufferedReader(new InputStreamReader(FileInput));
			
			line = Reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = Reader.readLine();
			}
		}catch(FileNotFoundException ex){
			System.err.println("cÃ³ lá»—i xáº£y ra");
		}
		finally {
			try {
				FileInput.close();
				Reader.close();
			}catch(FileNotFoundException ex){
				System.out.println("Lá»—i");
			}
		}
		
		return line;
	}
}
