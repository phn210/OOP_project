package bai_tap_lon;

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
	
	public LopCoPhieu[] CoPhieu;
	public int SoLoaiCoPhieu ;
	
	public SanGiaoDich(String txtAllFile){
		this.ThongTin = txtAllFile;
		this.SetVNIndex();
		this.SoLoaiCoPhieu = 0;
		this.SetCoPhieu();
	}
	
	private float GetFloat() { // lay ra so thuc dau tien sau vi tri pointer
		float res = 0;
		
		while(ThongTin.charAt(pointer)<'0' || ThongTin.charAt(pointer)>'9') pointer++;
		while(ThongTin.charAt(pointer)>='0' && ThongTin.charAt(pointer)<='9') {
			res = res*10 + (ThongTin.charAt(pointer)-'0');
			pointer++;
		}
		if(ThongTin.charAt(pointer)==',' || ThongTin.charAt(pointer)=='.'){
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
	
	private void SetVNIndex() {
		if (ThongTin==null) return;
		pointer = ThongTin.indexOf("VNIndex");
		this.DiemChiSo = GetFloat();
		this.DiemTuongDoi = GetFloat();
		this.DiemTuyetDoi = GetFloat();
	}
	
	private void SetCoPhieu() {
		
	}
	
	
	
	
}
