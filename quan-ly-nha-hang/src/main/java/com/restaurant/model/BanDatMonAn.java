package com.restaurant.model;

import java.io.Serializable;

public class BanDatMonAn implements Serializable{

	private static final long serialVersionUID = 1L;

	private int id;
	private BanDat banDat;
	private MonAn monAn;
	private int soLuong;
	public BanDatMonAn() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BanDatMonAn(int id, BanDat banDat, MonAn monAn, int soLuong) {
		super();
		this.id = id;
		this.banDat = banDat;
		this.monAn = monAn;
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
	public MonAn getMonAn() {
		return monAn;
	}
	public void setMonAn(MonAn monAn) {
		this.monAn = monAn;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	@Override
	public String toString() {
		return "BanDatMonAn [id=" + id + ", banDat=" + banDat + ", monAn=" + monAn + ", soLuong=" + soLuong + "]";
	}
	
	
	
	
	
}
