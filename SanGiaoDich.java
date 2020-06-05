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
	private List<NhomCoPhieu> nhomCoPhieu;
	private int donViCP;
	private int donViGia;
	private float mucTangManh;
	private float mucTangNhe;
	private float mucGiamManh;
	private float mucGiamNhe;
	private List<CoPhieu> nhomDauKhi;
	private List<CoPhieu> nhomNganHang;
 	
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
		this.nhomCoPhieu = new ArrayList<>();
		this.setDonViCP(10);
		this.setDonViGia(1000);
		this.setMucTangManh(1);
		this.setMucTangNhe(0.5f);
		this.setMucGiamNhe(-0.5f);
		this.setMucTangManh(-1);
		this.nhomDauKhi = new ArrayList<>();
		this.nhomNganHang = new ArrayList<>();
	}
	
	public void taoNhom() {
		this.addNhomCoPhieu(new NhomCoPhieu(this.getDSCP(),"Nhóm vốn hóa lớn","VHM","VIC","POW","GAS","VIC","VNM","SBT","HNG","GVR","BID","VRE","ITA","HAG","HPG","FLC"));
		this.addNhomCoPhieu(new NhomCoPhieu(this.getDSCP(),"Nhóm dầu khí","POW","GAS","PLX","PVD","PVT","PXS","PGD"));
		this.addNhomCoPhieu(new NhomCoPhieu(this.getDSCP(),"Nhóm ngân hàng","BID","BVH","CTG","EIB","HDB","MBB","STB","TCB","TPB","VCB","VPB"));
		this.addNhomCoPhieu(new NhomCoPhieu(this.getDSCP(),"Nhóm xây dựng và bất động sản","VRE","ITA","VRE","VHM","VIC","REE","KDH","NVL","LGC","PDR","HPX"));
		this.addNhomCoPhieu(new NhomCoPhieu(this.getDSCP(),"Nhóm khai khoáng","PVD","NNC","KSB","DHA"));
		this.addNhomCoPhieu(new NhomCoPhieu(this.getDSCP(),"Nhóm sản xuất nông nghiệp","HNG","HAG","NSC","ASM","SSC"));
		this.addNhomCoPhieu(new NhomCoPhieu(this.getDSCP(),"Nhóm sản xuất và tiêu dùng","BHN","DHG","GVR","HPG","MSN","SAB","VNM","KDC","PHR","GEX","PNJ"));
	}
	
	public void addCoPhieu(CoPhieu coPhieu){
		this.dscp.add(coPhieu);
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
	
	public float getMucTangManh() {
		return mucTangManh;
	}

	public void setMucTangManh(float mucTangManh) {
		this.mucTangManh = mucTangManh;
	}

	public float getMucTangNhe() {
		return mucTangNhe;
	}

	public void setMucTangNhe(float mucTangNhe) {
		this.mucTangNhe = mucTangNhe;
	}

	public float getMucGiamManh() {
		return mucGiamManh;
	}

	public void setMucGiamManh(float mucGiamManh) {
		this.mucGiamManh = mucGiamManh;
	}

	public float getMucGiamNhe() {
		return mucGiamNhe;
	}

	public void setMucGiamNhe(float mucGiamNhe) {
		this.mucGiamNhe = mucGiamNhe;
	}

	public List<CoPhieu> getNhomDauKhi() {
		return nhomDauKhi;
	}

	public List<CoPhieu> getNhomNganHang() {
		return nhomNganHang;
	}

	//methods
	public void xuLiThongTin() { //chua cac phuong thuc xu li thong tin dau vao cho san
		this.demMaTang(this.getDSCP());
		this.demMaGiam(this.getDSCP());
		this.demMaDung(this.getDSCP());
		this.sortTopTang();
		this.sortTopGiam();
		this.sortTopGD();
		this.setNhomDauKhi();
		this.setNhomNganHang();
	}
	
/*	public void demTrangThai(List<CoPhieu> dscp) { //dem so ma tang, giam, dung
		
		this.setSoMaTang(countTang);
		this.setSoMaGiam(countGiam);
		this.setSoMaDung(countDung);
	}
*/	
	public int demMaTang(List<CoPhieu> dscp) {
		int count = 0;
		for (CoPhieu i: dscp) {
			if (i.getBienDong() > 0)
				count ++;
		}
		return count;
	}
	public int demMaGiam(List<CoPhieu> dscp) {
		int count = 0;
		for (CoPhieu i: dscp) {
			if (i.getBienDong() < 0)
				count ++;
		}
		return count;
	}
	public int demMaDung(List<CoPhieu> dscp) {
		int count = 0;
		for (CoPhieu i: dscp) {
			if (i.getBienDong() == 0)
				count ++;
		}
		return count;
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
	
	public void setNhomDauKhi() {
		for (CoPhieu i: this.getDSCP()) {
			if (i.isCpDauKhi() == true)
				this.getNhomDauKhi().add(i);
		}
	}
	public void setNhomNganHang() {
		for (CoPhieu i: this.getDSCP()) {
			if (i.isCpNganHang() == true)
				this.getNhomNganHang().add(i);
		}
	}
	public NhomCoPhieu atNhomCoPhieu(int pos) {
		return nhomCoPhieu.get(pos);
	}
	
	public void addNhomCoPhieu(NhomCoPhieu nhommoi) {
		this.nhomCoPhieu.add(nhommoi);
	}
	
	public List<NhomCoPhieu> getNhomCoPhieu(){
		return this.nhomCoPhieu;
	}
}
