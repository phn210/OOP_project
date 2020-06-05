package bai_tap_lon;

import java.io.File;  
import java.io.FileWriter;
import java.io.IOException; 
import java.io.BufferedReader;
import java.io.FileReader;

public class FileTxt{
	String Result = "D:\\StudyIT\\Java\\Result.txt";

	SanGiaoDich sdg = new SanGiaoDich();
	
	public FileTxt() {
	}
	
	//Mở file
	protected void openFile (String DuongDan) throws IOException {
		FileReader fr = new FileReader(DuongDan);
		String line = "";

		try(BufferedReader br = new BufferedReader(fr);){
		//Gán thuộc tính
		while ((line = br.readLine()) != null) {
			String A[] = line.split(",");
			sdg.dscp.add(new CoPhieu(A));

		}}catch(IOException e){
		System.out.println("Có lỗi");
			fr.close();
	    }
		System.out.println("Truyền dữ liệu thành công.");
    }
	
	//Tạo file
	protected void createNewFile() {
		 File file = new File(Result);
			try {
				if (file.createNewFile() == true) {
					System.out.println("Đã tạo File!!!");
					System.out.println("Hãy truy cập: D:\\StudyIT\\Java\\Result.txt ");
				}else {
					System.out.println("Tạo lại thành công!!!");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	//Ghi vào file
	protected void writerToFile(String A) {
		try {
			FileWriter fileWriter = new FileWriter(Result);
			fileWriter.write(A);
			fileWriter.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
}
