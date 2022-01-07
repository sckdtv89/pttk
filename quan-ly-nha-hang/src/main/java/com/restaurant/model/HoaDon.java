package com.restaurant.model;

import java.io.Serializable;
import java.util.Date;

public class HoaDon implements Serializable{

	private static final long serialVersionUID = 1L;

	private int idHoaDon;
	private ThanhVien thanhVien;
	private Ban ban;
	private BanGhep banGhep;
	private String tenKhachHang;
	private Date ngay;
	private PhieuGiamGia maGiamGia;
	private double tongTien;
	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HoaDon(int idHoaDon, ThanhVien thanhVien, Ban ban, BanGhep banGhep, String tenKhachHang, Date ngay,
			PhieuGiamGia maGiamGia, double tongTien) {
		super();
		this.idHoaDon = idHoaDon;
		this.thanhVien = thanhVien;
		this.ban = ban;
		this.banGhep = banGhep;
		this.tenKhachHang = tenKhachHang;
		this.ngay = ngay;
		this.maGiamGia = maGiamGia;
		this.tongTien = tongTien;
	}
	public int getIdHoaDon() {
		return idHoaDon;
	}
	public void setIdHoaDon(int idHoaDon) {
		this.idHoaDon = idHoaDon;
	}
	public ThanhVien getThanhVien() {
		return thanhVien;
	}
	public void setThanhVien(ThanhVien thanhVien) {
		this.thanhVien = thanhVien;
	}
	public Ban getBan() {
		return ban;
	}
	public void setBan(Ban ban) {
		this.ban = ban;
	}
	public BanGhep getBanGhep() {
		return banGhep;
	}
	public void setBanGhep(BanGhep banGhep) {
		this.banGhep = banGhep;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public Date getNgay() {
		return ngay;
	}
	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}
	public PhieuGiamGia getMaGiamGia() {
		return maGiamGia;
	}
	public void setMaGiamGia(PhieuGiamGia maGiamGia) {
		this.maGiamGia = maGiamGia;
	}
	public double getTongTien() {
		return tongTien;
	}
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
	@Override
	public String toString() {
		return "HoaDon [idHoaDon=" + idHoaDon + ", thanhVien=" + thanhVien + ", ban=" + ban + ", banGhep=" + banGhep
				+ ", tenKhachHang=" + tenKhachHang + ", ngay=" + ngay + ", maGiamGia=" + maGiamGia + ", tongTien="
				+ tongTien + "]";
	}
	
	
	
	
}
