package bai_tap_lon;

import java.util.List;

public class NhomCoPhieu{
	private String tenNhom;
	private List<CoPhieu> danhSachCP;
	private float kiVong;
	private float doLechChuan;
	//constructor
	public NhomCoPhieu(List<CoPhieu> dscp,String tenNhom ,String...danhSachMa ) {
		this.setTenNhom(tenNhom);
		for(String maCP:danhSachMa)
		{
			for(CoPhieu item: dscp) {
				if (maCP==item.getTen())
						danhSachCP.add(item);
				
			}
		}
	}
	public String getTenNhom() {
		return tenNhom;
	}
	public void setTenNhom(String tenNhom) {
		this.tenNhom = tenNhom;
	}
	
	public boolean isTang() { // kiem tra xem nhom co phieu day nhin chung co tang hay khong
		int dem = 0;
		for(CoPhieu coPhieu: danhSachCP) 
			if (coPhieu.getBienDong()>0.02) dem++;
		if ( ((float)dem / danhSachCP.size()) > 0.7 )
			return true;
		return false;
	}
	
	public CoPhieu daiDienTang() { // dua ra dai dien tang nhieu nhat
		CoPhieu tmp = null;
		for(CoPhieu coPhieu: danhSachCP) 
			if (coPhieu.getBienDong()>0.02) {
				if (tmp == null)
					tmp = coPhieu;
				if (tmp.getBienDong() < coPhieu.getBienDong())
					tmp = coPhieu;
			}
		return tmp;
	}
}
