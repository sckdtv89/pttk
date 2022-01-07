package com.restaurant.model;

import java.io.Serializable;

public class Combo implements Serializable{

	private static final long serialVersionUID = 1L;

	private int idCombo;
	private String tenCombo;
	private double giaHienTai;
	private String moTa;
	
	public Combo() {
		// TODO Auto-generated constructor stub
	}
	public Combo(int idCombo, String tenCombo, double giaHienTai, String moTa) {
		super();
		this.idCombo = idCombo;
		this.tenCombo = tenCombo;
		this.giaHienTai = giaHienTai;
		this.moTa = moTa;
	}
	public int getIdCombo() {
		return idCombo;
	}
	public void setIdCombo(int idCombo) {
		this.idCombo = idCombo;
	}
	public String getTenCombo() {
		return tenCombo;
	}
	public void setTenCombo(String tenCombo) {
		this.tenCombo = tenCombo;
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
		return "Combo [idCombo=" + idCombo + ", tenCombo=" + tenCombo + ", giaHienTai=" + giaHienTai + ", moTa=" + moTa
				+ "]";
	}
	
	
}
