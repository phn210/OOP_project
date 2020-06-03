package bai_tap_lon;

import java.util.List;
import java.util.ArrayList;

public class Tag {
	private SanGiaoDich sGD;
	private List<CoPhieu> listCP; //danh sach co phieu nguoi dung nhap
	private int topTang;
	private int topGiam;
	private int topGD;
	private int topKL; //top khop lenh (=5)
	private boolean trangThaiSan;
	private boolean nnMua;
	private boolean nnBan;
	private boolean thongTinSan;
	private boolean xuHuongSan;
	private boolean trangThaiTran;
	private boolean vachThamChieu;
	private boolean khopLenh;
	private boolean soSanhGiaTriKhopLenh;





	//constructors
	public Tag(SanGiaoDich sGD, String A[]) {
		this.sGD = sGD;
		this.listCP = new ArrayList<>(); 
		this.setTopTang(3);
		this.setTopGiam(1);
		this.setTopGD(5);
		this.setTrangThaiSan(true);
		this.setNnMua(true);
		this.setNnBan(true);
		this.setThongTinSan(true);
		this.setXuHuongSan(true);
		this.setListCP(A);
	}
	
	public int getTopTang() {
		return topTang;
	}
	public void setTopTang(int topTang) {
		this.topTang = topTang;
	}
	public int getTopGiam() {
		return topGiam;
	}
	public void setTopGiam(int topGiam) {
		this.topGiam = topGiam;
	}
	public int getTopGD() {
		return topGD;
	}
	public void setTopGD(int topGD) {
		this.topGD = topGD;
	}
	public boolean isTrangThaiSan() {
		return trangThaiSan;
	}
	public void setTrangThaiSan(boolean trangThaiSan) {
		this.trangThaiSan = trangThaiSan;
	}
	public boolean isNnMua() {
		return nnMua;
	}
	public void setNnMua(boolean nnMua) {
		this.nnMua = nnMua;
	}
	public boolean isNnBan() {
		return nnBan;
	}
	public void setNnBan(boolean nnBan) {
		this.nnBan = nnBan;
	}
	public boolean isThongTinSan() {
		return thongTinSan;
	}
	public void setThongTinSan(boolean thongTinSan) {
		this.thongTinSan = thongTinSan;
	}
	public boolean isXuHuongSan() {
		return xuHuongSan;
	}

	public void setXuHuongSan(boolean xuHuongSan) {
		this.xuHuongSan = xuHuongSan;
	}

	public List<CoPhieu> getListCP() {
		return listCP;
	}
	public void setListCP(String A[]) {
		for (int i=0; i< A.length;i++) {
			listCP.add(sGD.findCP(A[i]));
		}
	}	
}