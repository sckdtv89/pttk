package main;

import java.sql.Connection;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.restaurant.dao.ComboDao;
import com.restaurant.dao.DBConnection;
import com.restaurant.dao.PhieuGiamGiaDao;
import com.restaurant.model.Combo;
import com.restaurant.model.PhieuGiamGia;

public class Main {

    public static void main(String[] args) {
//        Date date = new Date();
//        Timestamp ts=new Timestamp(date.getTime()); 
//        System.out.println(ts);
    	PhieuGiamGiaDao dao = new PhieuGiamGiaDao();
    	List<PhieuGiamGia> phieuGiamGias = dao.getPhieuGiamGia();
    	phieuGiamGias.forEach(p -> System.out.println(p));
    }
}
