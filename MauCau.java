package bai_tap_lon;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class MauCau {
	//attributes
	private SanGiaoDich sGD;
	private Tag tag;

	//constructors
	public MauCau() {
		
	}
	public MauCau(SanGiaoDich sGD, Tag tag){
		this.sGD = sGD;
		this.tag = tag;
	}
	
	public SanGiaoDich getsGD() {
		return sGD;
	}
	public Tag getTag() {
		return tag;
	}
	
	//method
	public String tongHopCau() {
		StringBuilder s = new StringBuilder();
		if (this.top1Tang().length() != 0)
			s.append(this.top1Tang() + '\n');
		if (this.top1Giam().length() != 0)
			s.append(this.top1Giam() + '\n');
		if (this.top3Tang().length() != 0)
			s.append(this.top3Tang() + '\n');
		if (this.top3Giam().length() != 0)
			s.append(this.top3Giam() + '\n');
		if (this.nnMua(tag.getListCP()).length() != 0)
			s.append(this.nnMua(tag.getListCP()) + '\n');
		if (this.nnBan(tag.getListCP()).length() != 0)
			s.append(this.nnBan(tag.getListCP()) + '\n');
		if (this.nnMuaBan(tag.getListCP()).length() != 0)
			s.append(this.nnMuaBan(tag.getListCP()) + '\n');
		if (this.thongTinSan().length() != 0)
			s.append(this.thongTinSan() + '\n');
		if (this.trangThaiSan().length() != 0)
			s.append(this.trangThaiSan() + '\n');
		if (this.xuHuongSan().length() != 0)
			s.append(this.xuHuongSan() + '\n');
		if (this.trangThaiDauKhi().length() != 0)
			s.append(this.trangThaiDauKhi() + '\n');
		if (this.trangThaiNganHang().length() != 0)
			s.append(this.trangThaiNganHang() + '\n');
		if (this.trangThaiDauKhi().length() != 0)
			s.append(this.lietKeDauKhi() + '\n');
		if (this.lietKeNganHang().length() != 0)
			s.append(this.lietKeNganHang() + '\n');
		if (this.lietKeNganHang().length() != 0)
			s.append(this.lietKeNganHang() + '\n');
		if (this.nhomCoPhieuTang().length() != 0)
			s.append(this.nhomCoPhieuTang() + '\n');
		if (this.trangThaiTran(tag.getListCP()).length() != 0)
			s.append(this.trangThaiTran(tag.getListCP()) + '\n');
		if (this.khopLenh(tag.getListCP()).length() != 0)
			s.append(this.khopLenh(tag.getListCP()) + '\n');
		if (this.dungGiaThamChieu().length() != 0)
			s.append(this.dungGiaThamChieu() + '\n');
		if (this.tuTruTang().length() != 0)
			s.append(this.tuTruTang() + '\n');
		if (this.tangHetBienDo().length() != 0)
			s.append(this.tangHetBienDo() + '\n');
		if (this.dienBienTraiChieu().length() != 0)
			s.append(this.dienBienTraiChieu() + '\n');
		if (this.dongLoatMatDiem().length() != 0)
			s.append(this.dongLoatMatDiem() + '\n');
		if (this.tuotDoc().length() != 0)
			s.append(this.tuotDoc() + '\n');
		if (this.chimTrongSacDo().length() != 0)
			s.append(this.chimTrongSacDo() + '\n');
		return s.toString();
	}

	public String top1Tang() {
		StringBuffer s = new StringBuffer();
		System.out.println(s.length());
		if (tag.getTopTang() == 1) {
			CoPhieu cp = sGD.getTopTang().get(0);
			s.append("Cổ phiếu ");
			s.append(cp.getTen() + " ");
			s.append("tăng cao nhất với ");
			s.append(cp.getBienDong()*sGD.getDonViGia());
			s.append(" đồng mỗi cổ phiếu.");
		}
		return s.toString();
	}
	
	public String top1Giam() {
		StringBuffer s = new StringBuffer();
		if (tag.getTopGiam() == 1) {
			CoPhieu cp = sGD.getTopGiam().get(0);
			s.append("Cổ phiếu ");
			s.append(cp.getTen() + " ");
			s.append("giảm nhiều nhất với ");
			s.append(cp.getBienDong()*sGD.getDonViGia()*(-1));
			s.append(" đồng mỗi cổ phiếu.");
		}
		return s.toString();
	}
	
	public String top3Tang() {
		StringBuffer s = new StringBuffer();
		if (tag.getTopTang() == 3) {
			CoPhieu cp1 = sGD.getTopTang().get(0);
			CoPhieu cp2 = sGD.getTopTang().get(1);
			CoPhieu cp3 = sGD.getTopTang().get(2);
			s.append("Dẫn đầu về mức tăng giá hôm nay gồm ");
			s.append(cp1.getTen() + " (+");
			s.append(cp1.getBienDong()*sGD.getDonViGia()+" đồng), ");
			s.append(cp2.getTen() + " (+");
			s.append(cp2.getBienDong()*sGD.getDonViGia()+" đồng), ");
			s.append(cp3.getTen() + " (+");
			s.append(cp3.getBienDong()*sGD.getDonViGia()+" đồng).");
		}
		return s.toString();
	}
	
	public String top3Giam() {
		StringBuffer s = new StringBuffer();
		if (tag.getTopGiam() == 3) {
			CoPhieu cp1 = sGD.getTopGiam().get(0);
			CoPhieu cp2 = sGD.getTopGiam().get(1);
			CoPhieu cp3 = sGD.getTopGiam().get(2);
			s.append("Top 3 cổ phiếu giảm điểm nhiều nhất gồm ");
			s.append(cp1.getTen() + " (-");
			s.append(cp1.getBienDong()*sGD.getDonViGia()*(-1)+" đồng), ");
			s.append(cp2.getTen() + " (-");
			s.append(cp2.getBienDong()*sGD.getDonViGia()*(-1)+" đồng), ");
			s.append(cp3.getTen() + " (-");
			s.append(cp3.getBienDong()*sGD.getDonViGia()*(-1)+" đồng).");
		}
		return s.toString();
	}
	
	public String nnMua(List<CoPhieu> dscp) {
		StringBuffer s = new StringBuffer();
		if (tag.isNnMua() == true)
			if (dscp.size() == 0) {
				Random rd = new Random();
				int r = rd.nextInt(sGD.getDSCP().size()-1);
				CoPhieu cp = sGD.getDSCP().get(r);
				if (cp.getNnMua()==0)
					s.append("Nhà đầu tư nước ngoài không mua vào cổ phiếu " + cp.getTen() + ".");
				else {
					s.append("Nhà đầu tư nước ngoài đã mua vào ");
					s.append(cp.getNnMua() + " cổ phiếu ");
					s.append(cp.getTen() + ".");
				}
			} else if (dscp.size() == 1) {
				CoPhieu cp = dscp.get(0);
				s.append("Nhà đầu tư nước ngoài đã mua vào ");
				s.append(cp.getNnMua() + " cổ phiếu ");
				s.append(cp.getTen() + ".");
			} else {
				s.append("Nhà đầu tư nước ngoài đã mua vào ");
				for (int i=0; i< dscp.size() - 1; i++) {
					s.append(dscp.get(i).getNnMua() + " cổ phiếu ");
					s.append(dscp.get(i).getTen() + ", ");
				}
				s.append("và " +dscp.get(dscp.size()-1).getNnMua() + " cổ phiếu ");
				s.append(dscp.get(dscp.size()-1).getTen() + ".");
			}
		return s.toString();
	}
	
	public String nnBan(List<CoPhieu> dscp) {
		StringBuffer s = new StringBuffer();
		if (tag.isNnBan() == true)
			if (dscp.size()==0) {
				Random rd = new Random();
				int r = rd.nextInt(sGD.getDSCP().size()-1);
				CoPhieu cp = sGD.getDSCP().get(r);
				if (cp.getNnBan()==0)
					s.append("Nhà đầu tư nước ngoài đã giữ lại cổ phiếu " + cp.getTen() + ".");
				else {
					s.append("Nhà đầu tư nước ngoài đã bán ra ");
					s.append(cp.getNnBan() + " cổ phiếu ");
					s.append(cp.getTen() + ".");
				}
			} else if (dscp.size() == 1) {
				CoPhieu cp = dscp.get(0);
				s.append("Nhà đầu tư nước ngoài đã bán ra ");
				s.append(cp.getNnBan() + " cổ phiếu ");
				s.append(cp.getTen() + ".");
			} else {
				s.append("Nhà đầu tư nước ngoài đã bán ra ");
				for (int i=0; i< dscp.size() -1; i++) {
					s.append(dscp.get(i).getNnBan() + " cổ phiếu ");
					s.append(dscp.get(i).getTen() + ", ");
				}
				s.append("và " + dscp.get(dscp.size()-1).getNnBan() + " cổ phiếu ");
				s.append(dscp.get(dscp.size()-1).getTen() + ".");
			} 
		return s.toString();
	}
	
	public String nnMuaBan(List<CoPhieu> dscp) {
		StringBuffer s = new StringBuffer();
		if (tag.isNnMua() == true && tag.isNnBan() == true) {
			if (dscp.size()==0) {
				Random rd = new Random();
				int r1 = rd.nextInt(sGD.getDSCP().size()-1);
				int r2 = rd.nextInt(sGD.getDSCP().size()-1);
				CoPhieu cp1 = sGD.getDSCP().get(r1);
				CoPhieu cp2 = sGD.getDSCP().get(r2);
				if (cp1.getNnMua()==0)
					s.append("Nhà đầu tư nước ngoài đã không mua vào cổ phiếu " + cp1.getTen());
				else {
					s.append("Nhà đầu tư nước ngoài đã mua vào ");
					s.append(cp1.getNnMua() + " cổ phiếu ");
					s.append(cp1.getTen());
				}
				s.append(", mặt khác họ ");
				if (cp2.getNnBan()==0)
					s.append("giữ lại cổ phiếu " + cp2.getTen() + ".");
				else {
					s.append("bán ra ");
					s.append(cp2.getNnBan() + " cổ phiếu ");
					s.append(cp2.getTen()+".");
				}
			} else {
				int i=0;
				s.append("Nhà đầu tư nước ngoài đã mua vào ");
				for (; i< dscp.size()/2; i++) {
					s.append(dscp.get(i).getNnMua() + " cổ phiếu ");
					s.append(dscp.get(i).getTen());
				}
				
				if(dscp.size()>1) {
					s.append(", đồng thời bán ra ");
					for (; i< dscp.size() -1; i++) {
						s.append(dscp.get(i).getNnBan() + " cổ phiếu ");
						s.append(dscp.get(i).getTen() + ", ");
					}
					s.append(dscp.get(dscp.size()-1).getNnBan() + " cổ phiếu ");
					s.append(dscp.get(dscp.size()-1).getTen() + ".");
				}
			}	
		}
		return s.toString();
	}
	
	public String thongTinSan() {
		StringBuffer s = new StringBuffer();
		if (tag.isThongTinSan()==true) {
			if (sGD.getDiemTuyetDoi()>0) {
				s.append("Chốt phiên giao dịch ngày, " + sGD.getTENCHISO());
				s.append(" tăng " + sGD.getDiemTuyetDoi() + " điểm,");
				s.append(" lên " + sGD.getDiemChiSo() + " điểm,");
				s.append(" chuyển nhượng " + sGD.getKlgd()*sGD.getDonViCP() + " cổ phiếu,");
				s.append(" tương đương " + sGD.getGtdg()*sGD.getDonViGia() + " đồng.");
			} else if (sGD.getDiemTuongDoi()<0) {
				s.append(sGD.getTENCHISO() + " bị trừ ");
				s.append(sGD.getDiemTuyetDoi() + " điểm, còn lại ");
				s.append(sGD.getDiemChiSo() + " điểm, chuyển nhượng ");
				s.append(sGD.getKlgd()*sGD.getDonViCP() + " chứng khoán, tương đương ");
				s.append(sGD.getGtdg()*sGD.getDonViGia() + " đồng.");
			} else {
				s.append(sGD.getTENCHISO() + " đứng ở ");
				s.append(sGD.getDiemChiSo() + " điểm ngay trước khi kết phiên, với ");
				s.append(sGD.getKlgd() + " giao dịch, tương đương ");
				s.append(sGD.getGtdg()*sGD.getDonViGia() + " đồng.");
			}
		}
		return s.toString();
	}
	
	public String trangThaiSan() {
		StringBuffer s = new StringBuffer();
		if (tag.isTrangThaiSan() == true) {
			if (sGD.getDiemTuongDoi() >= sGD.getMucTangManh()) {
				s.append(sGD.getTENCHISO() + " đã nới rộng đà tăng với ");
				s.append("sắc xanh lan tỏa toàn thị trường.");
			} else if (sGD.getDiemTuongDoi() >= sGD.getMucTangNhe()) {
				s.append("Sắc xanh chỉ le lói khi " + sGD.getTENCHISO());
				s.append("tăng " + sGD.getDiemTuyetDoi() + "(");
				s.append(sGD.getDiemTuongDoi() + "%).");
			} else if (sGD.getDiemTuongDoi() >= sGD.getMucGiamNhe()) {
				s.append("Sang phiên khớp lệnh liên tục, chỉ số ");
				s.append(sGD.getTENCHISO() + " cũng không có nhiều biến động ");
				s.append("khi xoay quanh mức " + sGD.getDiemChiSo() + " điểm.");
			} else if (sGD.getDiemTuongDoi() >= sGD.getMucGiamManh()) {
				s.append("Nhiều nhóm cổ phiếu đồng loạt chuyển sắc đỏ nhưng không mạnh nên ");
				s.append(sGD.getTENCHISO() + "giảm trong biên độ hẹp.");
			} else {
				s.append(sGD.getTENCHISO() + "chìm trong sắc đỏ trong toàn bộ thời gian giao dịch, ");
				s.append("kết phiên giảm tới " + sGD.getDiemTuongDoi()*(-1) + "%");
				s.append(" về " + sGD.getDiemChiSo() + " điểm.");
			}
		}
		return s.toString();
	}

	public String xuHuongSan() {
		StringBuffer s = new StringBuffer();
		if (tag.isXuHuongSan() == true) {
			if (sGD.getSoMaTang() > sGD.getSoMaGiam() && sGD.getSoMaTang() > sGD.getSoMaDung()) {
				s.append("Thị trường tiếp tục biểu hiện xu hướng tăng giá, ");
				s.append("nhiều khả năng " + sGD.getTENCHISO() + "sẽ dao động ");
				s.append("trong khoảng " + (sGD.getDiemChiSo()+10) + "-");
				s.append((sGD.getDiemChiSo()+20) + " điểm trong tuần này.");
			} else if (sGD.getSoMaGiam() > sGD.getSoMaTang() && sGD.getSoMaGiam() > sGD.getSoMaDung()) {
				s.append("Xu thế giảm của " + sGD.getTENCHISO());
				s.append(" vẫn chưa có dấu hiệu sẽ kết thúc.");
			} else {
				s.append("Nhiều nhà đầu tư nhận định thị trường sẽ đi lên trong sự nghi ngờ, ");
				s.append("trạng thái khó đoán định của " + sGD.getTENCHISO() + " ở thời điểm này ");
				s.append("đang cho thấy kịch bản trên có thể sẽ xảy ra.");
			}
		}
		return s.toString();
	}
	
	public String trangThaiDauKhi() {
		StringBuffer s = new StringBuffer();
		int tang = sGD.demMaTang(sGD.getNhomDauKhi());
		int giam = sGD.demMaGiam(sGD.getNhomDauKhi());
		int dung = sGD.demMaDung(sGD.getNhomDauKhi());
		if (tag.isTrangThaiDauKhi() == true) {
			if (tang > giam && tang > dung)
				s.append("Nhóm dầu khí nhuộm xanh với nhiều cổ phiếu tăng hết biên do.");
			else if (giam < tang && giam < dung) {
				s.append("Hàng loạt mã dầu khí đã lao dốc không phanh, ");
				s.append("trong bối cảnh giá dầu vẫn còn diễn biến phức tạp.");
			} else 
				s.append("Các cổ phiếu nhóm dầu khí dao động với xu hướng khó đoán định.");
		}
		return s.toString();
	}
	
	public String lietKeDauKhi() {						
		StringBuffer s = new StringBuffer();
		if (tag.isLietKeDauKhi() == true) {
			List<CoPhieu> dscp = new ArrayList<>();
			dscp.addAll(sGD.getNhomDauKhi());
			Set<CoPhieu> setCP = new HashSet<>();
			Random rd = new Random();
			if (dscp.size() == 0)
				s.append("Không có thông tin về cổ phiếu nhóm dầu khí.");
			else {	
				while (setCP.size() <= 5) {
					setCP.add(dscp.get(rd.nextInt(dscp.size())));
				}
				s.append("Nhóm dầu khí ghi nhận ");
				for (CoPhieu i: setCP) {
					s.append("mã " +i.getTen() + " " + i.getTrangThai());
					if (i.getBienDong() > 0)
						s.append(" " + i.getBienDong() + " điểm, ");
					else if (i.getBienDong() < 0)
						s.append(" " + i.getBienDong()*(-1) + " điểm, ");
					else s.append(", ");
				}
				s.append("là nhóm cổ phiếu quan trọng với thị trường.");
			}
		}
		return s.toString();
	}

	public String trangThaiNganHang() {					
		StringBuffer s = new StringBuffer();
		int tang = sGD.demMaTang(sGD.getNhomNganHang());
		int giam = sGD.demMaGiam(sGD.getNhomNganHang());
		int dung = sGD.demMaDung(sGD.getNhomNganHang());
		if (tag.isTrangThaiNganHang() == true) {
			if (tang > giam && tang > dung)
				s.append("Nhóm ngân hàng bật xanh, duy trì phong độ cao.");
			else if (giam < tang && giam < dung) {
				s.append("Cổ phiếu ngân hàng chìm trong sắc đỏ, ");
				s.append("gây ảnh hưởng lớn tới tâm lí thị trường.");
			} else 
				s.append("Trong suốt phiên, nhóm ngân hàng biến động với xu thế khó đoán định.");
		}
		return s.toString();
	}
	
	public String lietKeNganHang() {						
		StringBuffer s = new StringBuffer();
		if (tag.isLietKeNganHang() == true) {
			List<CoPhieu> dscp = new ArrayList<>();
			dscp.addAll(sGD.getNhomNganHang());
			Set<CoPhieu> setCP = new HashSet<>();
			Random rd = new Random();
			if (dscp.size() == 0)
				s.append("Không có thông tin về cổ phiếu nhóm ngân hàng.");
			else {
				while (setCP.size() <= 5) {
					setCP.add(dscp.get(rd.nextInt(dscp.size())));
				}
				s.append("Trong các cổ phiếu nhóm ngành ngân hàng: ");
				for (CoPhieu i: setCP) {
					s.append("mã " +i.getTen() + " " + i.getTrangThai());
					if (i.getBienDong() > 0)
						s.append(" " + i.getBienDong() + " điểm, ");
					else if (i.getBienDong() < 0)
						s.append(" " + i.getBienDong()*(-1) + " điểm, ");
					else s.append(", ");
				}
				s.append("giữ vai trò quan trọng với thị trường.");
			}
		}
		return s.toString();
	}
	
	public String nhomCoPhieuTang() {
		StringBuffer s = new StringBuffer();
		if (tag.isNhomCoPhieuTang() == true) {
			s.append("Trong phiên giao dịch hôm nay, màu xanh lá đến từ cổ phiếu ");
			int dem = 0;
			for(NhomCoPhieu nhom:sGD.getNhomCoPhieu()) {
				if (nhom.isTang() == true) {
					dem++;
					s.append(nhom.getTenNhom()+ " với đại diện là " + nhom.daiDienTang().getTen() + " tăng " + (float)nhom.daiDienTang().getBienDong()*100 +"%,");
				}
			}
			if (dem==0) s = new StringBuffer("Ngày hôm nay không có nhóm cổ phiếu nào tăng.");
		}
		System.out.println(s);
		return s.toString();
	}
	
	public String trangThaiCoPhieu(List<CoPhieu> dscp) {
		StringBuffer s = new StringBuffer();
		System.out.println(s);
		return s.toString();
	}
	
	public String trangThaiTran(List<CoPhieu> dscp){
		StringBuffer s = new StringBuffer();
		if(tag.isTrangThaiTran()== true){
			if(dscp.size()== 0) {
				Random rd = new Random();
				int r = rd.nextInt(sGD.getDSCP().size()-1);
				CoPhieu cp = sGD.getDSCP().get(r);
				s.append("Co phieu " + cp.getTen());

				if(cp.getGiaMax() == cp.getGiaTran()){
					s.append("co gia kich tran ");
				}
				else if(cp.getGiaMax() > cp.getGiaTran()){
					s.append("da vuot tren gia tran ");
				}
				else if(cp.getGiaMax() - cp.getGiaTran() < 0.5){
					s.append("dang sat gia tran ");
				}
				s.append("voi gia tran " + cp.getGiaTran()*sGD.getDonViGia()+ "dong ");
				s.append("va gia ban lon nhat la " + cp.getGiaMax()*sGD.getDonViGia() +"dong.");
			} else {
				s.append("dang o trang thai binh thuong (la gia ban nho hon gia tran).");
			}
		}
		else {
			for (int i=0; i< dscp.size() -1; i++) {
				s.append("Thong tin ve co phieu "+ dscp.get(i).getTen() + "la: ");
				s.append("Gia tran la " + dscp.get(i).getTen() +"dong ");
				s.append("va gia tran la " + dscp.get(i).getGiaTran() +"dong.");
				s.append("De dang ta thay ");
				s.append("Co phieu " + dscp.get(i).getTen());
				if(dscp.get(i).getGiaMax() == dscp.get(i).getGiaTran()){
					s.append("co gia kich tran. ");
				}
				else if(dscp.get(i).getGiaMax() > dscp.get(i).getGiaTran()){
					s.append("da vuot tren gia tran. ");
				}
				else if(dscp.get(i).getGiaMax() - dscp.get(i).getGiaTran() < 0.5){
					s.append("dang sat gia tran. ");
				}
				else{
					s.append("dang o trang thai binh thuong (la gia ban nho hon gia tran).");
				}
			}

		}
		return s.toString();
	}
	public String khopLenh(List<CoPhieu> dscp){
		StringBuffer s = new StringBuffer();
		if(tag.isKhopLenhTungCoPhieu() == true){
			if(dscp.size() == 0) {
				Random rd = new Random();
				int r = rd.nextInt(sGD.getDSCP().size()-1);
				CoPhieu cp = sGD.getDSCP().get(r);
				s.append("Co phieu " + cp.getTen());
				s.append(" co gia tri khop lenh la " + cp.getTongKLGD()*sGD.getDonViGia() + "dong.");
			}
			else {
				for (int i=0; i< dscp.size() -1; i++) {
					s.append("Co phieu " + dscp.get(i).getTen());
					s.append(" co gia tri khop lenh la " + dscp.get(i).getTongKLGD()*sGD.getDonViGia() + "dong." );
				}
			}
		}
		return s.toString();
	}
	
	public String dungGiaThamChieu() {
		StringBuffer s = new StringBuffer();
		if (tag.isDungGiaThamChieu() == true) {
			int countDungGia =0;
			for (CoPhieu i : sGD.getDSCP())
				if (i.getBienDong() == 0) {
					countDungGia++;
					s.append(i.getTen());
					if (countDungGia <4)
						s.append(", ");
					if (countDungGia==4) {
						s.append(" Ä‘á»©ng giÃ¡ tham chiáº¿u");
						System.out.println(s);
						return s.toString();
					}
						
				}
			s.append(" Ä‘á»©ng giÃ¡ tham chiáº¿u.");
		}
		return s.toString();
	}
	
	
	public String tuTruTang() {
		StringBuffer s = new StringBuffer();
		if (tag.isTuTruTang() == true) {
			CoPhieu cp1 = sGD.getTopTang().get(0);
			CoPhieu cp2 = sGD.getTopTang().get(1);
			CoPhieu cp3 = sGD.getTopTang().get(2);
			CoPhieu cp4 = sGD.getTopTang().get(3);
			s.append("HOSE ghi nhận tứ trụ ");
			s.append(cp1.getTen() + ", ");
			s.append(cp2.getTen() + ", ");
			s.append(cp3.getTen() + ", ");
			s.append(cp4.getTen() + " cộng ");
			s.append(cp4.getBienDong()* sGD.getDonViGia());
			s.append("-");
			s.append(cp1.getBienDong()* sGD.getDonViGia());
			s.append(" đồng.");
		}
		return s.toString();
	}
	
	public String tangHetBienDo() {
		StringBuffer s = new StringBuffer();
		if (tag.isTangHetBienDo() == true) {
			int countGiaTran =0;
			for (CoPhieu i : sGD.getDSCP())
				if (i.getGiaChot() == i.getGiaTran()) {
					countGiaTran++;
					s.append(i.getTen());
					if (countGiaTran < 5)
						s.append(", ");
					if (countGiaTran == 5) {
						s.append(" vươn lên hết biên độ.");
						System.out.println(s);
						return s.toString();
					}
						
				}
		}
		s.append(" vươn lên hết biên độ.");
		return s.toString();
	}
	
	public String dienBienTraiChieu() {
		StringBuffer s = new StringBuffer();
		if (tag.isDienBienTraiChieu() == true) {
			CoPhieu cp1 = sGD.getTop1Giam(sGD.getDSCP());
			CoPhieu cp2 = sGD.getTopTang().get(0);
			CoPhieu cp3 = sGD.getTopTang().get(1);
			s.append("Bộ ba ");
			s.append(cp1.getTen()+ ", ");
			s.append(cp2.getTen()+ ", ");
			s.append(cp3.getTen()+ " diễn biến trái chiều.");
		}
		return s.toString();
	}
	
	public String dongLoatMatDiem() {
		StringBuffer s = new StringBuffer();
		if (tag.isDongLoatMatDiem() == true) {
			CoPhieu cp1 = sGD.getTopGiam().get(0);
			CoPhieu cp2 = sGD.getTopGiam().get(1);
			CoPhieu cp3 = sGD.getTopGiam().get(2);
			s.append(cp1.getTen()+ ", ");
			s.append(cp2.getTen()+ " và ");
			s.append(cp3.getTen()+ " đều đồng loạt mất điểm.");
		}
		return s.toString();
	}
	
	public String tuotDoc() {
		StringBuffer s = new StringBuffer();
		if (tag.isTuotDoc() == true) {
			CoPhieu cp1 = sGD.getTopGiam().get(0);
			CoPhieu cp2 = sGD.getTopGiam().get(1);
			CoPhieu cp3 = sGD.getTopGiam().get(2);
			CoPhieu cp4 = sGD.getTopGiam().get(3);
			CoPhieu cp5 = sGD.getTopGiam().get(4);
			s.append("Tuột dốc từ ");
			s.append(cp5.getBienDong()+ "-");
			s.append(cp1.getBienDong()+ "điểm: ");
			s.append(cp1.getTen()+ ", ");
			s.append(cp2.getTen()+ ", ");
			s.append(cp3.getTen()+ ", ");
			s.append(cp4.getTen()+ ", ");
			s.append(cp5.getTen()+ "... ");
		}

		return s.toString();
	}
	
	public String chimTrongSacDo() {
		StringBuffer s = new StringBuffer();
		if (tag.isChimTrongSacDo() == true){
			int countGiam =0;
			for (CoPhieu i : sGD.getDSCP())
				if (i.getBienDong() < 0){
					countGiam++;
					s.append(i.getTen());
					if (countGiam < 5)
						s.append(", ");
					if (countGiam == 5) {
						s.append(" ... chìm trong sắc đỏ.");
						System.out.println(s);
						return s.toString();
					}
						
				}
		}
		s.append(" ... chìm trong sắc đỏ.");
		return s.toString();
		}
	}