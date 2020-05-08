package bai_tap_lon;
public class LopCoPhieu{
	public String CK;
	public float TC;
	public float Tran;
	public float San;
	public float MuaGia1;
	public float MuaKL1;
	public float MuaGia2;
	public float MuaKL2;
	public float MuaGia3;
	public float MuaKL3;
	public float SDCGia;
	public float SDCKL;
	public float Biendong;
	public float BanGia1;
	public float BanKL1;
	public float BanGia2;
	public float BanKL2;
	public float BanGia3;
	public float BanKL3;
	public float LSCao;
	public float LSThap;
	public float TKL;
	public float NNMua;
	public float NNBan;
	public float RoomCon;
	
	public void GhiThongTinCoPhieu() { // ghi ra toan bo thong tin cua ma co phieu
		String tt = this.CK + " ";
		tt += String.format("%.2f", this.TC) + " ";
		tt += String.format("%.2f", this.Tran) + " ";
		tt += String.format("%.2f", this.San) + " ";
		tt += String.format("%.2f", this.MuaGia1) + " ";
		tt += String.format("%.2f", this.MuaKL1) + " ";
		tt += String.format("%.2f", this.MuaGia2) + " ";
		tt += String.format("%.2f", this.MuaKL2) + " ";
		tt += String.format("%.2f", this.MuaGia3) + " ";
		tt += String.format("%.2f", this.MuaKL3) + " ";
		tt += String.format("%.2f", this.SDCGia) + " ";
		tt += String.format("%.2f", this.SDCKL) + " ";
		tt += String.format("%.2f", this.Biendong) + " ";
		tt += String.format("%.2f", this.BanGia1) + " ";
		tt += String.format("%.2f", this.BanKL1) + " ";
		tt += String.format("%.2f", this.BanGia2) + " ";
		tt += String.format("%.2f", this.BanKL2) + " ";
		tt += String.format("%.2f", this.BanGia3) + " ";
		tt += String.format("%.2f", this.BanKL3) + " ";
		tt += String.format("%.2f", this.LSCao) + " ";
		tt += String.format("%.2f", this.LSThap) + " ";
		tt += String.format("%.2f", this.TKL) + " ";
		tt += String.format("%.2f", this.NNMua) + " ";
		tt += String.format("%.2f", this.NNBan) + " ";
		tt += String.format("%.2f", this.RoomCon) + " ";
		System.out.println(tt);	
	}
}
