package com.restaurant.model;

import java.io.Serializable;
import java.util.Date;

public class ThanhVien implements Serializable {

    private static final long serialVersionUID = 1L;

    private int idThanhVien;
    private String taiKhoan;
    private String matKhau;
    private String hoTen;
    private Date ngaySinh;
    private String diaChi;
    private String sdt;
    private String moTa;
    private String viTri;
    
    public ThanhVien() {
    }

    public ThanhVien(int idThanhVien, String taiKhoan, String matKhau, String hoTen, Date ngaySinh, String diaChi, String sdt,
                     String moTa, String viTri) {
        super();
        this.idThanhVien = idThanhVien;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.moTa = moTa;
        this.viTri = viTri;
    }

    public ThanhVien(String taiKhoan, String matKhau, String hoTen, Date ngaySinh, String diaChi, String sdt, String moTa,
                     String viTri) {
        super();
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.moTa = moTa;
        this.viTri = viTri;
    }

    public int getIdThanhVien() {
        return idThanhVien;
    }

    public void setIdThanhVien(int idThanhVien) {
        this.idThanhVien = idThanhVien;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    @Override
    public String toString() {
        return "ThanhVien [idThanhVien=" + idThanhVien + ", taiKhoan=" + taiKhoan + ", matKhau=" + matKhau + ", hoTen=" + hoTen
               + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", sdt=" + sdt + ", moTa=" + moTa + ", viTri=" + viTri + "]";
    }
}
