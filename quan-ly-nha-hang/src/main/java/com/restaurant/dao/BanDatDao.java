package com.restaurant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.restaurant.model.BanDat;

public class BanDatDao {

  private Connection con = null;

  public BanDat getBanDat(int maBan) {
    BanDat banDat = null;
    String sql = "select * from ban_dat where id_ban = ? and tinh_trang = ?";
    con = DBConnection.getConnection();
    PreparedStatement statement;
    try {
      statement = con.prepareStatement(sql);
      statement.setInt(1, maBan);
      statement.setBoolean(2, false);
      ResultSet rs = statement.executeQuery();
      if (rs.next()) {
        banDat = new BanDat();
        banDat.setId(rs.getInt(1));
        banDat.setIdBan(rs.getInt(2));
        banDat.setTenKhachHang(rs.getString(3));
        banDat.setThoiGianDat(rs.getTimestamp(4));
        banDat.setTinhTrang(rs.getBoolean(5));
      }
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    return banDat;
  }

  public void updateBanDat(BanDat banDat) {
    String sql = "update ban_dat set tinh_trang = 1 where id_ban_dat = ?";
    con = DBConnection.getConnection();
    PreparedStatement statement;
    try {
      statement = con.prepareStatement(sql);
      statement.setInt(1, banDat.getId());
      statement.executeUpdate();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
