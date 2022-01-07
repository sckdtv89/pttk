package com.restaurant.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.restaurant.dao.ThanhVienDao;
import com.restaurant.model.ThanhVien;

@WebServlet(urlPatterns = "/dang-nhap")
public class LoginController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private ThanhVienDao thanhVienDao = new ThanhVienDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message = request.getParameter("message");
        String alert = request.getParameter("alert");
        if(message != null && alert != null){
            request.setAttribute("message", "Tài khoản hoặc mật khẩu không đúng, vui lòng nhập lại");
            request.setAttribute("alert", alert);
        }
        RequestDispatcher rd = request.getRequestDispatcher("/views/login.jsp");
        rd.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String taiKhoan = request.getParameter("taiKhoan");
        String matKhau = request.getParameter("matKhau");
        ThanhVien thanhVien = thanhVienDao.checkLogin(taiKhoan, matKhau);
//        System.out.println(thanhVien);
        if(thanhVien != null){
            HttpSession session = request.getSession();
            session.setAttribute("USER", thanhVien);
            if(thanhVien.getViTri().equals("2")){
                response.sendRedirect(request.getContextPath() + "/trang-chu");
            }
        }else{
            response.sendRedirect(request.getContextPath() + "/dang-nhap?message=username_password_invalid&alert=danger");
        }
    }
}
