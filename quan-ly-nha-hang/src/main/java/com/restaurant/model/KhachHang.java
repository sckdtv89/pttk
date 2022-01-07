package com.restaurant.model;

import java.io.Serializable;

public class KhachHang implements Serializable{

	private static final long serialVersionUID = 1L;

	private int idKhachHang;
	private String tenKhachHang;
	private String email;
	private String sdtKH;
	private String diaChi;
	
	public KhachHang() {
		// TODO Auto-generated constructor stub
	}
	public KhachHang(int idKhachHang, String tenKhachHang, String email, String sdtKH, String diaChi) {
		super();
		this.idKhachHang = idKhachHang;
		this.tenKhachHang = tenKhachHang;
		this.email = email;
		this.sdtKH = sdtKH;
		this.diaChi = diaChi;
	}
	public int getIdKhachHang() {
		return idKhachHang;
	}
	public void setIdKhachHang(int idKhachHang) {
		this.idKhachHang = idKhachHang;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSdtKH() {
		return sdtKH;
	}
	public void setSdtKH(String sdtKH) {
		this.sdtKH = sdtKH;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	@Override
	public String toString() {
		return "KhachHang [idKhachHang=" + idKhachHang + ", tenKhachHang=" + tenKhachHang + ", email=" + email
				+ ", sdtKH=" + sdtKH + ", diaChi=" + diaChi + "]";
	}
	
	
}
