package com.restaurant.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.restaurant.dao.BanDao;
import com.restaurant.dao.BanDatComBoDao;
import com.restaurant.dao.BanDatDao;
import com.restaurant.dao.BanDatMonAnDao;
import com.restaurant.dao.ComboDao;
import com.restaurant.dao.MonAnDao;
import com.restaurant.dao.PhieuGiamGiaDao;
import com.restaurant.model.Ban;
import com.restaurant.model.BanDat;
import com.restaurant.model.BanDatCombo;
import com.restaurant.model.BanDatMonAn;
import com.restaurant.model.Combo;
import com.restaurant.model.MonAn;
import com.restaurant.model.PhieuGiamGia;

@WebServlet(urlPatterns = "/thanh-toan")
public class ThanhToanController extends HttpServlet {

	private static final long serialVersionUID = 1L;
//	private MonAnDao monAnDao = new MonAnDao();
	private ComboDao comboDao = new ComboDao();
	private BanDatDao banDatDao = new BanDatDao();
	private BanDao banDao = new BanDao();
	private BanDatMonAnDao banDatMonAnDao = new BanDatMonAnDao();
	private PhieuGiamGiaDao phieuGiamGiaDao = new PhieuGiamGiaDao();
	private BanDatComBoDao banDatComBoDao = new BanDatComBoDao();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message = request.getParameter("message");
		String alert = request.getParameter("alert");
		if(message != null && alert != null){
			if(message.equals("dathanhtoan")){
				request.setAttribute("message", "Bàn đã được thanh toán");
			} else {
				request.setAttribute("message", "Thanh toán thành công");
			}
			request.setAttribute("alert", alert);
		}
		List<Ban> bans = banDao.getBan();
		request.setAttribute("bans", bans);
		RequestDispatcher rd = request.getRequestDispatcher("/views/thanhtoan.jsp");
        rd.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String banan = request.getParameter("banan");
		int maBan = 0;
		if(banan != null) {
			maBan = Integer.parseInt(banan);
		}
		BanDat banDat = banDatDao.getBanDat(maBan);
		if(banDat == null) {
			response.sendRedirect(request.getContextPath() + "/thanh-toan?message=dathanhtoan&alert=success");
		} else {
//			List<MonAn> monAns = monAnDao.getMonAn(maBan);
			List<BanDatMonAn> listMonAn = banDatMonAnDao.getMonAn(maBan);
//			List<Combo> combos = comboDao.getCombo(maBan);
			List<BanDatCombo> combos = banDatComBoDao.getCombo(maBan);
			double tongTien = 0;
//			for(MonAn monAn : monAns) {
//				tongTien += monAn.getGiaHienTai();
//			}
			for(BanDatMonAn bd : listMonAn) {
				tongTien += bd.getMonAn().getGiaHienTai()*bd.getSoLuong();
			}
//			for(Combo combo : combos) {
//				tongTien += combo.getGiaHienTai();
//			}
			for(BanDatCombo bc : combos) {
				tongTien += bc.getCombo().getGiaHienTai()*bc.getSoLuong();
			}
			request.setAttribute("monAns", listMonAn);
			request.setAttribute("combos", combos);
			request.setAttribute("banDat", banDat);
			request.setAttribute("tongTien", tongTien);
			List<PhieuGiamGia> phieuGiamGias = phieuGiamGiaDao.getPhieuGiamGia();
			request.setAttribute("phieuGiamGias", phieuGiamGias);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/hoadon.jsp");
			dispatcher.forward(request, response);
		}
		
	}
}
