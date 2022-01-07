package com.restaurant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.restaurant.model.BanDat;
import com.restaurant.model.MonAn;

public class MonAnDao {

	private Connection con = null;
	private BanDatDao banDatDao = new BanDatDao();
	
	public List<MonAn> getMonAn(int maBan){
		List<MonAn> listMonAn = new ArrayList<>();
		String sql = "select m.* from ban_dat bd join bandat_monan bm on bd.id_ban_dat = bm.id_bandat join monan m on bm.id_mon = m.id_mon where bd.id_ban_dat = ?";
        con = DBConnection.getConnection();
        PreparedStatement statement;
        BanDat banDat = banDatDao.getBanDat(maBan);
        if(banDat != null){
        	try {
    			statement = con.prepareStatement(sql);
    			statement.setInt(1, banDat.getId());
    			ResultSet rs = statement.executeQuery();
    			while(rs.next()) {
    				MonAn monAn = new MonAn();
    				monAn.setIdMonAn(rs.getInt("id_mon"));
    				monAn.setLoaiMon(rs.getString("loai_mon"));
    				monAn.setTenMon(rs.getString("ten_mon"));
    				monAn.setGiaHienTai(rs.getDouble("gia_hien_tai"));
    				monAn.setMoTa(rs.getString("mo_ta"));
    				listMonAn.add(monAn);
    			}
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        }
        
		return listMonAn;
	}
}
