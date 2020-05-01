package bai_tap_lon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File{
	public static String openFile(String DuongDan) throws IOException {
		StringBuilder bd = new StringBuilder();		//Khởi tạo đối tượng nhận và đọc file trong thư viện BufferedReader
		FileReader fl = new FileReader(DuongDan);		
		
		BufferedReader bf = new BufferedReader(fl);
		String doc = "";
		while ((doc = bf.readLine()) != null) {
			bd.append(doc);
			System.out.print(doc);
		}
		fl.close();
		fl.close();
	return bd.toString();
	}
}
