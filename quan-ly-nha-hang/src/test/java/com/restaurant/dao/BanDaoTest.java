package com.restaurant.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.restaurant.model.Ban;

public class BanDaoTest {
    
	BanDao bd = new BanDao();
	@Test
	public void testGetBanChuan() {
	    int IdBan = 1;
	    ArrayList<Ban> lstB = new ArrayList<Ban>();
	    lstB =  (ArrayList<Ban>) bd.getBan();
	    assertNotNull(lstB);
	    assertEquals(5, lstB.size());
	}
}
