package bai_tap_lon;
import java.util.List;
import java.util.ArrayList;

public class SanGiaoDich{
	//attributes
	private final String TENSAN = "HOSE";
	private final String TENCHISO = "VNIndex";
	private float diemChiSo;
	private float diemTuongDoi;
	private float diemTuyetDoi;
	private int soMaTang;
	private int soMaGiam;
	private int soMaDung;
	private long klgd;
	private long gtdg;
	private List<CoPhieu> dscp;
	private List<CoPhieu> topTang;
	private List<CoPhieu> topGiam;
	private List<CoPhieu> topGD;
	private int donViCP;
	private int donViGia;

	//constructors
	public SanGiaoDich(){
		this.setDiemChiSo(800);
		this.setDiemTuongDoi(15);
		this.setDiemTuyetDoi(10);
		this.setSoMaTang(0);
		this.setSoMaGiam(0);
		this.setSoMaDung(0);
		this.setKlgd(1000000000);
		this.setGtdg(1000000000);
		this.dscp = new ArrayList<>();
		this.topTang = new ArrayList<>();
		this.topGiam = new ArrayList<>();
		this.topGD = new ArrayList<>();
		this.setDonViCP(10);
		this.setDonViGia(1000);
	}
	
	public float getDiemChiSo() {
		return diemChiSo;
	}

	public void setDiemChiSo(float diemChiSo) {
		this.diemChiSo = diemChiSo;
	}

	public float getDiemTuongDoi() {
		return diemTuongDoi;
	}

	public void setDiemTuongDoi(float diemTuongDoi) {
		this.diemTuongDoi = diemTuongDoi;
	}

	public float getDiemTuyetDoi() {
		return diemTuyetDoi;
	}

	public void setDiemTuyetDoi(float diemTuyetDoi) {
		this.diemTuyetDoi = diemTuyetDoi;
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

	public long getKlgd() {
		return klgd;
	}

	public void setKlgd(long klgd) {
		this.klgd = klgd;
	}

	public long getGtdg() {
		return gtdg;
	}

	public void setGtdg(long gtdg) {
		this.gtdg = gtdg;
	}
	
	public List<CoPhieu> getDSCP() {
		return this.dscp;
	}

	public String getTENSAN() {
		return TENSAN;
	}

	public String getTENCHISO() {
		return TENCHISO;
	}
	public List<CoPhieu> getTopTang() {
		return topTang;
	}
	public List<CoPhieu> getTopGiam() {
		return topGiam;
	}
	public List<CoPhieu> getTopGD() {
		return topGD;
	}
	public int getDonViCP() {
		return donViCP;
	}

	public void setDonViCP(int donViCP) {
		this.donViCP = donViCP;
	}

	public int getDonViGia() {
		return donViGia;
	}

	public void setDonViGia(int donViGia) {
		this.donViGia = donViGia;
	}
	
	//methods
	public void xuLiThongTin() { //chua cac phuong thuc xu li thong tin dau vao cho san
		
	}
	
	public void demTrangThai() { //dem so ma tang, giam, dung
		int countTang=0;
		int countGiam=0;
		int countDung=0;
		for (CoPhieu i: this.getDSCP()) {
			if (i.getBienDong() > 0)
				countTang ++;
			else if (i.getBienDong() < 0)
				countGiam ++;
			else countDung ++;
		}
		this.setSoMaTang(countTang);
		this.setSoMaGiam(countGiam);
		this.setSoMaDung(countDung);
	}
	
	public CoPhieu getTop1Tang(List<CoPhieu> dscp) {
		CoPhieu cp = new CoPhieu();
		for (CoPhieu i: dscp) {
			if (i.getBienDong()>=cp.getBienDong())
				cp = i;
		}
		return cp;
	}
	
	public CoPhieu getTop1Giam(List<CoPhieu> dscp) {
		CoPhieu cp = new CoPhieu();
		for (CoPhieu i: dscp) {
			if (i.getBienDong()<=cp.getBienDong())
				cp = i;
		}
		return cp;
	}
	
	public CoPhieu getTop1GD(List<CoPhieu> dscp) {
		CoPhieu cp = new CoPhieu();
		for (CoPhieu i: dscp) {
			if (i.getTongKLGD()>=cp.getTongKLGD())
				cp = i;
		}
		return cp;
	}
	
	public void sortTopTang(){
		ArrayList<CoPhieu> dscp = new ArrayList<CoPhieu>();
		dscp.addAll(this.getDSCP());
		for (int i=0; i<5; i++) {
			CoPhieu cp = this.getTop1Tang(dscp);
			this.getTopTang().add(cp);
			dscp.remove(cp);
		}
	}
	
	public void sortTopGiam(){
		ArrayList<CoPhieu> dscp = new ArrayList<CoPhieu>();
		dscp.addAll(this.getDSCP());
		for (int i=0; i<5; i++) {
			CoPhieu cp = this.getTop1Giam(dscp);
			this.getTopGiam().add(cp);
			dscp.remove(cp);
		}
	}
	
	public void sortTopGD(){
		ArrayList<CoPhieu> dscp = new ArrayList<CoPhieu>();
		dscp.addAll(this.getDSCP());
		for (int i=0; i<5; i++) {
			CoPhieu cp = this.getTop1GD(dscp);
			this.getTopGD().add(cp);
			dscp.remove(cp);
		}
	}
	
	public CoPhieu findCP(String tenCP) {
		CoPhieu cp = new CoPhieu();
		for (CoPhieu i: this.getDSCP()) {
			if (i.getTen().equals(tenCP)) {
				cp = i;
				break;
			}
		}
		return cp;
	}
	
/*	private float getBigFloat() {
		float res = 0;
		
		while(thongTin.charAt(pointer)<'0' || thongTin.charAt(pointer)>'9') pointer++;
		while((thongTin.charAt(pointer)>='0' && thongTin.charAt(pointer)<='9') || thongTin.charAt(pointer)==','){
			if (thongTin.charAt(pointer)>='0' && thongTin.charAt(pointer)<='9')
				res = res*10 + (thongTin.charAt(pointer)-'0');
			pointer++;
		}
		if(thongTin.charAt(pointer)=='.'){
			pointer++;
			float heso = (float) 0.1;
			while(thongTin.charAt(pointer)>='0' && thongTin.charAt(pointer)<='9') {
				res = res + heso*(thongTin.charAt(pointer)-'0');
				heso = (float) (heso*0.1);
				pointer++;
			}
		}	
		return res;
	}
	
	private float getLong() {
		float res = 0;
		pointer++;
		while (thongTin.charAt(pointer) != '"')
		{
			if(thongTin.charAt(pointer)>='0' && thongTin.charAt(pointer)<='9') 
				res = res*10 + (thongTin.charAt(pointer)-'0');
			pointer++;
		}
		pointer++;
		return res;
	}
	
	private float getNum() { // lay ra so dau tien sau vi tri pointer
		float res = 0;
		int dau = 1; // dau am(-) hay duong
		
		while(thongTin.charAt(pointer)<'0' || thongTin.charAt(pointer)>'9') {
			if (thongTin.charAt(pointer) == '-' || thongTin.charAt(pointer) == '▼') dau = -1; 
			if (thongTin.charAt(pointer) == ',' && (thongTin.charAt(pointer+1) == ',' || ( thongTin.charAt(pointer+1)>='A' && thongTin.charAt(pointer+1)<='Z' ))) {
				pointer++;
				return -1;
			}
			if (thongTin.charAt(pointer) == '"') return getLong();
			pointer++;
		}
		while(thongTin.charAt(pointer)>='0' && thongTin.charAt(pointer)<='9') {
			res = res*10 + (thongTin.charAt(pointer)-'0');
			pointer++;
		}
		if(thongTin.charAt(pointer)=='.'){
			pointer++;
			float heso = (float) 0.1;
			while(thongTin.charAt(pointer)>='0' && thongTin.charAt(pointer)<='9') {
				res = res + heso*(thongTin.charAt(pointer)-'0');
				heso = (float) (heso*0.1);
				pointer++;
			}
		}	
		return res*dau;
		
	}
*/	
/*	private String getCK() { // lay ra ten CK cua ma co phieu
		String res = "";
		while(thongTin.charAt(pointer)<'A' || thongTin.charAt(pointer)>'Z') pointer++;
		while((thongTin.charAt(pointer)>='A' && thongTin.charAt(pointer)<='Z')||(thongTin.charAt(pointer)>='0' && thongTin.charAt(pointer)<='9')){
			res = res + thongTin.charAt(pointer);
			pointer++;
		}	
		return res;
	}
*/	
/*	public void ghiThongTinChiSo() {
		String tt = this.TENCHISO + " ";
		tt += String.format("%.2f", this.diemChiSo) + " ";
		tt += String.format("%.2f", this.diemTuyetDoi) + " ";
		tt += String.format("%.2f", this.diemTuongDoi) + " ";
		tt += " kLGD: " + String.format("%.2f", this.kLGD);
		tt += " gTGD: " + String.format("%.2f", this.gTGD);
		System.out.println(tt);
	}
*/	
/*	private void setVNIndex() {
		if (thongTin == null) return;
		pointer = thongTin.indexOf("VNIndex");
		this.diemChiSo = getNum();
		this.diemTuongDoi = getNum();
		this.diemTuyetDoi = getNum();
		this.kLGD = getBigFloat();
		this.gTGD = getBigFloat();
		//
		//GhithongTinChiSo();
	}
	
	private void setCoPhieu() {
		if (thongTin == null) return;
		pointer = thongTin.indexOf("AAA");// tim vi tri cua co phieu dau tien
		
		for(int i=0 ; i<440 ; i++)
		{
			coPhieu[i] = new CoPhieu();
			coPhieu[i].cK = getCK();
			coPhieu[i].tC = getNum();
			coPhieu[i].tran = getNum();
			coPhieu[i].san = getNum();
			coPhieu[i].muaGia1 = getNum();
			coPhieu[i].muaKL1 = getNum();
			coPhieu[i].muaGia2 = getNum();
			coPhieu[i].muaKL2 = getNum();
			coPhieu[i].muaGia3 = getNum();
			coPhieu[i].muaKL3 = getNum();
			coPhieu[i].sDCGia = getNum();
			coPhieu[i].sDCKL = getNum();
			coPhieu[i].bienDong = getNum();
			coPhieu[i].banGia1 = getNum();
			coPhieu[i].banKL1 = getNum();
			coPhieu[i].banGia2 = getNum();
			coPhieu[i].banKL2 = getNum();
			coPhieu[i].banGia3 = getNum(); 
			coPhieu[i].banKL3 = getNum();
			coPhieu[i].lSCao = getNum();
			coPhieu[i].lSThap = getNum();
			coPhieu[i].tKL = getNum();
			coPhieu[i].nNMua = getNum();
			coPhieu[i].nNBan = getNum();
			coPhieu[i].roomCon = getNum();
			//
			//coPhieu[i].GhiThongTinCoPhieu();
		}
	}
*/
}
