package data;

public class CoPhieu {
	
	//thong tin ve co phieu 
	private String tenChiSo;
	private double giaTC;
	private double giaTran;
	private double giaSan;
	private double giaDongCua;
	private double chenhLech;
	private double giaCaoNhat;
	private double giaThapNhat;
	private long klgd;
	private int nnMua;
	private int nnBan;
	private int roomNN;
	private int roomNNcon;
	
	//constructors
	public CoPhieu() {
		
	}
	
	public CoPhieu(String tenChiSo, double giaTC, double giaTran, double giaSan, double giaDongCua, double chenhLech,
			double giaCaoNhat, double giaThapNhat, long klgd, int nnMua, int nnBan, int roomNN, int roomNNcon) {
		this.setTenChiSo(tenChiSo);
		this.setGiaTC(giaTC);
		this.setGiaTran(giaTran);
		this.setGiaSan(giaSan);
		this.setGiaDongCua(giaDongCua);
		this.setChenhLech(chenhLech);
		this.setGiaCaoNhat(giaCaoNhat);
		this.setGiaThapNhat(giaThapNhat);
		this.setKlgd(klgd);
		this.setNnMua(nnMua);
		this.setNnBan(nnBan);
		this.setRoomNN(roomNNcon);
		this.setRoomNNcon(roomNNcon);
	}
	
	//getters & setters
	public String getTenChiSo() {
		return tenChiSo;
	}

	public void setTenChiSo(String tenChiSo) {
		this.tenChiSo = tenChiSo;
	}

	public double getGiaTC() {
		return giaTC;
	}

	public void setGiaTC(double giaTC) {
		this.giaTC = giaTC;
	}

	public double getGiaTran() {
		return giaTran;
	}

	public void setGiaTran(double giaTran) {
		this.giaTran = giaTran;
	}

	public double getGiaSan() {
		return giaSan;
	}

	public void setGiaSan(double giaSan) {
		this.giaSan = giaSan;
	}

	public double getGiaDongCua() {
		return giaDongCua;
	}

	public void setGiaDongCua(double giaDongCua) {
		this.giaDongCua = giaDongCua;
	}

	public double getChenhLech() {
		return chenhLech;
	}

	public void setChenhLech(double chenhLech) {
		this.chenhLech = chenhLech;
	}

	public double getGiaCaoNhat() {
		return giaCaoNhat;
	}

	public void setGiaCaoNhat(double giaCaoNhat) {
		this.giaCaoNhat = giaCaoNhat;
	}

	public double getGiaThapNhat() {
		return giaThapNhat;
	}

	public void setGiaThapNhat(double giaThapNhat) {
		this.giaThapNhat = giaThapNhat;
	}

	public long getKlgd() {
		return klgd;
	}

	public void setKlgd(long klgd) {
		this.klgd = klgd;
	}

	public int getNnMua() {
		return nnMua;
	}

	public void setNnMua(int nnMua) {
		this.nnMua = nnMua;
	}

	public int getNnBan() {
		return nnBan;
	}

	public void setNnBan(int nnBan) {
		this.nnBan = nnBan;
	}

	public int getRoomNN() {
		return roomNN;
	}

	public void setRoomNN(int roomNN) {
		this.roomNN = roomNN;
	}

	public int getRoomNNcon() {
		return roomNNcon;
	}

	public void setRoomNNcon(int roomNNcon) {
		this.roomNNcon = roomNNcon;
	}

	//phuong thuc cua co phieu
	public String trangThai() {
		String s="";
		if (this.getChenhLech() == 0)
			s = "dung";
		else if (this.getChenhLech() > 0)
		{	
			s = "tang";
			if (this.getChenhLech() > 2)
				s += " manh";
			else if (this.getChenhLech() < 0.5)
				s += " nhe";
		}
		else if (this.getChenhLech() < 0)
		{	
			s = "giam";
			if (this.getChenhLech() < -2)
				s += " manh";
			else if (this.getChenhLech() > -0.5)
				s += " nhe";
		}
		return s;
	}
	
	public double chenhLechPhanTram() {
		return this.getChenhLech()/this.getGiaTC();
	}
	
	public void inTTin() {
		
	}
}
