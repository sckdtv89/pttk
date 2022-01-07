package com.restaurant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.restaurant.model.HoaDon;

public class HoaDonDao {

	private Connection con = null;
	public void luuHoaDon(HoaDon hoaDon) {
		String sql = "insert into hoa_don(id_nhan_vien, id_ban, ten_khach_hang, ngay, tong_tien) values(?,?,?,?,?)";
		con = DBConnection.getConnection();
		PreparedStatement statement;
		try {
			statement = con.prepareStatement(sql);
			statement.setInt(1, hoaDon.getThanhVien().getIdThanhVien());
			statement.setInt(2, hoaDon.getBan().getIdBan());
			statement.setString(3, hoaDon.getTenKhachHang());
			Timestamp ts=new Timestamp(hoaDon.getNgay().getTime());  
			statement.setTimestamp(4, ts);
			statement.setDouble(5, hoaDon.getTongTien());
			statement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
