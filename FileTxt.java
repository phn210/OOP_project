package bai_tap_lon;

import java.io.File;  
import java.io.FileWriter;
import java.io.IOException; 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileTxt{
	private String location = "D:\\HUST\\OOP\\Result.txt";

	private SanGiaoDich sgd = new SanGiaoDich();
	private MauCau cau;
	private String result;
	private Tag tag;
	
	public FileTxt() {
	}
	
	//Má»Ÿ file
	protected void openFile (String DuongDan) throws IOException {
		FileReader fr = new FileReader(DuongDan);
		String line = "";

		try(BufferedReader br = new BufferedReader(fr);){
		//GÃ¡n thuá»™c tÃ­nh
			while ((line = br.readLine()) != null) {
				String A[] = line.split(",");
				sgd.getDSCP().add(new CoPhieu(A));
			}
			sgd.xuLiThongTin();
		} catch(IOException e){
		System.out.println("CÃ³ lá»—i");
			fr.close();
		}
		sgd.addNhomCoPhieu(new NhomCoPhieu(sgd.getDSCP(),"NhÃ³m vá»‘n hÃ³a lá»›n","VHM","VIC","POW","GAS","VIC","VNM","SBT","HNG","GVR","BID","VRE","ITA","HAG","HPG","FLC"));
		sgd.addNhomCoPhieu(new NhomCoPhieu(sgd.getDSCP(),"NhÃ³m dáº§u khÃ­","POW","GAS","PLX","PVD","PVT","PXS","PGD"));
		sgd.addNhomCoPhieu(new NhomCoPhieu(sgd.getDSCP(),"NhÃ³m ngÃ¢n hÃ ng","BID","BVH","CTG","EIB","HDB","MBB","STB","TCB","TPB","VCB","VPB"));
		sgd.addNhomCoPhieu(new NhomCoPhieu(sgd.getDSCP(),"NhÃ³m xÃ¢y dá»±ng vÃ  báº¥t Ä‘á»™ng sáº£n","VRE","ITA","VRE","VHM","VIC","REE","KDH","NVL","LGC","PDR","HPX"));
		sgd.addNhomCoPhieu(new NhomCoPhieu(sgd.getDSCP(),"NhÃ³m khai khoÃ¡ng","PVD","NNC","KSB","DHA"));
		sgd.addNhomCoPhieu(new NhomCoPhieu(sgd.getDSCP(),"NhÃ³m sáº£n xuáº¥t nÃ´ng nghiá»‡p","HNG","HAG","NSC","ASM","SSC"));
		sgd.addNhomCoPhieu(new NhomCoPhieu(sgd.getDSCP(),"NhÃ³m sáº£n xuáº¥t vÃ  tiÃªu dÃ¹ng","BHN","DHG","GVR","HPG","MSN","SAB","VNM","KDC","PHR","GEX","PNJ"));
		System.out.println("Truyá»�n dá»¯ liá»‡u thÃ nh cÃ´ng.");
    }
	
	//Táº¡o file
	protected void createNewFile() {
		 File file = new File(location);
			try {
				if (file.createNewFile() == true) {
					System.out.println("Ä�Ã£ táº¡o File!!!");
					System.out.println("HÃ£y truy cáº­p: D:\\HUST\\OOP\\Result.txt ");
				}else {
					System.out.println("Táº¡o láº¡i thÃ nh cÃ´ng!!!");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	protected String processFile() {
		String s = "";
		String A[] = {};
		tag = new Tag(sgd, A);
		cau = new MauCau(sgd, tag);
		s = cau.tongHopCau();
		return s;
	}
	
	//Ghi vÃ o file
	protected void writeToFile(String A) {
		try {
			FileWriter fileWriter = new FileWriter(location);
			fileWriter.write(A);
			fileWriter.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
	}	
}
