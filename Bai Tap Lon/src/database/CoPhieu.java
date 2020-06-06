package database;

import java.util.Random;

public class CoPhieu{
	//attributes - cac thong tin ve co phieu
	private String ten;
	private float giaThamChieu;
	private float giaTran;
	private float giaSan;
	private float muaGia1;
	private float muaKL1;
	private float muaGia2;
	private float muaKL2;
	private float muaGia3;
	private float muaKL3;
	private float giaChot; 
	private float kLgSDC;
	private float bienDong;
	private float banGia1;
	private float banKL1;
	private float banGia2;
	private float banKL2;
	private float banGia3;
	private float banKL3;
	private float giaMax;
	private float giaMin;
	private long tongKLGD;
	private int nnMua;
	private int nnBan;
	private int roomCon;
	private boolean blueChip;
	private boolean cpNganHang;
	private boolean cpDauKhi;
	private float mucTangManh;
	private float mucTangNhe;
	private float mucGiamManh;
	private float mucGiamNhe;
	
	//constructor
	public CoPhieu() {
		
	}
	
	public CoPhieu(String A[]) {
		this.setTen(A[0]);
		this.setGiaThamChieu(Float.parseFloat(A[1]));
		this.setGiaTran(Float.parseFloat(A[2]));
		this.setGiaSan(Float.parseFloat(A[3]));
		this.setMuaGia3(Float.parseFloat(A[4]));
		this.setMuaKL3(Float.parseFloat(A[5]));
		this.setMuaGia2(Float.parseFloat(A[6]));
		this.setMuaKL2(Float.parseFloat(A[7]));
		this.setMuaGia1(Float.parseFloat(A[8]));
		this.setMuaKL1(Float.parseFloat(A[9]));
		this.setGiaChot(Float.parseFloat(A[10]));
		this.setkLgSDC(Float.parseFloat(A[11]));
		this.setBienDong(Float.parseFloat(A[12]));
		this.setBanGia1(Float.parseFloat(A[13]));
		this.setBanKL1(Float.parseFloat(A[14]));
		this.setBanGia2(Float.parseFloat(A[15]));
		this.setBanKL2(Float.parseFloat(A[16]));
		this.setBanGia3(Float.parseFloat(A[17]));
		this.setBanKL3(Float.parseFloat(A[18]));
		this.setGiaMax(Float.parseFloat(A[19]));
		this.setGiaMin(Float.parseFloat(A[20]));
		this.setTongKLGD(Long.parseLong(A[21]));
		this.setNnMua(Integer.parseInt(A[22]));
		this.setNnBan(Integer.parseInt(A[23]));
		this.setRoomCon(Integer.parseInt(A[24]));
		this.setBlueChip();
		this.setCpNganHang();
		this.setCpDauKhi();
		this.setMucTangManh(1);
		this.setMucTangNhe(0.5f);
		this.setMucGiamNhe(-0.25f);
		this.setMucGiamManh(-0.5f);
	}
	
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
	public float getkLgSDC() {
		return kLgSDC;
	}

	public void setkLgSDC(float kLgSDC) {
		this.kLgSDC = kLgSDC;
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
	public int getNnMua() {
		return nnMua;
	}
	public void setNnMua(int nnMua) {
		this.nnMua = nnMua;
	}
	public int getNnBan() {
		return nnBan;
	}
	public void setNnBan(int nnBan) {
		this.nnBan = nnBan;
	}
	public int getRoomCon() {
		return roomCon;
	}
	public void setRoomCon(int roomCon) {
		this.roomCon = roomCon;
	}
	public boolean isBlueChip() {
		return blueChip;
	}
	public void setBlueChip(boolean blueChip) {
		this.blueChip = blueChip;
	}
	public void setBlueChip() {
		Random rd = new Random();
		this.blueChip = rd.nextBoolean();
	}
	public boolean isCpNganHang() {
		return cpNganHang;
	}
	public void setCpNganHang(boolean cpNganHang) {
		this.cpNganHang = cpNganHang;
	}
	public void setCpNganHang() {
		Random rd = new Random();
		this.cpNganHang = rd.nextBoolean();
	}
	public boolean isCpDauKhi() {
		return cpDauKhi;
	}
	public void setCpDauKhi(boolean cpDauKhi) {
		this.cpDauKhi = cpDauKhi;
	}
	public void setCpDauKhi() {
		Random rd = new Random();
		this.cpDauKhi = rd.nextBoolean();
	}
	public float getMuaGia1() {
		return muaGia1;
	}
	public void setMuaGia1(float muaGia1) {
		this.muaGia1 = muaGia1;
	}
	public float getMuaKL1() {
		return muaKL1;
	}
	public void setMuaKL1(float muaKL1) {
		this.muaKL1 = muaKL1;
	}
	public float getMuaGia2() {
		return muaGia2;
	}
	public void setMuaGia2(float muaGia2) {
		this.muaGia2 = muaGia2;
	}
	public float getMuaKL2() {
		return muaKL2;
	}
	public void setMuaKL2(float muaKL2) {
		this.muaKL2 = muaKL2;
	}
	public float getMuaGia3() {
		return muaGia3;
	}
	public void setMuaGia3(float muaGia3) {
		this.muaGia3 = muaGia3;
	}
	public float getMuaKL3() {
		return muaKL3;
	}
	public void setMuaKL3(float muaKL3) {
		this.muaKL3 = muaKL3;
	}
	public float getKLgSDC() {
		return kLgSDC;
	}
	public void setKLgSDC(float kLgSDC) {
		this.kLgSDC = kLgSDC;
	}
	public float getBanGia1() {
		return banGia1;
	}
	public void setBanGia1(float banGia1) {
		this.banGia1 = banGia1;
	}
	public float getBanKL1() {
		return banKL1;
	}
	public void setBanKL1(float banKL1) {
		this.banKL1 = banKL1;
	}
	public float getBanGia2() {
		return banGia2;
	}
	public void setBanGia2(float banGia2) {
		this.banGia2 = banGia2;
	}
	public float getBanKL2() {
		return banKL2;
	}
	public void setBanKL2(float banKL2) {
		this.banKL2 = banKL2;
	}
	public float getBanGia3() {
		return banGia3;
	}
	public void setBanGia3(float banGia3) {
		this.banGia3 = banGia3;
	}
	public float getBanKL3() {
		return banKL3;
	}
	public void setBanKL3(float banKL3) {
		this.banKL3 = banKL3;
	}
	
	public float getMucTangManh() {
		return mucTangManh;
	}

	public void setMucTangManh(float mucTangManh) {
		this.mucTangManh = mucTangManh;
	}

	public float getMucTangNhe() {
		return mucTangNhe;
	}

	public void setMucTangNhe(float mucTangNhe) {
		this.mucTangNhe = mucTangNhe;
	}

	public float getMucGiamManh() {
		return mucGiamManh;
	}

	public void setMucGiamManh(float mucGiamManh) {
		this.mucGiamManh = mucGiamManh;
	}

	public float getMucGiamNhe() {
		return mucGiamNhe;
	}

	public void setMucGiamNhe(float mucGiamNhe) {
		this.mucGiamNhe = mucGiamNhe;
	}

	//methods
	public void inTTinCP() {
		StringBuffer tt = new StringBuffer();
		tt.append(this.getTen() + " " );
		tt.append(this.getGiaTran() + " ");
		tt.append(this.getGiaSan() + " ");
/*		tt.append(this.getMuaGia1() + " ");
		tt.append(this.getMuaKL1() + " ");
		tt.append(this.getMuaGia2() + " ");
		tt.append(this.getMuaKL2() + " ");
		tt.append(this.getMuaGia3() + " ");
		tt.append(this.getMuaKL3() + " ");
*/		tt.append(this.getGiaChot() + " ");
		tt.append(this.getBienDong() + " ");
		tt.append(this.getGiaMax() + " ");
		tt.append(this.getGiaMin() + " ");
		tt.append(this.getTongKLGD() + " ");
		tt.append(this.getNnMua() + " ");
		tt.append(this.getNnBan() + " ");
		tt.append(this.getRoomCon() + " ");
	}
	
	public String getTrangThai() {
		String s = "";
		if (this.getBienDong() > this.getMucTangManh())
			s += "tang manh ";
		else if (this.getBienDong() > this.getMucTangNhe())
			s += "tang ";
		else if (this.getBienDong() > 0)
			s += "nhich nhe ";
		else if (this.getBienDong() == 0)
			s += "dung gia";
		else if (this.getBienDong() > this.getMucGiamNhe())
			s += "giam nhe ";
		else if (this.getBienDong() > this.getMucGiamManh())
			s += "bi tru ";
		else s += "mat den ";
		return s;
	}

}