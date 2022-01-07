package com.restaurant.model;

import java.io.Serializable;

public class PhieuGiamGia implements Serializable{

	private static final long serialVersionUID = 1L;

	private int idPGG;
	private String maGiamGia;
	private float discount;
	private String moTa;
	
	public PhieuGiamGia() {
		// TODO Auto-generated constructor stub
	}
	public PhieuGiamGia(int idPGG, String maGiamGia, String moTa) {
		super();
		this.idPGG = idPGG;
		this.maGiamGia = maGiamGia;
		this.moTa = moTa;
	}
	public int getIdPGG() {
		return idPGG;
	}
	public void setIdPGG(int idPGG) {
		this.idPGG = idPGG;
	}
	public String getMaGiamGia() {
		return maGiamGia;
	}
	public void setMaGiamGia(String maGiamGia) {
		this.maGiamGia = maGiamGia;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	@Override
	public String toString() {
		return "MaGiamGia [idPGG=" + idPGG + ", maGiamGia=" + maGiamGia + ", moTa=" + moTa + "]";
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	
}
