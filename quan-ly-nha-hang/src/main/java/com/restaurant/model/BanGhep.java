package com.restaurant.model;

import java.io.Serializable;
import java.sql.Time;

public class BanGhep implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private int idBanGhep;
	private Ban ban;
	private Time thoiGianGhep;
	
	public BanGhep() {
		// TODO Auto-generated constructor stub
	}
	public BanGhep(int id, int idBanGhep, Ban ban, Time thoiGianGhep) {
		super();
		this.id = id;
		this.idBanGhep = idBanGhep;
		this.ban = ban;
		this.thoiGianGhep = thoiGianGhep;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdBanGhep() {
		return idBanGhep;
	}
	public void setIdBanGhep(int idBanGhep) {
		this.idBanGhep = idBanGhep;
	}
	public Ban getBan() {
		return ban;
	}
	public void setBan(Ban ban) {
		this.ban = ban;
	}
	public Time getThoiGianGhep() {
		return thoiGianGhep;
	}
	public void setThoiGianGhep(Time thoiGianGhep) {
		this.thoiGianGhep = thoiGianGhep;
	}
	@Override
	public String toString() {
		return "BanGhep [id=" + id + ", idBanGhep=" + idBanGhep + ", ban=" + ban + ", thoiGianGhep=" + thoiGianGhep
				+ "]";
	}
	
	
}
