package bai_tap_lon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class File{
	SanGiaoDich sgd = new SanGiaoDich();
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
			sgd.addCoPhieu(new CoPhieu(A));
			
		}}catch(IOException e){
		System.out.println("Có lỗi");
			fr.close();
	    }
		sgd.addNhomCoPhieu(new NhomCoPhieu(sgd.dsCP(),"Nhóm vốn hóa lớn","VHM","VIC","POW","GAS","VIC","VNM","SBT","HNG","GVR","BID","VRE","ITA","HAG","HPG","FLC"));
		sgd.addNhomCoPhieu(new NhomCoPhieu(sgd.dsCP(),"Nhóm dầu khí","POW","GAS","PLX","PVD","PVT","PXS","PGD"));
		sgd.addNhomCoPhieu(new NhomCoPhieu(sgd.dsCP(),"Nhóm ngân hàng","BID","BVH","CTG","EIB","HDB","MBB","STB","TCB","TPB","VCB","VPB"));
		sgd.addNhomCoPhieu(new NhomCoPhieu(sgd.dsCP(),"Nhóm xây dựng và bất động sản","VRE","ITA","VRE","VHM","VIC","REE","KDH","NVL","LGC","PDR","HPX"));
		sgd.addNhomCoPhieu(new NhomCoPhieu(sgd.dsCP(),"Nhóm khai khoáng","PVD","NNC","KSB","DHA"));
		sgd.addNhomCoPhieu(new NhomCoPhieu(sgd.dsCP(),"Nhóm sản xuất nông nghiệp","HNG","HAG","NSC","ASM","SSC"));
		sgd.addNhomCoPhieu(new NhomCoPhieu(sgd.dsCP(),"Nhóm sản xuất và tiêu dùng","BHN","DHG","GVR","HPG","MSN","SAB","VNM","KDC","PHR","GEX","PNJ"));
		System.out.println("Truyền dữ liệu thành công.");
    }
}


