package bai_tap_lon;


public class MauCau {
	
	SanGiaoDich sGD =null;
	
	public MauCau(SanGiaoDich a){
		this.sGD = a;
	}
	
	public LopCoPhieu getTop1GD()
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
		
		String cau="Top 3 cổ phiếu giao dịch nhiều nhất trên sàn là "; 
		cau+= cpTop2.cK + ", " + cpTop1.cK + " và " + cpTop3.cK;
		cau+= ", dẫn đầu là " + cpTop1.cK;
		cau+= " với " + String.format("%.1f", cpTop1.tKL*10) + " cổ phiếu, ";
		cau+= ("chiếm " + String.format("%.4f", cpTop1.tKL/sumKLGD*100)+ "% thị trường giao dịch. ");
		System.out.print(cau);
		
	}
	public void gDNN()
	{
		LopCoPhieu cpTop1 = getTop1GD();
		float sumKLGD = sGD.kLGD;
		String cau ="";
		cau+= cpTop1.cK + " là cổ phiếu được giao dịch nhiều nhất với ";
		cau+= String.format("%.1f",cpTop1.tKL*10) + " đơn vị, "; 
		cau+= "chiếm " + String.format("%.4f",cpTop1.tKL/sumKLGD*100) + " % thị trường giao dịch. ";
		System.out.print(cau);
	}
	
	public void thanhKhoan()
	{
		LopCoPhieu cpTop1 = getTop1GD();
		LopCoPhieu cpTop2 = getTop2GD();
		String cau ="";
		cau+= cpTop1.cK +" tiếp tục dẫn đầu về tính thanh khoản với " + String.format("%.1f",cpTop1.tKL*10);
		cau+=" cổ phiếu được bán ra ra trong phiên, ";
		cau+= cpTop2.cK + " đứng thứ 2 với "+ String.format("%.1f",cpTop2.tKL*10) + " cổ phiếu. ";
		System.out.print(cau);
	}
	
	public void thanhKhoanLietKe()
	{
		LopCoPhieu cpTop1 = getTop1GD();
		LopCoPhieu cpTop2 = getTop2GD();
		LopCoPhieu cpTop3 = getTop3GD();
		
		String cau;
		
		cau = "Dẫn đầu thanh khoản tại " + sGD.TENSAN;
		cau+= " là " + cpTop1.cK + " với "+ String.format("%.1f", cpTop1.tKL*10) +" cổ phiếu được bán ra, ";
		cau+= "tiếp theo sau là "+ cpTop2.cK + " với "+ String.format("%.1f", cpTop2.tKL*10) +" cổ phiếu được bán ra, ";
		cau+= "sau đó là "+ cpTop3.cK + " với "+ String.format("%.1f", cpTop3.tKL*10) +" cổ phiếu được bán ra. ";
		System.out.print(cau);
	}
	
	
}
