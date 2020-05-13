package data;



public class MauCau {
	//lien ket voi CoPhieu va SanGiaoDich de su dung
	private San san;
	
	//bien boolean tuong ung voi tag
	public boolean giaoDichNhieu;
	public int topX;
	
	//constructor
	public MauCau(San san) {
		this.san = san;
		giaoDichNhieu = false;
		topX = 5;
	}

	//mau cau
	public void top1gd() {
		String s="";
		if (topX == 1)
		{
			CoPhieu cp1 = san.top10gd.get(topX-1);
			s += cp1.getTenChiSo() + " la co phieu duoc giao dich nhieu nhat voi " + cp1.getKlgd() 
				+ " don vi, chiem " + cp1.getKlgd()/san.getKlgd() + " % thi truong giao dich.";
		}	
		if (s!="") System.out.println(s);
	}
	
	public void top2gd() {
		String s="";
		if (topX == 2)
		{
			CoPhieu cp1 = san.top10gd.get(0);
			CoPhieu cp2 = san.top10gd.get(1);		
			s += "Dan dau ve khoi luong giao dich la " + cp1.getTenChiSo() 
				+ " voi " + cp1.getKlgd() + " don vi co phieu duoc mua ban, "
				+ cp2.getTenChiSo() + " dung thu hai voi " + cp2.getKlgd()
				+ " don vi co phieu duoc mua ban.";
		}
		if (s!="") System.out.println(s);
	}
}
