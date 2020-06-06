package bai_tap_lon;

import java.util.List;
import java.util.ArrayList;

public class Tag {
	private static List<String> listTag = new ArrayList<>();
	private static List<CoPhieu> listCP = new ArrayList<>(); //danh sach co phieu nguoi dung nhap
	private static boolean top1Tang;
	private static boolean top1Giam;
	private static boolean top3Tang;
	private static boolean top3Giam;
//	private static int topGD;
	private static boolean trangThaiSan;
	private static boolean nnMua;
	private static boolean nnBan;
	private static boolean thongTinSan;
	private static boolean xuHuongSan;
	private static boolean trangThaiTran;
	private static boolean khopLenhTungCoPhieu;
	private static boolean soSanhKhopLenh;
	private static boolean trangThaiDauKhi;
	private static boolean lietKeDauKhi;
	private static boolean trangThaiNganHang;
	private static boolean lietKeNganHang;
	private static boolean nhomCoPhieuTang;
	private static boolean dungGiaThamChieu;
	private static boolean tuTruTang;
	private static boolean tangHetBienDo;
	private static boolean dienBienTraiChieu;
	private static boolean dongLoatMatDiem;
	private static boolean tuotDoc;
	private static boolean chimTrongSacDo;
	private static boolean vonHoaLon;
	private static boolean blueChip;
	private static boolean nhomCoPhieuTangNhanh;
	private static boolean nhomCoPhieuGiam;
	private static boolean nhomCoPhieuGiamManh;
	private static boolean nhomCoPhieuOnDinh;
	private static boolean nhomCoPhieuPhanHoa;
	private static boolean trangThaiXDBDS;
	private static boolean	lietKeXDBDS;
	private static boolean trangThaiKhaiKhoang;
	private static boolean lietKeKhaiKhoang;
	private static boolean trangThaiSXNN;
	private static boolean lietKeSXNN;
	private static boolean trangThaiSXTD;
	private static boolean lietKeSXTD;
	private static boolean trangThaiCoPhieu;
	
	//constructors
	public Tag() {
 
	}
	
	public static List<CoPhieu> getListCP() {
		return listCP;
	}
	
	public static void setListTag(List<String> listTag) {
		Tag.listTag = listTag;
	}
	
	public static void setTag() {
		Tag.setTop1Tang();
		Tag.setTop1Giam();
		Tag.setTrangThaiSan();
		Tag.setNnMua();
		Tag.setNnBan();
		Tag.setThongTinSan();
		Tag.setXuHuongSan();
		Tag.setLietKeDauKhi();
		Tag.setLietKeNganHang();
		Tag.setTrangThaiDauKhi();
		Tag.setTrangThaiNganHang();
		Tag.setTuTruTang();
		Tag.setTrangThaiCoPhieu();
		Tag.setTangHetBienDo();
		Tag.setDienBienTraiChieu();
		Tag.setDongLoatMatDiem();
		Tag.setTuotDoc();
		Tag.setChimTrongSacDo();
		Tag.setVonHoaLon();
		Tag.setBlueChip();
		Tag.setNhomCoPhieuTang();
		Tag.setNhomCoPhieuTangNhanh();
		Tag.setNhomCoPhieuGiam();
		Tag.setNhomCoPhieuGiamManh();
		Tag.setNhomCoPhieuOnDinh();
		Tag.setNhomCoPhieuPhanHoa();
		Tag.setTrangThaiXDBDS();
		Tag.setLietKeXDBDS();
		Tag.setTrangThaiKhaiKhoang();
		Tag.setLietKeKhaiKhoang();
		Tag.setTrangThaiSXNN();
		Tag.setLietKeSXNN();
		Tag.setTrangThaiSXTD();
		Tag.setLietKeSXTD();
	}

	public static boolean isTop1Tang() {
		return top1Tang;
	}
	public static void setTop1Tang() {
		for (String s: listTag)
			if (s.contains("Tăng nhiều nhất"))
				Tag.top1Tang = true;
	}
	public static boolean isTop1Giam() {
		return top1Giam;
	}
	public static void setTop1Giam() {
		for (String s: listTag)
			if (s.equals("Giảm nhiều nhất"))
				Tag.top1Giam = true;
	}
	public static boolean isTop3Tang() {
		return top3Tang;
	}

	public static void setTop3Tang(boolean top3Tang) {
		for (String s: listTag)
			if (s.contains("Top 3 tăng"))
				Tag.top3Tang = true;
	}

	public static boolean isTop3Giam() {
		return top3Giam;
	}

	public static void setTop3Giam(boolean top3Giam) {
		for (String s: listTag)
			if (s.contains("Top 3 giảm"))
				Tag.top3Giam = true;
	}

/*	public static int getTopGD() {
		return topGD;
	}
	public static void setTopGD(int topGD) {
		Tag.topGD = topGD;
	}
*/
	public static boolean isTrangThaiSan() {
		return trangThaiSan;
	}
	public static void setTrangThaiSan() {
		for (String s: listTag)
			if (s.contains("Trạng thái sàn giao dịch"))
				Tag.trangThaiSan = true;
	}
	public static boolean isNnMua() {
		return nnMua;
	}
	public static void setNnMua() {
		for (String s: listTag)
			if (s.contains("Nước ngoài mua"))
				Tag.nnMua = true;
	}
	public static boolean isNnBan() {
		return nnBan;
	}
	public static void setNnBan() {
		for (String s: listTag)
			if (s.contains("Nước ngoài bán"))
				Tag.nnBan = true;
	}
	public static boolean isThongTinSan() {
		return thongTinSan;
	}
	public static void setThongTinSan() {
		for (String s: listTag)
			if (s.contains("Thông tin sàn giao dịch"))
				Tag.thongTinSan = true;
	}
	public static boolean isXuHuongSan() {
		return xuHuongSan;
	}
	public static void setXuHuongSan() {
		for (String s: listTag)
			if (s.contains("Xu hướng sàn giao dịch"))
				Tag.xuHuongSan = true;
	}

	public static boolean isTrangThaiTran() { 
		return trangThaiTran; 
	}
	
	public static void setTrangThaiTran() {
		for (String s: listTag)
			if (s.contains("So sánh với giá trần"))
				Tag.trangThaiTran = true;
	}
	
	public static boolean isTrangThaiDauKhi() {
		return trangThaiDauKhi;
	}

	public static void setTrangThaiDauKhi() {
		for (String s: listTag)
			if (s.contains("Trạng thái nhóm dầu khí"))
				Tag.trangThaiDauKhi = true;
	}

	public static boolean isLietKeDauKhi() {
		return lietKeDauKhi;
	}

	public static void setLietKeDauKhi () {
		for (String s: listTag)
			if (s.contains("Cổ phiếu nhóm dầu khí"))
				Tag.lietKeDauKhi = true;
	}

	public static boolean isTrangThaiNganHang() {
		return trangThaiNganHang;
	}

	public static void setTrangThaiNganHang() {
		for (String s: listTag)
			if (s.contains("Trạng thái nhóm ngân hàng"))
				Tag.trangThaiNganHang = true;
	}

	public static boolean isLietKeNganHang() {
		return lietKeNganHang;
	}

	public static void setLietKeNganHang() {
		for (String s: listTag)
			if (s.contains("Cổ phiếu nhóm ngân hàng"))
				Tag.lietKeNganHang = true;
	}
	
	public static boolean isKhopLenhTungCoPhieu() {
		return khopLenhTungCoPhieu;
	}
	
	public static boolean isSoSanhKhopLenh() {
		return soSanhKhopLenh;
	}

	public static boolean isNhomCoPhieuTang() {
		return nhomCoPhieuTang;
	}

	public static void setNhomCoPhieuTang() {
		for (String s: listTag)
			if (s.contains("Nhóm cổ phiếu tăng"))
				Tag.nhomCoPhieuTang = true;
	}
	public static boolean isDungGiaThamChieu() {
		return dungGiaThamChieu;
	}

	public static void setDungGiaThamChieu() {
		for (String s: listTag)
			if (s.contains("Đứng giá tham chiếu"))
				Tag.dungGiaThamChieu = true;
	}

	public static boolean isTuTruTang() {
		return tuTruTang;
	}

	public static void setTuTruTang() {
		for (String s: listTag)
			if (s.contains("Tứ trụ tăng"))
				Tag.tuTruTang = true;
	}

	public static boolean isTangHetBienDo() {
		return tangHetBienDo;
	}

	public static void setTangHetBienDo() {
		for (String s: listTag)
			if (s.contains("Tăng hết biên độ"))
				Tag.tangHetBienDo = true;
	}

	public static boolean isDienBienTraiChieu() {
		return dienBienTraiChieu;
	}

	public static void setDienBienTraiChieu() {
		for (String s: listTag)
			if (s.contains("Diễn biến trái chiều"))
				Tag.dienBienTraiChieu = true;
	}

	public static boolean isDongLoatMatDiem() {
		return dongLoatMatDiem;
	}

	public static void setDongLoatMatDiem() {
		for (String s: listTag)
			if (s.contains("Đồng loạt mất điểm"))
				Tag.dongLoatMatDiem = true;
	}

	public static boolean isTuotDoc() {
		return tuotDoc;
	}

	public static void setTuotDoc() {
		for (String s: listTag)
			if (s.contains("Tuột dốc"))
				Tag.tuotDoc = true;
	}

	public static boolean isChimTrongSacDo() {
		return chimTrongSacDo;
	}

	public static void setChimTrongSacDo() {
		for (String s: listTag)
			if (s.contains("Chìm trong sắc đỏ"))
				Tag.chimTrongSacDo = true;
	}
	public static boolean isVonHoaLon() {
		return vonHoaLon;
	}

	public static void setVonHoaLon() {
		for (String s: listTag)
			if (s.contains("Vốn hóa lớn"))
				Tag.vonHoaLon = true;
	}

	public static boolean isBlueChip() {
		return blueChip;
	}

	public static void setBlueChip() {
		for (String s: listTag)
			if (s.contains("Cổ phiếu blue chip"))
				Tag.blueChip = true;
	}	
	public static boolean isNhomCoPhieuTangNhanh() {
		return nhomCoPhieuTangNhanh;
	}

	public static void setNhomCoPhieuTangNhanh() {
		for (String s: listTag)
			if (s.contains("Nhóm cổ phiếu tăng nhanh"))
				Tag.nhomCoPhieuTangNhanh = true;
	}

	public static boolean isNhomCoPhieuGiam() {
		return nhomCoPhieuGiam;
	}

	public static void setNhomCoPhieuGiam() {
		for (String s: listTag)
			if (s.contains("Nhóm cổ phiếu giảm"))
				Tag.nhomCoPhieuGiam = true;
	}

	public static boolean isNhomCoPhieuGiamManh() {
		return nhomCoPhieuGiamManh;
	}

	public static void setNhomCoPhieuGiamManh() {
		for (String s: listTag)
			if (s.contains("Nhóm cổ phiếu giảm mạnh"))
				Tag.nhomCoPhieuGiamManh = true;
	}

	public static boolean isNhomCoPhieuOnDinh() {
		return nhomCoPhieuOnDinh;
	}

	public static void setNhomCoPhieuOnDinh() {
		for (String s: listTag)
			if (s.contains("Nhóm cổ phiếu ổn định"))
				Tag.nhomCoPhieuOnDinh = true;	}

	public static boolean isNhomCoPhieuPhanHoa() {
		return nhomCoPhieuPhanHoa;
	}

	public static void setNhomCoPhieuPhanHoa() {
		for (String s: listTag)
			if (s.contains("Nhóm cổ phiếu phân hóa"))
				Tag.nhomCoPhieuPhanHoa = true;
	}

	public static boolean isTrangThaiXDBDS() {
		return trangThaiXDBDS;
	}

	public static void setTrangThaiXDBDS() {
		for (String s: listTag)
			if (s.contains("Trạng thái nhóm xây dựng và bất động sản"))
				Tag.trangThaiXDBDS = true;
	}

	public static boolean isLietKeXDBDS() {
		return lietKeXDBDS;
	}

	public static void setLietKeXDBDS() {
		for (String s: listTag)
			if (s.contains("Cổ phiếu nhóm xây dựng và bất động sản"))
				Tag.lietKeXDBDS = true;
	}

	public static boolean isTrangThaiKhaiKhoang() {
		return trangThaiKhaiKhoang;
	}

	public static void setTrangThaiKhaiKhoang() {
		for (String s: listTag)
			if (s.contains("Trạng thái nhóm khai khoáng"))
				Tag.trangThaiKhaiKhoang = true;
	}

	public static boolean isLietKeKhaiKhoang() {
		return lietKeKhaiKhoang;
	}

	public static void setLietKeKhaiKhoang() {
		for (String s: listTag)
			if (s.contains("Cổ phiếu nhóm xây dựng và bất động sản"))
				Tag.lietKeKhaiKhoang = true;
	}

	public static boolean isTrangThaiSXNN() {
		return trangThaiSXNN;
	}

	public static void setTrangThaiSXNN() {
		for (String s: listTag)
			if (s.contains("Trạng thái nhóm sản xuất nông nghiệp"))
				Tag.trangThaiSXNN = true;
	}

	public static boolean isLietKeSXNN() {
		return lietKeSXNN;
	}

	public static void setLietKeSXNN() {
		for (String s: listTag)
			if (s.contains("Cổ phiếu nhóm sản xuất nông nghiệp"))
				Tag.lietKeSXNN = true;
	}

	public static boolean isTrangThaiSXTD() {
		return trangThaiSXTD;
	}

	public static void setTrangThaiSXTD() {
		for (String s: listTag)
			if (s.contains("Trạng thái nhóm sản xuất tiêu dùng"))
				Tag.trangThaiSXTD = true;
	}

	public static boolean isLietKeSXTD() {
		return lietKeSXTD;
	}

	public static void setLietKeSXTD() {
		for (String s: listTag)
			if (s.contains("Cổ phiếu nhóm sản xuất tiêu dùng"))
				Tag.lietKeSXTD = true;
	}

	public static boolean isTrangThaiCoPhieu() {
		return trangThaiCoPhieu;
	}

	public static void setTrangThaiCoPhieu() {
		for (String s: listTag)
			if (s.contains("Trạng thái cổ phiếu"))
				Tag.trangThaiCoPhieu = true;
	}
	
}
