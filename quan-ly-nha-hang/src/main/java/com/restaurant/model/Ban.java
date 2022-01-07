package com.restaurant.model;

import java.io.Serializable;

public class Ban implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idBan;
	private String tenBan;
	private int soLuongNguoi;
	private String moTa;
	
	public Ban() {
		// TODO Auto-generated constructor stub
	}

	public Ban(int idBan, String tenBan, int soLuongNguoi, String moTa) {
		super();
		this.idBan = idBan;
		this.tenBan = tenBan;
		this.soLuongNguoi = soLuongNguoi;
		this.moTa = moTa;
	}

	public Ban(int idBan) {
		super();
		this.idBan = idBan;
	}

	public int getIdBan() {
		return idBan;
	}

	public void setIdBan(int idBan) {
		this.idBan = idBan;
	}

	public String getTenBan() {
		return tenBan;
	}

	public void setTenBan(String tenBan) {
		this.tenBan = tenBan;
	}

	public int getSoLuongNguoi() {
		return soLuongNguoi;
	}

	public void setSoLuongNguoi(int soLuongNguoi) {
		this.soLuongNguoi = soLuongNguoi;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	@Override
	public String toString() {
		return "Ban [idBan=" + idBan + ", tenBan=" + tenBan + ", soLuongNguoi=" + soLuongNguoi + ", moTa=" + moTa + "]";
	}
}
