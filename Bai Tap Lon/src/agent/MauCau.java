package agent;

import java.util.List;
import java.util.Random;
import java.util.Set;

import database.*;

import java.util.HashSet;
import java.util.ArrayList;

public class MauCau {
	//attributes
	private SanGiaoDich sGD;

	//constructors
	public MauCau() {
		
	}
	public MauCau(SanGiaoDich sGD){
		this.sGD = sGD;
	}
	
	public SanGiaoDich getsGD() {
		return sGD;
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
		if (this.nnMua(Tag.getListCP()).length() != 0)
			s.append(this.nnMua(Tag.getListCP()) + '\n');
		if (this.nnBan(Tag.getListCP()).length() != 0)
			s.append(this.nnBan(Tag.getListCP()) + '\n');
		if (this.nnMuaBan(Tag.getListCP()).length() != 0)
			s.append(this.nnMuaBan(Tag.getListCP()) + '\n');
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
		if (this.lietKeDauKhi().length() != 0)
			s.append(this.lietKeDauKhi() + '\n');
		if (this.lietKeNganHang().length() != 0)
			s.append(this.lietKeNganHang() + '\n');
		if (this.nhomCoPhieuTang().length() != 0)
			s.append(this.nhomCoPhieuTang() + '\n');
		if (this.trangThaiTran(Tag.getListCP()).length() != 0)
			s.append(this.trangThaiTran(Tag.getListCP()) + '\n');
		if (this.khopLenh(Tag.getListCP()).length() != 0)
			s.append(this.khopLenh(Tag.getListCP()) + '\n');
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
		if (this.vhlDoSan().length() != 0)
			s.append(this.vhlDoSan() + '\n');
		
		if (this.vhlTran().length() != 0)
			s.append(this.vhlTran() + '\n');
	
		if (this.vhlThamChieu().length() != 0)
			s.append(this.vhlThamChieu() + '\n');
		
		if (this.vhlGiuGia().length() != 0)
			s.append(this.vhlGiuGia() + '\n');
	
		if (this.vhlXanh().length() != 0)
			s.append(this.vhlXanh() + '\n');

		if (this.trangThaiCoPhieu(Tag.getListCP()).length() != 0)
			s.append(this.trangThaiCoPhieu(Tag.getListCP()) + '\n');
		if (this.bcDieuChinhNhe().length() != 0)
			s.append(this.bcDieuChinhNhe() + '\n');

		if (this.bcGiamNhe().length() != 0)
			s.append(this.bcGiamNhe() + '\n');
		
		if (this.dungGiaThamChieu().length() != 0)
			s.append(this.dungGiaThamChieu() + '\n');
		
		if (this.trangThaiXDBDS().length() != 0)
			s.append(this.trangThaiXDBDS() + '\n');
		
		if (this.lietKeXDBDS().length() != 0)
			s.append(this.lietKeXDBDS() + '\n');
		
		if (this.trangThaiKhaiKhoang().length() != 0)
			s.append(this.trangThaiKhaiKhoang() + '\n');
		
		if (this.lietKeKhaiKhoang().length() != 0)
			s.append(this.lietKeKhaiKhoang() + '\n');
		
		if (this.trangThaiSXNN().length() != 0)
			s.append(this.trangThaiSXNN() + '\n');
		if (this.lietKeSXNN().length() != 0)
			s.append(this.lietKeSXNN() + '\n');
		if (this.trangThaiSXTD().length() != 0)
			s.append(this.trangThaiSXTD() + '\n');
	
		if (this.lietKeSXTD().length() != 0)
			s.append(this.lietKeSXTD() + '\n');
		
		if (this.nhomCoPhieuTang().length() != 0)
			s.append(this.nhomCoPhieuTang() + '\n');
		
		if (this.nhomCoPhieuTangNhanh().length() != 0)
			s.append(this.nhomCoPhieuTangNhanh() + '\n');
		
		if (this.nhomCoPhieuGiam().length() != 0)
			s.append(this.nhomCoPhieuGiam() + '\n');
		if (this.nhomCoPhieuGiamManh().length() != 0)
			s.append(this.nhomCoPhieuGiamManh() + '\n');
		
		if (this.nhomCoPhieuOnDinh().length() != 0)
			s.append(this.nhomCoPhieuOnDinh() + '\n');
		if (this.nhomCoPhieuPhanHoa().length() != 0)
			s.append(this.nhomCoPhieuPhanHoa() + '\n');
		return s.toString();
	}

	public String top1Tang() {
		StringBuffer s = new StringBuffer();
		System.out.println(s.length());
		if (Tag.isTop1Tang() == true) {
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
		if (Tag.isTop1Giam() == true) {
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
		if (Tag.isTop3Tang() == true) {
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
		if (Tag.isTop3Giam() == true) {
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
		if (Tag.isNnMua() == true)
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
		if (Tag.isNnBan() == true)
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
		if (Tag.isNnMua() == true && Tag.isNnBan() == true) {
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
		if (Tag.isThongTinSan()==true) {
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
		if (Tag.isTrangThaiSan() == true) {
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
		if (Tag.isXuHuongSan() == true) {
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
		if (Tag.isTrangThaiDauKhi() == true) {
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
		if (Tag.isLietKeDauKhi() == true) {
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
		if (Tag.isTrangThaiNganHang() == true) {
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
		if (Tag.isLietKeNganHang() == true) {
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
	
	public String trangThaiKhaiKhoang(){
		StringBuffer s = new StringBuffer();
		if (Tag.isTrangThaiKhaiKhoang() == true) {
			NhomCoPhieu nhomChon = null;
			for(NhomCoPhieu nhom: sGD.getNhomCoPhieu())
				if (nhom.getTenNhom().equals("Nhóm khai khoáng")) nhomChon = nhom;
			//
			if (nhomChon.isTang()) s.append("Các cổ phiếu " + nhomChon.getTenNhom()+ " có xu hướng tăng với " + nhomChon.countTang() + " mã tăng. ");
			else if (nhomChon.isGiam()) s.append("Các cổ phiếu " + nhomChon.getTenNhom()+ " có xu hướng giảm " + nhomChon.countGiam() + " mã giảm. ");
			else if (nhomChon.isOnDinh()) s.append("Các cổ phiếu" + nhomChon.getTenNhom()+ " có xu hướng ổn định. ");
			else s.append("Các cố phiếu " + nhomChon.getTenNhom()+ " có sự phân hoá " + nhomChon.countTang() + " mã tăng và" + nhomChon.countGiam() + " mã giảm. ");
		}
		return s.toString();
	}
	
	public String lietKeKhaiKhoang() {
		StringBuffer s = new StringBuffer();
		if (Tag.isLietKeKhaiKhoang() == true) {
			NhomCoPhieu nhomChon = null;
			for(NhomCoPhieu nhom: sGD.getNhomCoPhieu())
				if (nhom.getTenNhom().equals("Nhóm khai khoáng")) nhomChon = nhom;
			//
			s.append(nhomChon.getTenNhom() + " ghi nhận mã ");
			s.append(nhomChon.getDanhSachCP().get(0).getTen());
			if (nhomChon.getDanhSachCP().get(0).getBienDong()>0) s.append(" tăng " + nhomChon.getDanhSachCP().get(0).getBienDong() +" điểm, ");
			else s.append(" giảm " + nhomChon.getDanhSachCP().get(0).getBienDong()*-1 +" điểm, ");
			s.append(nhomChon.getDanhSachCP().get(1).getTen());
			if (nhomChon.getDanhSachCP().get(1).getBienDong()>0) s.append(" tăng " + nhomChon.getDanhSachCP().get(1).getBienDong() +" điểm, ");
			else s.append(" giảm " + nhomChon.getDanhSachCP().get(1).getBienDong()*-1 +" điểm, ");
		}
		return s.toString();
	}
	
	public String trangThaiXDBDS() {
		StringBuffer s = new StringBuffer();
		if (Tag.isTrangThaiXDBDS() == true) {
			NhomCoPhieu nhomChon = null;
			for(NhomCoPhieu nhom: sGD.getNhomCoPhieu())
				if (nhom.getTenNhom().equals("Nhóm xây dựng và bất động sản")) nhomChon = nhom;
			//
			if (nhomChon.isTang()) s.append("Các cổ phiếu " + nhomChon.getTenNhom()+ " có xu hướng tăng với " + nhomChon.countTang() + " mã tăng. ");
			else if (nhomChon.isGiam()) s.append("Các cổ phiếu " + nhomChon.getTenNhom()+ " có xu hướng giảm với " + nhomChon.countGiam() + " mã giảm. ");
			else if (nhomChon.isOnDinh()) s.append("Các cổ phiếu " + nhomChon.getTenNhom()+ " có xu hướng ổn định ");
			else s.append("Các cố phiếu " + nhomChon.getTenNhom()+ " có sự phân hoá với " + nhomChon.countTang() + " mã tăng và " + nhomChon.countGiam() + " mã giảm. ");
		}
		return s.toString();
	}
	
	public String lietKeXDBDS() {
		StringBuffer s = new StringBuffer();
		if (Tag.isLietKeXDBDS() == true) {
			NhomCoPhieu nhomChon = null;
			for(NhomCoPhieu nhom: sGD.getNhomCoPhieu())
				if (nhom.getTenNhom().equals("Nhóm xây dựng và bất động sản")) nhomChon = nhom;
			//
			s.append(nhomChon.getTenNhom() + " ghi nhận mã ");
			s.append(nhomChon.getDanhSachCP().get(0).getTen());
			if (nhomChon.getDanhSachCP().get(0).getBienDong()>0) s.append(" tăng " + nhomChon.getDanhSachCP().get(0).getBienDong() +" điểm, ");
			else s.append(" giảm " + nhomChon.getDanhSachCP().get(0).getBienDong()*-1 +" điểm , ");
			s.append(nhomChon.getDanhSachCP().get(1).getTen());
			if (nhomChon.getDanhSachCP().get(1).getBienDong()>0) s.append(" tăng " + nhomChon.getDanhSachCP().get(1).getBienDong() +" điểm, ");
			else s.append(" giảm " + nhomChon.getDanhSachCP().get(1).getBienDong()*-1 +" điểm, ");
		}
		return s.toString();
	}
	
	public String trangThaiSXNN() {//ten phuong thuc
		StringBuffer s = new StringBuffer();
		if (Tag.isTrangThaiSXNN() == true) {//ten tag
			NhomCoPhieu nhomChon = null;
			for(NhomCoPhieu nhom: sGD.getNhomCoPhieu())
				if (nhom.getTenNhom().equals("Nhóm sản xuất nông nghiệp")) nhomChon = nhom;//ten nhom
			//
			if (nhomChon.isTang()) s.append("Các cổ phiếu " + nhomChon.getTenNhom()+ " có xu hướng tăng với " + nhomChon.countTang() + " mã tăng. ");
			else if (nhomChon.isGiam()) s.append("Các cổ phiếu " + nhomChon.getTenNhom()+ " có xu hướng giảm với " + nhomChon.countGiam() + " mã giảm. ");
			else if (nhomChon.isOnDinh()) s.append("Các cổ phiếu " + nhomChon.getTenNhom()+ " có xu hướng giữ ổn định. ");
			else s.append("Các cổ phiếu " + nhomChon.getTenNhom()+ " có sự phân hóa với " + nhomChon.countTang() + " mã tăng và " + nhomChon.countGiam() + " mã giảm. ");
		}
		return s.toString();
	}
	
	public String lietKeSXNN() {//ten phuong thuc
		StringBuffer s = new StringBuffer();
		if (Tag.isLietKeSXNN() == true) {//ten tag
			NhomCoPhieu nhomChon = null;
			for(NhomCoPhieu nhom: sGD.getNhomCoPhieu())
				if (nhom.getTenNhom().equals("Nhóm sản xuất nông nghiệp")) nhomChon = nhom;//ten nhom
			//
			s.append(nhomChon.getTenNhom() + " ghi nhận mã ");
			s.append(nhomChon.getDanhSachCP().get(0).getTen());
			if (nhomChon.getDanhSachCP().get(0).getBienDong()>0) s.append(" tăng " + nhomChon.getDanhSachCP().get(0).getBienDong() +" điểm, ");
			else s.append(" giảm " + nhomChon.getDanhSachCP().get(0).getBienDong()*-1 +" điểm, ");
			s.append(nhomChon.getDanhSachCP().get(1).getTen());
			if (nhomChon.getDanhSachCP().get(1).getBienDong()>0) s.append(" tăng " + nhomChon.getDanhSachCP().get(1).getBienDong() +" điểm, ");
			else s.append(" giảm " + nhomChon.getDanhSachCP().get(1).getBienDong()*-1 +" điểm, ");
		}
		return s.toString();
	}	
	
	public String trangThaiSXTD() {//ten phuong thuc
		StringBuffer s = new StringBuffer();
		if (Tag.isTrangThaiSXTD() == true) {//ten tag
			NhomCoPhieu nhomChon = null;
			for(NhomCoPhieu nhom: sGD.getNhomCoPhieu())
				if (nhom.getTenNhom().equals("Nhóm sản xuất và tiêu dùng")) nhomChon = nhom;//ten nhom
			//
			if (nhomChon.isTang()) s.append("Các cổ phiếu " + nhomChon.getTenNhom()+ " có xu hướng tăng với " + nhomChon.countTang() + " mã tăng. ");
			else if (nhomChon.isGiam()) s.append("Các cổ phiếu " + nhomChon.getTenNhom()+ " có xu hướng giảm với " + nhomChon.countGiam() + " mã giảm. ");
			else if (nhomChon.isOnDinh()) s.append("Các cổ phiếu " + nhomChon.getTenNhom()+ " có xu hướng giữ ổn định. ");
			else s.append("Các cổ phiếu " + nhomChon.getTenNhom()+ " có sự phân hóa với " + nhomChon.countTang() + " mã tăng va " + nhomChon.countGiam() + " mã giảm. ");
		}
		return s.toString();
	}
	
	public String lietKeSXTD() {//ten phuong thuc
		StringBuffer s = new StringBuffer();
		if (Tag.isLietKeSXTD() == true) {//ten tag
			NhomCoPhieu nhomChon = null;
			for(NhomCoPhieu nhom: sGD.getNhomCoPhieu())
				if (nhom.getTenNhom().equals("Nhóm sản xuất và tiêu dùng")) nhomChon = nhom;//ten nhom
			//
			s.append(nhomChon.getTenNhom() + " ghi nhận mã ");
			s.append(nhomChon.getDanhSachCP().get(0).getTen());
			if (nhomChon.getDanhSachCP().get(0).getBienDong()>0) s.append(" tăng " + nhomChon.getDanhSachCP().get(0).getBienDong() +" điểm, ");
			else s.append(" giảm " + nhomChon.getDanhSachCP().get(0).getBienDong()*-1 +" điểm, ");
			s.append(nhomChon.getDanhSachCP().get(1).getTen());
			if (nhomChon.getDanhSachCP().get(1).getBienDong()>0) s.append(" tăng " + nhomChon.getDanhSachCP().get(1).getBienDong() +" điểm, ");
			else s.append(" giảm " + nhomChon.getDanhSachCP().get(1).getBienDong()*-1 +" điểm, ");
		}
		return s.toString();
	}

	public String nhomCoPhieuTang() {
		StringBuffer s = new StringBuffer();
		if (Tag.isNhomCoPhieuTang() == true) {
			s.append("Trong phiên giao dịch hôm nay, màu xanh lá đến từ cổ phiếu ");
			int dem = 0;
			for(NhomCoPhieu nhom:sGD.getNhomCoPhieu()) {
				if (nhom.isTang() == true) {
					dem++;
					s.append(nhom.getTenNhom()+ " với đại diện là " + nhom.daiDienTang().getTen() + " tăng " + (float)nhom.daiDienTang().getBienDong() +" điểm, ");
				}
			}
			if (dem==0) s = new StringBuffer("Ngày hôm nay không có nhóm cổ phiếu nào tăng.");
		}
		return s.toString();
	}
	
	public String nhomCoPhieuTangNhanh() {
		StringBuffer s = new StringBuffer();
		NhomCoPhieu nhomTangNhanh = null;
		if (Tag.isNhomCoPhieuTangNhanh() == true) {
			int dem = 0;
			for(NhomCoPhieu nhom:sGD.getNhomCoPhieu()) {
				if (nhom.isTang() == true) {
					if (nhomTangNhanh == null) nhomTangNhanh = nhom;
					if (nhom.getKiVong() > nhomTangNhanh.getKiVong())
						nhomTangNhanh = nhom;
					dem++;
				}
			}
			if (dem ==0 || nhomTangNhanh.getKiVong()<2) s = new StringBuffer("Ngày hôm nay không có nhóm cổ phiếu nào tăng nhanh");
			else s = new StringBuffer("Nhóm cổ phiếu " + nhomTangNhanh.getTenNhom() + " tăng mạnh trong phiên giao dịch hôm nay, đại diện là cổ phiếu " + nhomTangNhanh.daiDienTang().getTen() + " với mức tăng ấn tượng là " + nhomTangNhanh.daiDienTang().getBienDong() +" điểm. ");
		}
		System.out.println(s);
		return s.toString();
	}
	
	public String nhomCoPhieuGiam() {
		StringBuffer s = new StringBuffer();
		if (Tag.isNhomCoPhieuGiam() == true) {
			s.append("Màu đỏ trong phiên giao dịch hôm nay chủ yếu đến từ nhóm cổ phiểu ");
			int dem = 0;
			for(NhomCoPhieu nhom:sGD.getNhomCoPhieu()) {
				if (nhom.isGiam() == true) {
					dem++;
					s.append(nhom.getTenNhom()+ " với đại diện là " + nhom.daiDienGiam().getTen() + " giảm " + (float)nhom.daiDienGiam().getBienDong()*-1 +" điểm, ");
				}
			}
			if (dem==0) s = new StringBuffer("Ngày hôm nay không có nhóm cổ phiếu nào giảm. ");
		}
		System.out.println(s);
		return s.toString();
	}
	
	public String nhomCoPhieuGiamManh() {
		StringBuffer s = new StringBuffer();
		NhomCoPhieu nhomGiamManh = null;
		if (Tag.isNhomCoPhieuGiamManh() == true) {
			int dem = 0;
			for(NhomCoPhieu nhom:sGD.getNhomCoPhieu()) {
				if (nhom.isGiam() == true) {
					if (nhomGiamManh == null) nhomGiamManh = nhom;
					if (nhom.getKiVong() < nhomGiamManh.getKiVong())
						nhomGiamManh = nhom;
					dem++;
				}
			}
			if (dem ==0 || nhomGiamManh.getKiVong()>-2) s = new StringBuffer("Ngày hôm nay không có nhóm cổ phiếu nào giảm mạnh ");
			else s = new StringBuffer("Tin xấu cho các nhà đầu tư " + nhomGiamManh.getTenNhom() + " khi mã này giảm mạnh, đặc biệt là " + nhomGiamManh.daiDienGiam().getTen() + " về cuối phiên giảm tận " + nhomGiamManh.daiDienGiam().getBienDong()*-1 +" điểm. ");
		}
		System.out.println(s);
		return s.toString();
	}
	
	public String nhomCoPhieuOnDinh() {
		StringBuffer s = new StringBuffer();
		if (Tag.isNhomCoPhieuOnDinh() == true) {
			s.append("Bất chấp sự biến động của sàn giao dịch ");
			int dem = 0;
			for(NhomCoPhieu nhom:sGD.getNhomCoPhieu()) {
				if (nhom.isOnDinh() == true) {
					dem++;
					s.append(", " + nhom.getTenNhom());
				}
			}
			if (dem>0) s.append("vẫn giữ ở mức ổn định đều. ");
			else s = new StringBuffer("Ngày hôm nay không có nhóm cổ phiếu nào ổn định. ");
		}
		System.out.println(s);
		return s.toString();
	}
	
	public String nhomCoPhieuPhanHoa() {
		StringBuffer s = new StringBuffer();
		NhomCoPhieu nhomPhanHoa = null;
		if (Tag.isNhomCoPhieuPhanHoa() == true) {
			s.append("Một số nhà đầu tư quan ngại khi mã nhóm cổ phiếu ");
			for(NhomCoPhieu nhom:sGD.getNhomCoPhieu()) {
				if (nhomPhanHoa == null) nhomPhanHoa = nhom;
				if (nhom.getDoLechChuan() > nhomPhanHoa.getDoLechChuan()) nhomPhanHoa = nhom;
			}
			if (nhomPhanHoa.getDoLechChuan() > 0.65) s.append(nhomPhanHoa.getTenNhom() + " có sự phân hóa rõ rệt khi mà " + nhomPhanHoa.daiDienTang().getTen() + " tăng " + nhomPhanHoa.daiDienTang().getBienDong() + " điểm trong khi mà " + nhomPhanHoa.daiDienGiam().getTen() + " giảm " + nhomPhanHoa.daiDienGiam().getBienDong()*-1 + " điểm. ");
			else s = new StringBuffer("Ngày hôm nay không có nhóm cổ phiếu nào phân hóa rõ rệt. ");
		}
		System.out.println(s);
		return s.toString();
	}
	
	public String trangThaiCoPhieu(List<CoPhieu> dscp) {
		StringBuffer s = new StringBuffer();
		if (Tag.isTrangThaiCoPhieu() == true)
			if (dscp.size() == 0) {
				Random rd = new Random();
				int r = rd.nextInt(sGD.getDSCP().size()-1);
				CoPhieu cp = sGD.getDSCP().get(r);
				s.append("Mã cổ phiếu " + cp.getTen() + " ");
				s.append(cp.getTrangThai());
				if (cp.getBienDong() > 0)
					s.append(cp.getBienDong() + " điểm.");
				else if(cp.getBienDong() < 0)
					s.append(cp.getBienDong()*(-1) + " điểm.");
				else s.append(".");
			} else if (dscp.size() == 1) {
				CoPhieu cp = dscp.get(0);
				s.append("Mã cổ phiếu " + cp.getTen() + " ");
				if (cp.getBienDong() > 0)
					s.append(cp.getBienDong() + " điểm.");
				else if(cp.getBienDong() < 0)
					s.append(cp.getBienDong()*(-1) + " điểm.");
				else s.append(".");
			} else {
				s.append("Mã cổ phiếu ");
				for (int i=0; i< dscp.size() - 1; i++) {
					CoPhieu cp = dscp.get(i);
					s.append(cp.getTen() + " ");
					if (cp.getBienDong() > 0)
						s.append(cp.getBienDong() + " điểm, ");
					else if(cp.getBienDong() < 0)
						s.append(cp.getBienDong()*(-1) + " điểm, ");
					else s.append(", ");
				}
				s.append("và " +dscp.get(dscp.size()-1).getTen() + " ");
				s.append(dscp.get(dscp.size()-1).getTrangThai());
				if (dscp.get(dscp.size()-1).getBienDong() > 0)
					s.append(dscp.get(dscp.size()-1).getBienDong() + " điểm.");
				else if(dscp.get(dscp.size()-1).getBienDong() < 0)
					s.append(dscp.get(dscp.size()-1).getBienDong()*(-1) + " điểm.");
				else s.append(".");
			}
		return s.toString();
	}
	
	public String trangThaiTran(List<CoPhieu> dscp){
		StringBuffer s = new StringBuffer();
		if(Tag.isTrangThaiTran()== true){
			if(dscp.size()== 0) {
				Random rd = new Random();
				int r = rd.nextInt(sGD.getDSCP().size()-1);
				CoPhieu cp = sGD.getDSCP().get(r);
				s.append("Cổ phiếu " + cp.getTen());
				
				if(cp.getGiaMax() == cp.getGiaTran())
					s.append("có gia kich tran.");
				else if(cp.getGiaMax() > cp.getGiaTran())
					s.append("da vuot tren gia tran.");
				else if(cp.getGiaMax() - cp.getGiaTran() < 0.5)
					s.append("dang sat gia tran.");
				else 
					s.append("dang o trang thai binh thuong (la gia ban nho hon gia tran).");
			} else {
				for (int i=0; i< dscp.size() - 1; i++) {
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
		}
		return s.toString();
	}
	
	public String khopLenh(List<CoPhieu> dscp){
		StringBuffer s = new StringBuffer();
		if(Tag.isKhopLenhTungCoPhieu() == true){
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
					s.append(" co gia tri khop lenh la " + dscp.get(i).getTongKLGD()*sGD.getDonViGia() + "dong." + '\n' );
				}
			}
		}
		return s.toString();
	}
	
	public String dungGiaThamChieu() {
		StringBuffer s = new StringBuffer();
	if (Tag.isDungGiaThamChieu() == true)
	{
		int countDungGia =0;
		for (CoPhieu i : sGD.getDSCP())
			if ( i.getBienDong() == 0 )
			{
				countDungGia++;
				s.append(i.getTen());
				if (countDungGia <4)
					s.append(", ");
				if (countDungGia==4)
					break;	
			}
		s.append(" đứng giá tham chiếu.");
	}
	return s.toString();
	}
	
	
	public String tuTruTang() {
	StringBuffer s = new StringBuffer();
	if (Tag.isTuTruTang() == true)
	{
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
	if (Tag.isTangHetBienDo() == true)
	{
		int countGiaTran =0;
		for (CoPhieu i : sGD.getDSCP())
			if ( i.getGiaChot() == i.getGiaTran() )
			{
				countGiaTran++;
				s.append(i.getTen());
				if (countGiaTran < 5)
					s.append(", ");
				if (countGiaTran == 5)
					break;
					
			}
		s.append(" vươn lên hết biên độ.");
	}
	
	return s.toString();
	}
	
	public String dienBienTraiChieu() {
	StringBuffer s = new StringBuffer();
	if (Tag.isDienBienTraiChieu() == true)
	{
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
	if (Tag.isDongLoatMatDiem() == true)
	{
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
	if (Tag.isTuotDoc())
	{
		CoPhieu cp1 = sGD.getTopGiam().get(0);
		CoPhieu cp2 = sGD.getTopGiam().get(1);
		CoPhieu cp3 = sGD.getTopGiam().get(2);
		CoPhieu cp4 = sGD.getTopGiam().get(3);
		CoPhieu cp5 = sGD.getTopGiam().get(4);
		s.append("Tuột dốc từ ");
		s.append(cp5.getBienDong()+ "-");
		s.append(cp1.getBienDong()+ " điểm: ");
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
	if (Tag.isChimTrongSacDo()==true)
	{
		int countGiam =0;
		for (CoPhieu i : sGD.getDSCP())
			if ( i.getBienDong() < 0 )
			{
				countGiam++;
				s.append(i.getTen());
				if (countGiam < 5)
					s.append(", ");
				if (countGiam == 5)
					break;
					
			}
		s.append(" ... chìm trong sắc đỏ");
	}
	
	return s.toString();
	}
	
	public String vhlDoSan() {
		StringBuffer s = new StringBuffer();
		if (Tag.isVonHoaLon() == true)
		{
			s.append("Cổ phiếu vốn hóa lớn tại HOSE gồm: ");
			int counter=0;
			for (CoPhieu i : sGD.getNhomCoPhieuByName("Nhóm vốn hóa lớn").getDanhSachCP())
				if (i.getBienDong()<0)
				{
					counter++;
					s.append(i.getTen());
					if (counter<3) s.append(", ");
					if (counter == 3) break;
				}
			s.append("... đồng loạt đỏ sàn. ");
		}
		return s.toString();
	}
	
	public String vhlTran() {
		StringBuffer s = new StringBuffer();
		if (Tag.isVonHoaLon() == true)
		{
			s.append("Hàng loạt cổ phiếu vốn hóa lớn: ");
			int counter=0;
			for (CoPhieu i : sGD.getNhomCoPhieuByName("Nhóm vốn hóa lớn").getDanhSachCP())
				if (i.getGiaChot() == i.getGiaTran())
				{
					counter++;
					s.append(i.getTen());
					if (counter<3) s.append(", ");
					if (counter == 3) break;
				}
			s.append("... cùng giao dịch ở giá trần.");
		}
		return s.toString();
	}
	
	public String vhlThamChieu() {
		StringBuffer s = new StringBuffer();
		if (Tag.isVonHoaLon() == true)
		{
			s.append("Những mã vốn hóa lớn: ");
			int counter=0;
			for (CoPhieu i : sGD.getNhomCoPhieuByName("Nhóm vốn hóa lớn").getDanhSachCP())
				if (i.getGiaChot() == i.getGiaThamChieu())
				{
					counter++;
					s.append(i.getTen());
					if (counter<3) s.append(", ");
					if (counter == 3) break;
				}
			s.append("... nỗ lực bám vạch tham chiếu.");
		}
		return s.toString();
	}
	
	public String vhlXanh() {
		StringBuffer s = new StringBuffer();
		if (Tag.isVonHoaLon() == true)
		{
			s.append("Những mã vốn hóa lớn: ");
			int counter=0;
			for (CoPhieu i : sGD.getNhomCoPhieuByName("Nhóm vốn hóa lớn").getDanhSachCP())
				if (i.getBienDong() >0)
				{
					counter++;
					s.append(i.getTen());
					if (counter<3) s.append(", ");
					if (counter == 3) break;
				}
			s.append("... đều bật xanh.");
		}
		return s.toString();
	}
	
	public String vhlGiuGia() {
		StringBuffer s = new StringBuffer();
		if (Tag.isVonHoaLon() == true)
		{
			s.append("Những mã vốn hóa lớn: ");
			int counter=0;
			for (CoPhieu i : sGD.getNhomCoPhieuByName("Nhóm vốn hóa lớn").getDanhSachCP())
				if (i.getBienDong() == 0 )
				{
					counter++;
					s.append(i.getTen());
					if (counter<3) s.append(", ");
					if (counter == 3) break;
				}
			s.append("...  đứng giá.");
		}
		return s.toString();
	}
	
	public String bcDieuChinhNhe() {
		StringBuffer s = new StringBuffer();
		if (Tag.isBlueChip() == true)
		{
			s.append("Giá một số blue-chip như ");
			int counter=0;
			for (CoPhieu i : sGD.getNhomCoPhieuByName("Nhóm blue chip").getDanhSachCP())
				if ((i.getBienDong()<=0.3) && (i.getBienDong()>=-0.05))
				{
					counter++;
					s.append(i.getTen());
					if (counter<2) s.append(", ");
					if (counter == 2) break;
				}
			s.append("...  điều chỉnh nhẹ.");
		}
		return s.toString();
	}
	
	public String bcGiamNhe() {
		StringBuffer s = new StringBuffer();
		if (Tag.isBlueChip() == true)
		{
			s.append("Một số blue-chip khác như ");
			int counter=0;
			for (CoPhieu i : sGD.getNhomCoPhieuByName("Nhóm blue chip").getDanhSachCP())
				if ((i.getBienDong()>=-0.4) && (i.getBienDong()<0.05))
				{
					counter++;
					s.append(i.getTen());
					if (counter<2) s.append(", ");
					if (counter == 2) break;
				}
			s.append("...  giảm nhẹ 1-2%");
		}
		return s.toString();
	}
	
}
