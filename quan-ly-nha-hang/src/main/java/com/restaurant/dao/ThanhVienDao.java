package com.restaurant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.restaurant.model.ThanhVien;

public class ThanhVienDao {

    private Connection con = null;
    public ThanhVien checkLogin(String taiKhoan, String matKhau) {
        ThanhVien thanhVien = null;
        String sql = "select * from thanh_vien where tai_khoan = ? and mat_khau = ?";
        con = DBConnection.getConnection();
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, taiKhoan);
            statement.setString(2, matKhau);
            ResultSet rs = statement.executeQuery();
            if(rs.next()) {
                thanhVien = new ThanhVien();
                thanhVien.setIdThanhVien(rs.getInt("id_thanh_vien"));
                thanhVien.setHoTen(rs.getString("ho_ten"));
                thanhVien.setDiaChi(rs.getString("dia_chi"));
                thanhVien.setTaiKhoan(rs.getString("tai_khoan"));
                thanhVien.setMatKhau(rs.getString("mat_khau"));
                thanhVien.setNgaySinh(rs.getTimestamp("ngay_sinh"));
                thanhVien.setSdt(rs.getString("sdt"));
                thanhVien.setViTri(rs.getString("vi_tri"));
                thanhVien.setMoTa(rs.getString("mo_ta"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return thanhVien;
    }
}
