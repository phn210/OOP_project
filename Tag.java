package bai_tap_lon;

import java.util.List;
import java.util.ArrayList;

public class Tag {
	private SanGiaoDich san;
	private List<CoPhieu> listCP; //danh sach co phieu nguoi dung nhap
	private int topTang;
	private int topGiam;
	private int topGD;
	private boolean trangThaiSan;
	private boolean nnMua;
	private boolean nnBan;
	
	//constructors
	public Tag(SanGiaoDich san, String A[]) {
		this.san = san;
		this.listCP = new ArrayList<>(); 
		this.setTopTang(3);
		this.setTopGiam(3);
		this.setTopGD(5);
		this.setTrangThaiSan(true);
		this.setNnMua(true);
		this.setNnBan(true);
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
	public List<CoPhieu> getListCP() {
		return listCP;
	}
	public void setListCP(String A[]) {
		for (int i=0; i< A.length;i++) {
			listCP.add(san.findCP(A[i]));
		}
	}
	
	
}
