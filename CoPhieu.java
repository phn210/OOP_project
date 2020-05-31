package bai_tap_lon;
public class CoPhieu{

	//attributes - cac thong tin ve co phieu
	public String ten;
	public float giaThamChieu;
	public float giaTran;
	public float giaSan;
/*	public float muaGia1;
	public float muaKL1;
	public float muaGia2;
	public float muaKL2;
	public float muaGia3;
	public float muaKL3;
*/	public float giaChot; 
//	public float sDCKL;
	public float bienDong;
/*	public float banGia1;
	public float banKL1;
	public float banGia2;
	public float banKL2;
	public float banGia3;
	public float banKL3;
*/	public float giaMax;
	public float giaMin;
	public long tongKLGD;
	public long nnMua;
	public long nnBan;
	public long roomCon;
	
	//constructor
	
	
	//getters & setters
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public float getGiaThamChieu() {
		return giaThamChieu;
	}
	public void setGiaThamChieu(float giaThamChieu) {
		this.giaThamChieu = giaThamChieu;
	}
	public float getGiaTran() {
		return giaTran;
	}
	public void setGiaTran(float giaTran) {
		this.giaTran = giaTran;
	}
	public float getGiaSan() {
		return giaSan;
	}
	public void setGiaSan(float giaSan) {
		this.giaSan = giaSan;
	}
	public float getGiaChot() {
		return giaChot;
	}
	public void setGiaChot(float giaChot) {
		this.giaChot = giaChot;
	}
	public float getBienDong() {
		return bienDong;
	}
	public void setBienDong(float bienDong) {
		this.bienDong = bienDong;
	}
	public float getGiaMax() {
		return giaMax;
	}
	public void setGiaMax(float giaMax) {
		this.giaMax = giaMax;
	}
	public float getGiaMin() {
		return giaMin;
	}
	public void setGiaMin(float giaMin) {
		this.giaMin = giaMin;
	}
	public long getTongKLGD() {
		return tongKLGD;
	}
	public void setTongKLGD(long tongKLGD) {
		this.tongKLGD = tongKLGD;
	}
	public long getNnMua() {
		return nnMua;
	}
	public void setNnMua(long nnMua) {
		this.nnMua = nnMua;
	}
	public long getNnBan() {
		return nnBan;
	}
	public void setNnBan(long nnBan) {
		this.nnBan = nnBan;
	}
	public long getRoomCon() {
		return roomCon;
	}
	public void setRoomCon(long roomCon) {
		this.roomCon = roomCon;
	}
	
	//methods
	
/*	public void ghiThongTinCoPhieu() { // ghi ra toan bo thong tin cua ma co phieu
		String tt = this.ten + " ";
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
*/
}