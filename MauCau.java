package bai_tap_lon;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class MauCau {
	//attributes
	private SanGiaoDich sGD = null;
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
	public String top1Tang() {
		StringBuffer s = new StringBuffer();
		if (tag.getTopTang() == 1) {
			CoPhieu cp = sGD.getTopTang().get(0);
			s.append("Co phieu ");
			s.append(cp.getTen() + " ");
			s.append("tang cao nhat voi ");
			s.append(cp.getBienDong()*sGD.getDonViGia());
			s.append(" dong moi co phieu.");
			System.out.println(s);
		}
		return s.toString();
	}
	
	public String top1Giam() {
		StringBuffer s = new StringBuffer();
		if (tag.getTopGiam() == 1) {
			CoPhieu cp = sGD.getTopGiam().get(0);
			s.append("Co phieu ");
			s.append(cp.getTen() + " ");
			s.append("giam nhieu nhat voi ");
			s.append(cp.getBienDong()*sGD.getDonViGia()*(-1));
			s.append(" dong moi co phieu.");
			System.out.println(s);
		}
		return s.toString();
	}
	
	public String top3Tang() {
		StringBuffer s = new StringBuffer();
		if (tag.getTopTang() == 3) {
			CoPhieu cp1 = sGD.getTopTang().get(0);
			CoPhieu cp2 = sGD.getTopTang().get(1);
			CoPhieu cp3 = sGD.getTopTang().get(2);
			s.append("Dan dau ve muc gia tang hom nay gom ");
			s.append(cp1.getTen() + " (+");
			s.append(cp1.getBienDong()*sGD.getDonViGia()+" dong), ");
			s.append(cp2.getTen() + " (+");
			s.append(cp2.getBienDong()*sGD.getDonViGia()+" dong), ");
			s.append(cp3.getTen() + " (+");
			s.append(cp3.getBienDong()*sGD.getDonViGia()+" dong).");
			System.out.println(s);
		}
		return s.toString();
	}
	
	public String top3Giam() {
		StringBuffer s = new StringBuffer();
		if (tag.getTopGiam() == 3) {
			CoPhieu cp1 = sGD.getTopGiam().get(0);
			CoPhieu cp2 = sGD.getTopGiam().get(1);
			CoPhieu cp3 = sGD.getTopGiam().get(2);
			s.append("Top 3 co phieu giam gia nhieu nhat gom ");
			s.append(cp1.getTen() + " (");
			s.append(cp1.getBienDong()*sGD.getDonViGia()*(-1)+" dong), ");
			s.append(cp2.getTen() + " (");
			s.append(cp2.getBienDong()*sGD.getDonViGia()*(-1)+" dong), ");
			s.append(cp3.getTen() + " (");
			s.append(cp3.getBienDong()*sGD.getDonViGia()*(-1)+" dong).");
			System.out.println(s);
		}
		return s.toString();
	}
	
	public String nnMua(List<CoPhieu> dscp) {
		StringBuffer s = new StringBuffer();
		if (tag.isNnMua() == true)
			if (dscp.size()==0) {
				Random rd = new Random();
				int r = rd.nextInt(sGD.getDSCP().size()-1);
				CoPhieu cp = sGD.getDSCP().get(r);
				if (cp.getNnMua()==0)
					s.append("Nha dau tu nuoc ngoai khong mua vao co phieu " + cp.getTen() + ".");
				else {
					s.append("Nha dau tu nuoc ngoai da mua vao ");
					s.append(cp.getNnMua() + " co phieu ");
					s.append(cp.getTen() + ".");
				}
			} else {
				s.append("Nha dau tu nuoc ngoai da mua vao ");
				for (int i=0; i< dscp.size() -1; i++) {
					s.append(dscp.get(i).getNnMua() + " co phieu ");
					s.append(dscp.get(i).getTen() + ", ");
				}
				s.append(dscp.get(dscp.size()-1).getNnMua() + " co phieu ");
				s.append(dscp.get(dscp.size()-1).getTen() + ".");
			}
		System.out.println(s);
		return s.toString();
	}
/*	public CoPhieu getTop1GD()
	{
		int  top1=0;
		for (int i = 1; i <sGD.soLoaiCoPhieu; i++) 
			if (sGD.coPhieu[i].tKL > sGD.coPhieu[top1].tKL) top1=i;
		return sGD.coPhieu[top1];
	}
	public LopCoPhieu getTop2GD()
	{
		LopCoPhieu cpTop1 = getTop1GD();
		int top2=0;
		for (int i = 1; i <sGD.soLoaiCoPhieu; i++) 
			if ((sGD.coPhieu[i].tKL > sGD.coPhieu[top2].tKL) && (sGD.coPhieu[i].tKL < cpTop1.tKL)) 
				top2=i;
		return sGD.coPhieu[top2];
	}
	public LopCoPhieu getTop3GD()
	{
		LopCoPhieu cpTop2 =getTop2GD();
		int top3=0;
		for (int i = 1; i <sGD.soLoaiCoPhieu; i++) 
			if ((sGD.coPhieu[i].tKL > sGD.coPhieu[top3].tKL) && (sGD.coPhieu[i].tKL < cpTop2.tKL)) 
				top3=i;
		return sGD.coPhieu[top3];
	}
	
	public void top3GD()
	{
		LopCoPhieu cpTop1 = getTop1GD();
		LopCoPhieu cpTop2 = getTop2GD();
		LopCoPhieu cpTop3 = getTop3GD();
		float sumKLGD = sGD.kLGD;
		
		String cau="Top 3 cá»• phiáº¿u giao dá»‹ch nhiá»�u nháº¥t trÃªn sÃ n lÃ  "; 
		cau+= cpTop2.cK + ", " + cpTop1.cK + " vÃ  " + cpTop3.cK;
		cau+= ", dáº«n Ä‘áº§u lÃ  " + cpTop1.cK;
		cau+= " vá»›i " + String.format("%.1f", cpTop1.tKL*10) + " cá»• phiáº¿u, ";
		cau+= ("chiáº¿m " + String.format("%.4f", cpTop1.tKL/sumKLGD*100)+ "% thá»‹ trÆ°á»�ng giao dá»‹ch. ");
		System.out.print(cau);
		
	}
	public void gDNN()
	{
		LopCoPhieu cpTop1 = getTop1GD();
		float sumKLGD = sGD.kLGD;
		String cau ="";
		cau+= cpTop1.cK + " lÃ  cá»• phiáº¿u Ä‘Æ°á»£c giao dá»‹ch nhiá»�u nháº¥t vá»›i ";
		cau+= String.format("%.1f",cpTop1.tKL*10) + " Ä‘Æ¡n vá»‹, "; 
		cau+= "chiáº¿m " + String.format("%.4f",cpTop1.tKL/sumKLGD*100) + " % thá»‹ trÆ°á»�ng giao dá»‹ch. ";
		System.out.print(cau);
	}
	
	public void thanhKhoan()
	{
		LopCoPhieu cpTop1 = getTop1GD();
		LopCoPhieu cpTop2 = getTop2GD();
		String cau ="";
		cau+= cpTop1.cK +" tiáº¿p tá»¥c dáº«n Ä‘áº§u vá»� tÃ­nh thanh khoáº£n vá»›i " + String.format("%.1f",cpTop1.tKL*10);
		cau+=" cá»• phiáº¿u Ä‘Æ°á»£c bÃ¡n ra ra trong phiÃªn, ";
		cau+= cpTop2.cK + " Ä‘á»©ng thá»© 2 vá»›i "+ String.format("%.1f",cpTop2.tKL*10) + " cá»• phiáº¿u. ";
		System.out.print(cau);
	}
	
	public void thanhKhoanLietKe()
	{
		LopCoPhieu cpTop1 = getTop1GD();
		LopCoPhieu cpTop2 = getTop2GD();
		LopCoPhieu cpTop3 = getTop3GD();
		
		String cau;
		
		cau = "Dáº«n Ä‘áº§u thanh khoáº£n táº¡i " + sGD.TENSAN;
		cau+= " lÃ  " + cpTop1.cK + " vá»›i "+ String.format("%.1f", cpTop1.tKL*10) +" cá»• phiáº¿u Ä‘Æ°á»£c bÃ¡n ra, ";
		cau+= "tiáº¿p theo sau lÃ  "+ cpTop2.cK + " vá»›i "+ String.format("%.1f", cpTop2.tKL*10) +" cá»• phiáº¿u Ä‘Æ°á»£c bÃ¡n ra, ";
		cau+= "sau Ä‘Ã³ lÃ  "+ cpTop3.cK + " vá»›i "+ String.format("%.1f", cpTop3.tKL*10) +" cá»• phiáº¿u Ä‘Æ°á»£c bÃ¡n ra. ";
		System.out.print(cau);
	}
*/	
	
}
