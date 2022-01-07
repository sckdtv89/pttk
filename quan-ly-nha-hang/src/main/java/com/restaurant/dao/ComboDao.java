package com.restaurant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.restaurant.model.BanDat;
import com.restaurant.model.Combo;

public class ComboDao {

	private Connection con = null;
	private BanDatDao banDatDao = new BanDatDao();
	
	public List<Combo> getCombo(int maBan){
		List<Combo> listCombo = new ArrayList<>();
		String sql = "select c.* from ban_dat bd join bandat_combo bc on bd.id_ban_dat = bc.id_bandat join combo c on bc.id_combo = c.id_combo where bd.id_ban_dat = ?";
        con = DBConnection.getConnection();
        PreparedStatement statement;
        BanDat banDat = banDatDao.getBanDat(maBan);
        if(banDat != null) {
        	try {
    			statement = con.prepareStatement(sql);
    			statement.setInt(1, banDat.getId());
    			ResultSet rs = statement.executeQuery();
    			while(rs.next()) {
    				Combo combo = new Combo();
    				combo.setIdCombo(rs.getInt("id_combo"));
    				combo.setTenCombo(rs.getString("ten_combo"));
    				combo.setGiaHienTai(rs.getDouble("gia_hien_tai"));
    				combo.setMoTa(rs.getString("mo_ta"));
    				listCombo.add(combo);
    			}
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        }
        
		return listCombo;
	}
}
