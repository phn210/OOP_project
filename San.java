package data;

import java.util.ArrayList;
import java.util.List;

public class San {
	//chi so cua san
	private String tenSan;
	private String tenChiSo;
	public List<CoPhieu> dsCP; //public/private?
	private double diem;
	private double chenhLech;
	private int donViKL;
	private int donViGia;
	private long klgd;
	private long gtgd;
	private int soMaTang;
	private int soMaGiam;
	private int soMaDung;
	public List<CoPhieu> top10tang;
	public List<CoPhieu> top10giam;
	public List<CoPhieu> top10gd;
	
	//constructors
	public San() {
		
	}
	
	public San(String tenSan, String tenChiSo, double diem, double chenhLech, int donViKL,
			int donViGia, long klgd, long gtgd, int soMaTang, int soMaGiam, int soMaDung) {
		this.setTenSan(tenSan);
		this.setTenChiSo(tenChiSo);
		this.setDsCP(dsCP);
		this.setDiem(diem);
		this.setChenhLech(chenhLech);
		this.setDonViKL(donViKL);
		this.setDonViGia(donViGia);
		this.setKlgd(klgd);
		this.setGtgd(gtgd);
		this.setSoMaTang(soMaTang);
		this.setSoMaGiam(soMaGiam);
		this.setSoMaDung(soMaDung);
		this.dsCP = new ArrayList<>();
		this.top10tang = new ArrayList<>();
		this.top10giam = new ArrayList<>();
		this.top10gd = new ArrayList<CoPhieu>();
		
	}
	
	//getters & setters
	public String getTenSan() {
		return tenSan;
	}
	public void setTenSan(String tenSan) {
		this.tenSan = tenSan;
	}
	public String getTenChiSo() {
		return tenChiSo;
	}
	public void setTenChiSo(String tenChiSo) {
		this.tenChiSo = tenChiSo;
	}
	public List<CoPhieu> getDsCP() {
		return dsCP;
	}
	public void setDsCP(List<CoPhieu> dsCP) {
		this.dsCP = dsCP;
	}
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	public double getChenhLech() {
		return chenhLech;
	}
	public void setChenhLech(double chenhLech) {
		this.chenhLech = chenhLech;
	}
	public int getDonViKL() {
		return donViKL;
	}
	public void setDonViKL(int donViKL) {
		this.donViKL = donViKL;
	}
	public int getDonViGia() {
		return donViGia;
	}
	public void setDonViGia(int donViGia) {
		this.donViGia = donViGia;
	}
	public long getKlgd() {
		return klgd;
	}
	public void setKlgd(long klgd) {
		this.klgd = klgd;
	}
	public long getGtgd() {
		return gtgd;
	}
	public void setGtgd(long gtgd) {
		this.gtgd = gtgd;
	}
	public int getSoMaTang() {
		return soMaTang;
	}
	public void setSoMaTang(int soMaTang) {
		this.soMaTang = soMaTang;
	}
	public int getSoMaGiam() {
		return soMaGiam;
	}
	public void setSoMaGiam(int soMaGiam) {
		this.soMaGiam = soMaGiam;
	}
	public int getSoMaDung() {
		return soMaDung;
	}
	public void setSoMaDung(int soMaDung) {
		this.soMaDung = soMaDung;
	}

	
	// phuong thuc cua san
	
	
}
