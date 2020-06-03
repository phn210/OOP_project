package bai_tap_lon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File{
	SanGiaoDich sgd;
	public File() {
		
	}
	
	public void openFile (String DuongDan) throws IOException {
		//StringBuilder bd = new StringBuilder();		
		//Khởi tạo đối tượng nhận và đọc file trong thư viện BufferedReader
		FileReader fr = new FileReader(DuongDan);

		try(BufferedReader br = new BufferedReader(fr);){
		String line = "";
		
		//Gán thuộc tính cho Lớp ThuocTinh
		while ((line = br.readLine()) != null) {
			String A[] = line.split(",");
			sgd.dscp.add(new CoPhieu(A));
			
		}}catch(IOException e){
		System.out.println("Có lỗi");
			fr.close();
	    }
		System.out.println("Truyền dữ liệu thành công.");
    }
}
