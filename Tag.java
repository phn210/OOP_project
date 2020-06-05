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
	private boolean khopLenhTungCoPhieu;
	private boolean soSanhKhopLenh;
	private boolean trangThaiDauKhi;
	private boolean lietKeDauKhi;
	private boolean trangThaiNganHang;
	private boolean lietKeNganHang;
	private boolean nhomCoPhieuTang;
	private boolean dungGiaThamChieu;
	private boolean tuTruTang;
	private boolean tangHetBienDo;
	private boolean dienBienTraiChieu;
	private boolean dongLoatMatDiem;
	private boolean tuotDoc;
	private boolean chimTrongSacDo;
	private boolean vonHoaLon;
	private boolean blueChip;
	private boolean nhomCoPhieuTangNhanh;
	private boolean nhomCoPhieuGiam;
	private boolean nhomCoPhieuGiamManh;
	private boolean nhomCoPhieuOnDinh;
	private boolean nhomCoPhieuPhanHoa;
	private boolean trangThaiXDBDS;
	private boolean	lietKeXDBDS;
	private boolean trangThaiKhaiKhoang;
	private boolean lietKeKhaiKhoang;
	private boolean trangThaiSXNN;
	private boolean lietKeSXNN;
	private boolean trangThaiSXTD;
	private boolean lietKeSXTD;
	
	//constructors
	public Tag(SanGiaoDich sGD, List<String> A) {
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
	public boolean isTrangThaiTran() { 
		return trangThaiTran; 
	}
	public boolean isVachThamChieu() { 
		return vachThamChieu; 
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
	public void setListCP(List<String> A) {
		for (int i=0; i< A.size();i++) {
			listCP.add(sGD.findCP(A.get(i)));
		}
	}
	public boolean isKhopLenhTungCoPhieu() {
		return khopLenhTungCoPhieu;
	}
	public boolean isSoSanhKhopLenh() {
		return soSanhKhopLenh;
	}

	public boolean isNhomCoPhieuTang() {
		return nhomCoPhieuTang;
	}

	public void setNhomCoPhieuTang(boolean nhomCoPhieuTang) {
		this.nhomCoPhieuTang = nhomCoPhieuTang;
	}
		public boolean isDungGiaThamChieu() {
		return dungGiaThamChieu;
	}

	public void setDungGiaThamChieu(boolean dungGiaThamChieu) {
		this.dungGiaThamChieu = dungGiaThamChieu;
	}

	public boolean isTuTruTang() {
		return tuTruTang;
	}

	public void setTuTruTang(boolean tuTruTang) {
		this.tuTruTang = tuTruTang;
	}

	public boolean isTangHetBienDo() {
		return tangHetBienDo;
	}

	public void setTangHetBienDo(boolean tangHetBienDo) {
		this.tangHetBienDo = tangHetBienDo;
	}

	public boolean isDienBienTraiChieu() {
		return dienBienTraiChieu;
	}

	public void setDienBienTraiChieu(boolean dienBienTraiChieu) {
		this.dienBienTraiChieu = dienBienTraiChieu;
	}

	public boolean isDongLoatMatDiem() {
		return dongLoatMatDiem;
	}

	public void setDongLoatMatDiem(boolean dongLoatMatDiem) {
		this.dongLoatMatDiem = dongLoatMatDiem;
	}

	public boolean isTuotDoc() {
		return tuotDoc;
	}

	public void setTuotDoc(boolean tuotDoc) {
		this.tuotDoc = tuotDoc;
	}

	public boolean isChimTrongSacDo() {
		return chimTrongSacDo;
	}

	public void setChimTrongSacDo(boolean chimTrongSacDo) {
		this.chimTrongSacDo = chimTrongSacDo;
	}
	public boolean isVonHoaLon() {
		return vonHoaLon;
	}

	public void setVonHoaLon(boolean vonHoaLon) {
		vonHoaLon = vonHoaLon;
	}

	public boolean isBlueChip() {
		return blueChip;
	}

	public void setBlueChip(boolean blueChip) {
		this.blueChip = blueChip;
	}	
	public boolean isNhomCoPhieuTangNhanh() {
		return nhomCoPhieuTangNhanh;
	}

	public void setNhomCoPhieuTangNhanh(boolean nhomCoPhieuTangNhanh) {
		this.nhomCoPhieuTangNhanh = nhomCoPhieuTangNhanh;
	}

	public boolean isNhomCoPhieuGiam() {
		return nhomCoPhieuGiam;
	}

	public void setNhomCoPhieuGiam(boolean nhomCoPhieuGiam) {
		this.nhomCoPhieuGiam = nhomCoPhieuGiam;
	}

	public boolean isNhomCoPhieuGiamManh() {
		return nhomCoPhieuGiamManh;
	}

	public void setNhomCoPhieuGiamManh(boolean nhomCoPhieuGiamManh) {
		this.nhomCoPhieuGiamManh = nhomCoPhieuGiamManh;
	}

	public boolean isNhomCoPhieuOnDinh() {
		return nhomCoPhieuOnDinh;
	}

	public void setNhomCoPhieuOnDinh(boolean nhomCoPhieuOnDinh) {
		this.nhomCoPhieuOnDinh = nhomCoPhieuOnDinh;
	}

	public boolean isNhomCoPhieuPhanHoa() {
		return nhomCoPhieuPhanHoa;
	}

	public void setNhomCoPhieuPhanHoa(boolean nhomCoPhieuPhanHoa) {
		this.nhomCoPhieuPhanHoa = nhomCoPhieuPhanHoa;
	}

	public boolean isTrangThaiXDBDS() {
		return trangThaiXDBDS;
	}

	public void setTrangThaiXDBDS(boolean trangThaiXDBS) {
		this.trangThaiXDBDS = trangThaiXDBS;
	}

	public boolean isLietKeXDBDS() {
		return lietKeXDBDS;
	}

	public void setLietKeXDBDS(boolean lietKeXDBDS) {
		this.lietKeXDBDS = lietKeXDBDS;
	}

	public boolean isTrangThaiKhaiKhoang() {
		return trangThaiKhaiKhoang;
	}

	public void setTrangThaiKhaiKhoang(boolean trangThaiKhaiKhoang) {
		this.trangThaiKhaiKhoang = trangThaiKhaiKhoang;
	}

	public boolean isLietKeKhaiKhoang() {
		return lietKeKhaiKhoang;
	}

	public void setLietKeKhaiKhoang(boolean lietKeKhaiKhoang) {
		this.lietKeKhaiKhoang = lietKeKhaiKhoang;
	}

	public boolean isTrangThaiSXNN() {
		return trangThaiSXNN;
	}

	public void setTrangThaiSXNN(boolean trangThaiSXNN) {
		this.trangThaiSXNN = trangThaiSXNN;
	}

	public boolean isLietKeSXNN() {
		return lietKeSXNN;
	}

	public void setLietKeSXNN(boolean lietKeSXNN) {
		this.lietKeSXNN = lietKeSXNN;
	}

	public boolean isTrangThaiSXTD() {
		return trangThaiSXTD;
	}

	public void setTrangThaiSXTD(boolean trangThaiSXTD) {
		this.trangThaiSXTD = trangThaiSXTD;
	}

	public boolean isLietKeSXTD() {
		return lietKeSXTD;
	}

	public void setLietKeSXTD(boolean lietKeSXTD) {
		this.lietKeSXTD = lietKeSXTD;
	}
	
}
