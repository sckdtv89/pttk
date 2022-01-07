package com.restaurant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.restaurant.model.Ban;

public class BanDao {

  private Connection con = null;
  
  public List<Ban> getBan(){
    List<Ban> bans = new ArrayList<>();
    Ban ban = null;
    String sql = "select * from ban";
    con = DBConnection.getConnection();
    PreparedStatement statement;
    try {
      statement = con.prepareStatement(sql);
      ResultSet rs = statement.executeQuery();
      while(rs.next()) {
        ban = new Ban();
        ban.setIdBan(rs.getInt("id_ban"));
        ban.setSoLuongNguoi(rs.getInt("so_luong_nguoi"));
        ban.setTenBan(rs.getString("ten_ban"));
        ban.setMoTa(rs.getString("mo_ta"));
        bans.add(ban);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return bans;
  }
}
