package bai_tap_lon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File{
	public File() {
		SanGiaoDich sgd = new SanGiaoDich();
	}
	public void openFile (String DuongDan) throws IOException {
		//StringBuilder bd = new StringBuilder();		
		//Khởi tạo đối tượng nhận và đọc file trong thư viện BufferedReader
		FileReader fr = new FileReader(DuongDan);
				
		try(BufferedReader br = new BufferedReader(fr);){
		String line = "";
		int i=1;
		while ((line = br.readLine()) != null) {
			String[] A = line.split(",");
			
			//Gán thuộc tính cho Lớp ThuocTinh
			
			
			
//			try{
//			CK[i] = A[0];
//			TC[i] = Float.parseFloat(A[1]);
//			Tran[i] = Float.parseFloat(A[2]);
//			San[i] = Float.parseFloat(A[3]);
//			MuaGia3[i] = Float.parseFloat(A[4]);
//			MuaKL3[i] = Float.parseFloat(A[5]);
//			MuaGia2[i] = Float.parseFloat(A[6]);
//			MuaKL2[i] = Float.parseFloat(A[7]);
//			MuaGia1[i] = Float.parseFloat(A[8]);
//			MuaKL1[i] = Float.parseFloat(A[9]);
//			SDCGia[i] = Float.parseFloat(A[10]);
//			SDCKL[i] = Float.parseFloat(A[11]);
//			BienDong[i] = Float.parseFloat(A[12]);
//			BanGia1[i] = Float.parseFloat(A[13]);
//			BanKL1[i] = Float.parseFloat(A[14]);
//			BanGia2[i] = Float.parseFloat(A[15]);
//			BanKL2[i] = Float.parseFloat(A[16]);
//			BanGia3[i] = Float.parseFloat(A[17]);
//			BanKL3[i] = Float.parseFloat(A[18]);
//			LSCao[i] = Float.parseFloat(A[19]);
//			LSThap[i] = Float.parseFloat(A[20]);
//			TKL[i] = Double.parseDouble(A[21]);
//			NNMua[i] = Float.parseFloat(A[22]);
//			NNBan[i] = Float.parseFloat(A[23]);
//			RoomCon[i] = Float.parseFloat(A[24]);
//			}catch(Exception ex) {
//				CK[i] = null;
//				TC[i] = 0;
//				Tran[i] = 0;
//				San[i] = 0;
//				MuaGia3[i] = 0;
//				MuaGia3[i] = 0;
//				MuaKL3[i] = 0;
//				MuaGia2[i] = 0;
//				MuaKL2[i] = 0;
//				MuaGia1[i] = 0;
//				MuaKL1[i] = 0;
//				SDCGia[i] = 0;
//				SDCKL[i] = 0;
//				BienDong[i] = 0;
//				BanGia1[i] = 0;
//				BanKL1[i] = 0;
//				BanGia2[i] = 0;
//				BanKL2[i] = 0;
//				BanGia3[i] = 0;
//				BanKL3[i] = 0;
//				LSCao[i] = 0;
//				LSThap[i] = 0;
//				TKL[i] = 0;
//				NNMua[i] = 0;
//				NNBan[i] = 0;
//				RoomCon[i] = 0;
//			}
//			i++;
		}}catch(IOException e){
		System.out.println("Có lỗi");
			fr.close();
	    }
		System.out.println("Iloveu");
    }
}
