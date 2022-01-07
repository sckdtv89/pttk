package com.restaurant.model;

import java.io.Serializable;

public class MonAn implements Serializable{

	private static final long serialVersionUID = 1L;

	private int idMonAn;
	private String tenMon;
	private String loaiMon;
	private double giaHienTai;
	private String moTa;
	
	public MonAn() {
		// TODO Auto-generated constructor stub
	}
	public MonAn(int idMonAn, String tenMon, String loaiMon, double giaHienTai, String moTa) {
		super();
		this.idMonAn = idMonAn;
		this.tenMon = tenMon;
		this.loaiMon = loaiMon;
		this.giaHienTai = giaHienTai;
		this.moTa = moTa;
	}
	public int getIdMonAn() {
		return idMonAn;
	}
	public void setIdMonAn(int idMonAn) {
		this.idMonAn = idMonAn;
	}
	public String getTenMon() {
		return tenMon;
	}
	public void setTenMon(String tenMon) {
		this.tenMon = tenMon;
	}
	public String getLoaiMon() {
		return loaiMon;
	}
	public void setLoaiMon(String loaiMon) {
		this.loaiMon = loaiMon;
	}
	public double getGiaHienTai() {
		return giaHienTai;
	}
	public void setGiaHienTai(double giaHienTai) {
		this.giaHienTai = giaHienTai;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	@Override
	public String toString() {
		return "MonAn [idMonAn=" + idMonAn + ", tenMon=" + tenMon + ", loaiMon=" + loaiMon + ", giaHienTai="
				+ giaHienTai + ", moTa=" + moTa + "]";
	}
	
	
}
