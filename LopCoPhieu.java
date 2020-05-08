package bai_tap_lon;
public class LopCoPhieu{
	public String cK;
	public float tC;
	public float tran;
	public float san;
	public float muaGia1;
	public float muaKL1;
	public float muaGia2;
	public float muaKL2;
	public float muaGia3;
	public float muaKL3;
	public float sDCGia;
	public float sDCKL;
	public float bienDong;
	public float banGia1;
	public float banKL1;
	public float banGia2;
	public float banKL2;
	public float banGia3;
	public float banKL3;
	public float lSCao;
	public float lSThap;
	public float tKL;
	public float nNMua;
	public float nNBan;
	public float roomCon;
	
	public void ghiThongTinCoPhieu() { // ghi ra toan bo thong tin cua ma co phieu
		String tt = this.cK + " ";
		tt += String.format("%.2f", this.tC) + " ";
		tt += String.format("%.2f", this.tran) + " ";
		tt += String.format("%.2f", this.san) + " ";
		tt += String.format("%.2f", this.muaGia1) + " ";
		tt += String.format("%.2f", this.muaKL1) + " ";
		tt += String.format("%.2f", this.muaGia2) + " ";
		tt += String.format("%.2f", this.muaKL2) + " ";
		tt += String.format("%.2f", this.muaGia3) + " ";
		tt += String.format("%.2f", this.muaKL3) + " ";
		tt += String.format("%.2f", this.sDCGia) + " ";
		tt += String.format("%.2f", this.sDCKL) + " ";
		tt += String.format("%.2f", this.bienDong) + " ";
		tt += String.format("%.2f", this.banGia1) + " ";
		tt += String.format("%.2f", this.banKL1) + " ";
		tt += String.format("%.2f", this.banGia2) + " ";
		tt += String.format("%.2f", this.banKL2) + " ";
		tt += String.format("%.2f", this.banGia3) + " ";
		tt += String.format("%.2f", this.banKL3) + " ";
		tt += String.format("%.2f", this.lSCao) + " ";
		tt += String.format("%.2f", this.lSThap) + " ";
		tt += String.format("%.2f", this.tKL) + " ";
		tt += String.format("%.2f", this.nNMua) + " ";
		tt += String.format("%.2f", this.nNBan) + " ";
		tt += String.format("%.2f", this.roomCon) + " ";
		System.out.println(tt);	
	}
}
