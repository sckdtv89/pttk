package com.restaurant.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.restaurant.model.ThanhVien;

import junit.framework.Assert;

public class ThanhVienDaoTest {
	@BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

	
	@Test
	public void testCheckLogin() {
		
	}
	
	ThanhVienDao tvd = new ThanhVienDao();
	@Test
	public void testCheckLoginFull() {
		String taiKhoan = "leduca";
		String matKhau = "123456";
		ThanhVien tv = tvd.checkLogin(taiKhoan, matKhau);
		assertNotNull(tv);
	}
	
	@Test
	public void testCheckLoginNullTK() {
		String taiKhoan = "";
		String matKhau = "123456";
		ThanhVien tv = tvd.checkLogin(taiKhoan, matKhau);
		assertNull(tv);
	}
	@Test
	public void testCheckLoginNullMK() {
		String taiKhoan = "leduca";
		String matKhau = "";
		ThanhVien tv = tvd.checkLogin(taiKhoan, matKhau);
		assertNull(tv);
	}
	@Test
	public void testCheckLoginNull() {
		String taiKhoan = "";
		String matKhau = "";
		ThanhVien tv = tvd.checkLogin(taiKhoan, matKhau);
		assertNull(tv);
	}
	
}
