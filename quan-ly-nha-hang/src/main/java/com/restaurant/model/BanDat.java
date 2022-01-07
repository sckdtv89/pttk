package com.restaurant.model;

import java.io.Serializable;
import java.util.Date;


public class BanDat implements Serializable{

	private static final long serialVersionUID = 1L;

	private int id;
	private int idBan;
	private String tenKhachHang;
	private Date thoiGianDat;
	private boolean tinhTrang;
	public BanDat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BanDat(int id, int idBan, String tenKhachHang, Date thoiGianDat, boolean tinhTrang) {
		super();
		this.id = id;
		this.idBan = idBan;
		this.tenKhachHang = tenKhachHang;
		this.thoiGianDat = thoiGianDat;
		this.tinhTrang = tinhTrang;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdBan() {
		return idBan;
	}
	public void setIdBan(int idBan) {
		this.idBan = idBan;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public Date getThoiGianDat() {
		return thoiGianDat;
	}
	public void setThoiGianDat(Date thoiGianDat) {
		this.thoiGianDat = thoiGianDat;
	}
	public boolean isTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	@Override
	public String toString() {
		return "BanDat [id=" + id + ", idBan=" + idBan + ", tenKhachHang=" + tenKhachHang + ", thoiGianDat="
				+ thoiGianDat + ", tinhTrang=" + tinhTrang + "]";
	}
	
	
}
