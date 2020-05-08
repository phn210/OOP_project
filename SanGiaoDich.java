package bai_tap_lon;
package pack1;

import java.lang.String;

public class SanGiaoDich{
	public final String TenSan = "HOSE";
	public final String TenChiSo = "VNIndex";
	public float DiemChiSo;
	public float DiemTuongDoi;
	public float DiemTuyetDoi;
	public float KLGD;
	public float GTGD;
	private String ThongTin;
	private int pointer = 0;
	
	public LopCoPhieu[] CoPhieu = new LopCoPhieu[500];
	public int SoLoaiCoPhieu = 440;
	
	public SanGiaoDich(String txtAllFile,int SoLoai){
		this.ThongTin = txtAllFile;
		this.SetVNIndex();
		this.SoLoaiCoPhieu = SoLoai;
		this.SetCoPhieu();
	}
	
	private float GetBigFloat() {
		float res = 0;
		
		while(ThongTin.charAt(pointer)<'0' || ThongTin.charAt(pointer)>'9') pointer++;
		while((ThongTin.charAt(pointer)>='0' && ThongTin.charAt(pointer)<='9') || ThongTin.charAt(pointer)==','){
			if (ThongTin.charAt(pointer)>='0' && ThongTin.charAt(pointer)<='9')
				res = res*10 + (ThongTin.charAt(pointer)-'0');
			pointer++;
		}
		if(ThongTin.charAt(pointer)=='.'){
			pointer++;
			float heso = (float) 0.1;
			while(ThongTin.charAt(pointer)>='0' && ThongTin.charAt(pointer)<='9') {
				res = res + heso*(ThongTin.charAt(pointer)-'0');
				heso = (float) (heso*0.1);
				pointer++;
			}
		}	
		return res;
	}
	
	private float GetLong() {
		float res = 0;
		pointer++;
		while (ThongTin.charAt(pointer) != '"')
		{
			if(ThongTin.charAt(pointer)>='0' && ThongTin.charAt(pointer)<='9') 
				res = res*10 + (ThongTin.charAt(pointer)-'0');
			pointer++;
		}
		pointer++;
		return res;
	}
	
	private float GetNum() { // lay ra so dau tien sau vi tri pointer
		float res = 0;
		int dau = 1; // dau am(-) hay duong
		
		while(ThongTin.charAt(pointer)<'0' || ThongTin.charAt(pointer)>'9') {
			if (ThongTin.charAt(pointer) == '-' || ThongTin.charAt(pointer) == '▼') dau = -1; 
			if (ThongTin.charAt(pointer) == ',' && (ThongTin.charAt(pointer+1) == ',' || ( ThongTin.charAt(pointer+1)>='A' && ThongTin.charAt(pointer+1)<='Z' ))) {
				pointer++;
				return -1;
			}
			if (ThongTin.charAt(pointer) == '"') return GetLong();
			pointer++;
		}
		while(ThongTin.charAt(pointer)>='0' && ThongTin.charAt(pointer)<='9') {
			res = res*10 + (ThongTin.charAt(pointer)-'0');
			pointer++;
		}
		if(ThongTin.charAt(pointer)=='.'){
			pointer++;
			float heso = (float) 0.1;
			while(ThongTin.charAt(pointer)>='0' && ThongTin.charAt(pointer)<='9') {
				res = res + heso*(ThongTin.charAt(pointer)-'0');
				heso = (float) (heso*0.1);
				pointer++;
			}
		}	
		return res*dau;
		
	}
	
	private String GetCK() { // lay ra ten CK cua ma co phieu
		String res = "";
		while(ThongTin.charAt(pointer)<'A' || ThongTin.charAt(pointer)>'Z') pointer++;
		while((ThongTin.charAt(pointer)>='A' && ThongTin.charAt(pointer)<='Z')||(ThongTin.charAt(pointer)>='0' && ThongTin.charAt(pointer)<='9')){
			res = res + ThongTin.charAt(pointer);
			pointer++;
		}	
		return res;
	}
	
	public void GhiThongTinChiSo() {
		String tt = this.TenChiSo + " ";
		tt += String.format("%.2f", this.DiemChiSo) + " ";
		tt += String.format("%.2f", this.DiemTuyetDoi) + " ";
		tt += String.format("%.2f", this.DiemTuongDoi) + " ";
		tt += " KLGD: " + String.format("%.2f", this.KLGD);
		tt += " GTGD: " + String.format("%.2f", this.GTGD);
		System.out.println(tt);
	}
	
	private void SetVNIndex() {
		if (ThongTin == null) return;
		pointer = ThongTin.indexOf("VNIndex");
		this.DiemChiSo = GetNum();
		this.DiemTuongDoi = GetNum();
		this.DiemTuyetDoi = GetNum();
		this.KLGD = GetBigFloat();
		this.GTGD = GetBigFloat();
		//
		GhiThongTinChiSo();
	}
	
	private void SetCoPhieu() {
		if (ThongTin == null) return;
		pointer = ThongTin.indexOf("AAA");// tim vi tri cua co phieu dau tien
		
		for(int i=0 ; i<440 ; i++)
		{
			CoPhieu[i] = new LopCoPhieu();
			CoPhieu[i].CK = GetCK();
			CoPhieu[i].TC = GetNum();
			CoPhieu[i].Tran = GetNum();
			CoPhieu[i].San = GetNum();
			CoPhieu[i].MuaGia1 = GetNum();
			CoPhieu[i].MuaKL1 = GetNum();
			CoPhieu[i].MuaGia2 = GetNum();
			CoPhieu[i].MuaKL2 = GetNum();
			CoPhieu[i].MuaGia3 = GetNum();
			CoPhieu[i].MuaKL3 = GetNum();
			CoPhieu[i].SDCGia = GetNum();
			CoPhieu[i].SDCKL = GetNum();
			CoPhieu[i].Biendong = GetNum();
			CoPhieu[i].BanGia1 = GetNum();
			CoPhieu[i].BanKL1 = GetNum();
			CoPhieu[i].BanGia2 = GetNum();
			CoPhieu[i].BanKL2 = GetNum();
			CoPhieu[i].BanGia3 = GetNum(); 
			CoPhieu[i].BanKL3 = GetNum();
			CoPhieu[i].LSCao = GetNum();
			CoPhieu[i].LSThap = GetNum();
			CoPhieu[i].TKL = GetNum();
			CoPhieu[i].NNMua = GetNum();
			CoPhieu[i].NNBan = GetNum();
			CoPhieu[i].RoomCon = GetNum();
			//
			CoPhieu[i].GhiThongTinCoPhieu();
		}
	}
}
