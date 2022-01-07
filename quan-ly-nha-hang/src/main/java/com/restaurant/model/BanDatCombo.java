package com.restaurant.model;

import java.io.Serializable;

public class BanDatCombo implements Serializable{

	private static final long serialVersionUID = 1L;

	private int id;
	private BanDat banDat;
	private Combo combo;
	private int soLuong;
	public BanDatCombo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BanDatCombo(int id, BanDat banDat, Combo combo, int soLuong) {
		super();
		this.id = id;
		this.banDat = banDat;
		this.combo = combo;
		this.soLuong = soLuong;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BanDat getBanDat() {
		return banDat;
	}
	public void setBanDat(BanDat banDat) {
		this.banDat = banDat;
	}
	public Combo getCombo() {
		return combo;
	}
	public void setCombo(Combo combo) {
		this.combo = combo;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	@Override
	public String toString() {
		return "BanDatCombo [id=" + id + ", banDat=" + banDat + ", combo=" + combo + ", soLuong=" + soLuong + "]";
	}
	
	
}
