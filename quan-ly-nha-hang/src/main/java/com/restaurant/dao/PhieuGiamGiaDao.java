package com.restaurant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.restaurant.model.PhieuGiamGia;

public class PhieuGiamGiaDao {

	private Connection con = null;
	public List<PhieuGiamGia> getPhieuGiamGia(){
		List<PhieuGiamGia> phieuGiamGias = new ArrayList<>();
		String sql = "select * from phieu_giam_gia";
        con = DBConnection.getConnection();
        PreparedStatement statement;
        try {
			statement = con.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				PhieuGiamGia phieuGiamGia = new PhieuGiamGia();
				phieuGiamGia.setIdPGG(rs.getInt("id_pgg"));
				phieuGiamGia.setMaGiamGia(rs.getString("ma_giam_gia"));
				phieuGiamGia.setDiscount(rs.getFloat("discount"));
				phieuGiamGia.setMoTa(rs.getString("mo_ta"));
				phieuGiamGias.add(phieuGiamGia);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return phieuGiamGias;
	}
}
