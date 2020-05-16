package bai_tap_lon;
import java.lang.String;

public class SanGiaoDich{
	public final String TENSAN = "HOSE";
	public final String TENCHISO = "VNIndex";
	public float diemChiSo;
	public float diemTuongDoi;
	public float diemTuyetDoi;
	public float kLGD;
	public float gTGD;
	private String thongTin;
	private int pointer = 0;
	
	public LopCoPhieu[] coPhieu = new LopCoPhieu[500];
	public int soLoaiCoPhieu = 440;
	
	public SanGiaoDich(){
		this.thongTin = null;
		this.SetVNIndex();
		this.soLoaiCoPhieu = 0;
		this.SetcoPhieu();
	}
	
	public SanGiaoDich(String txtAllFile,int SoLoai){
		this.thongTin = txtAllFile;
		this.SetVNIndex();
		this.soLoaiCoPhieu = SoLoai;
		this.SetcoPhieu();
	}
	
	private float GetBigFloat() {
		float res = 0;
		
		while(thongTin.charAt(pointer)<'0' || thongTin.charAt(pointer)>'9') pointer++;
		while((thongTin.charAt(pointer)>='0' && thongTin.charAt(pointer)<='9') || thongTin.charAt(pointer)==','){
			if (thongTin.charAt(pointer)>='0' && thongTin.charAt(pointer)<='9')
				res = res*10 + (thongTin.charAt(pointer)-'0');
			pointer++;
		}
		if(thongTin.charAt(pointer)=='.'){
			pointer++;
			float heso = (float) 0.1;
			while(thongTin.charAt(pointer)>='0' && thongTin.charAt(pointer)<='9') {
				res = res + heso*(thongTin.charAt(pointer)-'0');
				heso = (float) (heso*0.1);
				pointer++;
			}
		}	
		return res;
	}
	
	private float GetLong() {
		float res = 0;
		pointer++;
		while (thongTin.charAt(pointer) != '"')
		{
			if(thongTin.charAt(pointer)>='0' && thongTin.charAt(pointer)<='9') 
				res = res*10 + (thongTin.charAt(pointer)-'0');
			pointer++;
		}
		pointer++;
		return res;
	}
	
	private float GetNum() { // lay ra so dau tien sau vi tri pointer
		float res = 0;
		int dau = 1; // dau am(-) hay duong
		
		while(thongTin.charAt(pointer)<'0' || thongTin.charAt(pointer)>'9') {
			if (thongTin.charAt(pointer) == '-' || thongTin.charAt(pointer) == '▼') dau = -1; 
			if (thongTin.charAt(pointer) == ',' && (thongTin.charAt(pointer+1) == ',' || ( thongTin.charAt(pointer+1)>='A' && thongTin.charAt(pointer+1)<='Z' ))) {
				pointer++;
				return -1;
			}
			if (thongTin.charAt(pointer) == '"') return GetLong();
			pointer++;
		}
		while(thongTin.charAt(pointer)>='0' && thongTin.charAt(pointer)<='9') {
			res = res*10 + (thongTin.charAt(pointer)-'0');
			pointer++;
		}
		if(thongTin.charAt(pointer)=='.'){
			pointer++;
			float heso = (float) 0.1;
			while(thongTin.charAt(pointer)>='0' && thongTin.charAt(pointer)<='9') {
				res = res + heso*(thongTin.charAt(pointer)-'0');
				heso = (float) (heso*0.1);
				pointer++;
			}
		}	
		return res*dau;
		
	}
	
	private String GetCK() { // lay ra ten CK cua ma co phieu
		String res = "";
		while(thongTin.charAt(pointer)<'A' || thongTin.charAt(pointer)>'Z') pointer++;
		while((thongTin.charAt(pointer)>='A' && thongTin.charAt(pointer)<='Z')||(thongTin.charAt(pointer)>='0' && thongTin.charAt(pointer)<='9')){
			res = res + thongTin.charAt(pointer);
			pointer++;
		}	
		return res;
	}
	
	public void GhithongTinChiSo() {
		String tt = this.TENCHISO + " ";
		tt += String.format("%.2f", this.diemChiSo) + " ";
		tt += String.format("%.2f", this.diemTuyetDoi) + " ";
		tt += String.format("%.2f", this.diemTuongDoi) + " ";
		tt += " kLGD: " + String.format("%.2f", this.kLGD);
		tt += " gTGD: " + String.format("%.2f", this.gTGD);
		System.out.println(tt);
	}
	
	private void SetVNIndex() {
		if (thongTin == null) return;
		pointer = thongTin.indexOf("VNIndex");
		this.diemChiSo = GetNum();
		this.diemTuongDoi = GetNum();
		this.diemTuyetDoi = GetNum();
		this.kLGD = GetBigFloat();
		this.gTGD = GetBigFloat();
		//
		//GhithongTinChiSo();
	}
	
	private void SetcoPhieu() {
		if (thongTin == null) return;
		pointer = thongTin.indexOf("AAA");// tim vi tri cua co phieu dau tien
		
		for(int i=0 ; i<440 ; i++)
		{
			coPhieu[i] = new LopCoPhieu();
			coPhieu[i].cK = GetCK();
			coPhieu[i].tC = GetNum();
			coPhieu[i].tran = GetNum();
			coPhieu[i].san = GetNum();
			coPhieu[i].muaGia1 = GetNum();
			coPhieu[i].muaKL1 = GetNum();
			coPhieu[i].muaGia2 = GetNum();
			coPhieu[i].muaKL2 = GetNum();
			coPhieu[i].muaGia3 = GetNum();
			coPhieu[i].muaKL3 = GetNum();
			coPhieu[i].sDCGia = GetNum();
			coPhieu[i].sDCKL = GetNum();
			coPhieu[i].bienDong = GetNum();
			coPhieu[i].banGia1 = GetNum();
			coPhieu[i].banKL1 = GetNum();
			coPhieu[i].banGia2 = GetNum();
			coPhieu[i].banKL2 = GetNum();
			coPhieu[i].banGia3 = GetNum(); 
			coPhieu[i].banKL3 = GetNum();
			coPhieu[i].lSCao = GetNum();
			coPhieu[i].lSThap = GetNum();
			coPhieu[i].tKL = GetNum();
			coPhieu[i].nNMua = GetNum();
			coPhieu[i].nNBan = GetNum();
			coPhieu[i].roomCon = GetNum();
			
			coPhieu[i].tongMua = coPhieu[i].muaKL1 + coPhieu[i].muaKL2 + coPhieu[i].muaKL3;
			//
			//coPhieu[i].GhiThongTinCoPhieu();
		}
	}
	
	public void sortTongMua(int l,int r)
	{
		if (l>=r) return;
		float key = coPhieu[ (l+r) / 2].tongMua;
		int i=l;
		int j=r;
		while ( i<=j )
		{
			while (coPhieu[i].tongMua > key) i++;
			while (coPhieu[j].tongMua < key) j--;
			if (i<=j)
			{
                LopCoPhieu temp = coPhieu[i]; 
                coPhieu[i] = coPhieu[j]; 
                coPhieu[j] = temp; 			
                i++;
                j--;
			}
		}
		sortTongMua(l , j);
		sortTongMua(i,  r);
	}
}
