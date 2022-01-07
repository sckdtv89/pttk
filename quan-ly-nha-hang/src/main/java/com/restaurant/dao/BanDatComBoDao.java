package com.restaurant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.restaurant.model.BanDat;
import com.restaurant.model.BanDatCombo;
import com.restaurant.model.Combo;

public class BanDatComBoDao {

	private Connection con = null;
	private BanDatDao banDatDao = new BanDatDao();
	
	public List<BanDatCombo> getCombo(int maBan){
		List<BanDatCombo> listCombo = new ArrayList<>();
		String sql = "select c.*, bc.so_luong from ban_dat bd join bandat_combo bc on bd.id_ban_dat = bc.id_bandat join combo c on bc.id_combo = c.id_combo where bd.id_ban_dat = ?";
        con = DBConnection.getConnection();
        PreparedStatement statement;
        BanDat banDat = banDatDao.getBanDat(maBan);
        if(banDat != null) {
        	try {
    			statement = con.prepareStatement(sql);
    			statement.setInt(1, banDat.getId());
    			ResultSet rs = statement.executeQuery();
    			while(rs.next()) {
    				BanDatCombo banDatCombo = new BanDatCombo();
    				Combo combo = new Combo();
    				combo.setIdCombo(rs.getInt("id_combo"));
    				combo.setTenCombo(rs.getString("ten_combo"));
    				combo.setGiaHienTai(rs.getDouble("gia_hien_tai"));
    				combo.setMoTa(rs.getString("mo_ta"));
    				banDatCombo.setCombo(combo);
    				banDatCombo.setSoLuong(rs.getInt("so_luong"));
    				listCombo.add(banDatCombo);
    			}
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        }
        
		return listCombo;
	}
}
