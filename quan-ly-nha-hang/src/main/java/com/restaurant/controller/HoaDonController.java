package com.restaurant.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.restaurant.dao.BanDatDao;
import com.restaurant.dao.HoaDonDao;
import com.restaurant.model.Ban;
import com.restaurant.model.BanDat;
import com.restaurant.model.HoaDon;
import com.restaurant.model.ThanhVien;

@WebServlet(urlPatterns = "/hoa-don")
public class HoaDonController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private HoaDonDao hoaDonDao = new HoaDonDao();
	private BanDatDao banDatDao = new BanDatDao();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String idBan = request.getParameter("ban");
		String tenKhachHang = request.getParameter("tenKhachHang");
		String tongTien = request.getParameter("tongTien");
		int maBan = 0;
		if(idBan != null) {
			maBan = Integer.parseInt(idBan);
		}
		String tonTienStr = tongTien.substring(0, tongTien.length()- 4);
		double tongTienHoaDon = 0;
		if(tonTienStr != null) {
			tongTienHoaDon = Double.parseDouble(tonTienStr);
		}
		HttpSession session = request.getSession();
		ThanhVien thanhVien = (ThanhVien) session.getAttribute("USER");
		HoaDon hoaDon = new HoaDon();
		hoaDon.setBan(new Ban(maBan));
		hoaDon.setTenKhachHang(tenKhachHang);
		hoaDon.setThanhVien(thanhVien);
		hoaDon.setTongTien(tongTienHoaDon);
		Date date = new Date();
		hoaDon.setNgay(date);
		hoaDonDao.luuHoaDon(hoaDon);
		BanDat banDat = banDatDao.getBanDat(maBan);
		banDatDao.updateBanDat(banDat);
		response.sendRedirect(request.getContextPath() + "/thanh-toan?message=success&alert=success");
	}
	
}
