package com.restaurant.model;

import java.io.Serializable;

public class MonAn_Combo implements Serializable{

	private static final long serialVersionUID = 1L;

	private int id;
	private Combo combo;
	private MonAn monAn;
	private float soLuong;
	
	public MonAn_Combo() {
		// TODO Auto-generated constructor stub
	}
	public MonAn_Combo(int id, Combo combo, MonAn monAn, float soLuong) {
		super();
		this.id = id;
		this.combo = combo;
		this.monAn = monAn;
		this.soLuong = soLuong;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Combo getCombo() {
		return combo;
	}
	public void setCombo(Combo combo) {
		this.combo = combo;
	}
	public MonAn getMonAn() {
		return monAn;
	}
	public void setMonAn(MonAn monAn) {
		this.monAn = monAn;
	}
	public float getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(float soLuong) {
		this.soLuong = soLuong;
	}
	@Override
	public String toString() {
		return "MonAn_Combo [id=" + id + ", combo=" + combo + ", monAn=" + monAn + ", soLuong=" + soLuong + "]";
	}
	
	
}
