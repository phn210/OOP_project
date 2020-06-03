package bai_tap_lon;

import java.util.List;
import java.util.ArrayList;

public class Tag {
	private SanGiaoDich sGD;
	private List<CoPhieu> listCP; //danh sach co phieu nguoi dung nhap
	private int topTang;
	private int topGiam;
	private int topGD;
	private boolean trangThaiSan;
	private boolean nnMua;
	private boolean nnBan;
	private boolean thongTinSan;
	private boolean xuHuongSan;
	private boolean trangThaiTran;
	private boolean vachThamChieu;
	private boolean khopLenh;
	private boolean soSanhGiaTriKhopLenh;
	private boolean trangThaiDauKhi;
	private boolean lietKeDauKhi;
	private boolean trangThaiNganHang;
	private boolean lietKeNganHang;
	
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
		this.setLietKeDauKhi(true);
		this.setLietKeNganHang(true);
		this.setTrangThaiDauKhi(true);
		this.setTrangThaiNganHang(true);
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

	public boolean isTrangThaiDauKhi() {
		return trangThaiDauKhi;
	}

	public void setTrangThaiDauKhi(boolean trangThaiDauKhi) {
		this.trangThaiDauKhi = trangThaiDauKhi;
	}

	public boolean isLietKeDauKhi() {
		return lietKeDauKhi;
	}

	public void setLietKeDauKhi(boolean lietKeDauKhi) {
		this.lietKeDauKhi = lietKeDauKhi;
	}

	public boolean isTrangThaiNganHang() {
		return trangThaiNganHang;
	}

	public void setTrangThaiNganHang(boolean trangThaiNganHang) {
		this.trangThaiNganHang = trangThaiNganHang;
	}

	public boolean isLietKeNganHang() {
		return lietKeNganHang;
	}

	public void setLietKeNganHang(boolean lietKeNganHang) {
		this.lietKeNganHang = lietKeNganHang;
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
