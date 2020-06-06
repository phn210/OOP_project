package database;

import java.util.ArrayList;
import java.util.List;

public class NhomCoPhieu{
	private String tenNhom;
	private List<CoPhieu> danhSachCP;
	private float kiVong;
	private float doLechChuan;
	
	//constructor
	public NhomCoPhieu(List<CoPhieu> dscp,String tenNhom ,String...danhSachMa ) {	
		this.setTenNhom(tenNhom);
		danhSachCP = new ArrayList<>();
		this.kiVong = 0;
		
		for(String maCP: danhSachMa)
		{
			for(CoPhieu item: dscp) {
				if ( maCP.equals(item.getTen()) ) {
						danhSachCP.add(item);
						kiVong = kiVong + item.getBienDong();
				}
			}
		}
		kiVong = (float)kiVong / danhSachCP.size();
		this.doLechChuan = 0;
		for(CoPhieu coPhieu: danhSachCP) 
			doLechChuan += (coPhieu.getBienDong() - this.kiVong) * (coPhieu.getBienDong() - this.kiVong);
		doLechChuan = (float)doLechChuan / danhSachCP.size();
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
			if (coPhieu.getBienDong() > 0.02) {
				if (tmp == null)
					tmp = coPhieu;
				if (tmp.getBienDong() < coPhieu.getBienDong())
					tmp = coPhieu;
			}
		return tmp;
	}
	
	public boolean isGiam() { // kiem tra xem nhom co phieu day nhin chung co giam hay khong
		int dem = 0;
		for(CoPhieu coPhieu: danhSachCP) 
			if (coPhieu.getBienDong()<-0.02) dem++;
		if ( ((float)dem / danhSachCP.size()) > 0.7 )
			return true;
		return false;
	}
	
	public CoPhieu daiDienGiam() { // dua ra dai dien tang nhieu nhat
		CoPhieu tmp = null;
		for(CoPhieu coPhieu: danhSachCP) 
			if (coPhieu.getBienDong() <-0.02) {
				if (tmp == null)
					tmp = coPhieu;
				if (tmp.getBienDong() > coPhieu.getBienDong())
					tmp = coPhieu;
			}
		return tmp;
	}
	
	public boolean isOnDinh() { // kiem tra xem nhom co phieu day nhin chung co giam hay khong
		int dem = 0;
		for(CoPhieu coPhieu: danhSachCP) 
			if (coPhieu.getBienDong()<0.02 && coPhieu.getBienDong()>-0.02) dem++;
		if ( ((float)dem / danhSachCP.size()) > 0.7 )
			return true;
		return false;
	}
	
	public int countTang() {
		int dem = 0;
		for(CoPhieu coPhieu: danhSachCP) 
			if (coPhieu.getBienDong()>0.02) dem++;
		return dem;
	}
	
	public int countGiam() {
		int dem = 0;
		for(CoPhieu coPhieu: danhSachCP) 
			if (coPhieu.getBienDong()<-0.02) dem++;
		return dem;
	}
	
	public float getDoLechChuan() { // kiem tra xem nhom co phieu day nhin chung co giam hay khong
		return this.doLechChuan;
	}
	
	public float getKiVong() {
		return this.kiVong;
	}
	
	public List<CoPhieu> getDanhSachCP(){
		return this.danhSachCP;
	}
}
