package com.restaurant.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.restaurant.model.BanDat;

public class BanDatDaoTest {

	BanDatDao bdd = new BanDatDao();
	@Test
	public void testGetBanDat() {
		int maBan = 1;
		BanDat bd = bdd.getBanDat(maBan);
		assertNotNull(bd);
	}

	@Test
	public void testUpdateBanDat() {
		int maBan = 1;
		boolean bd = bdd.getBanDat(maBan).isTinhTrang();
		assertTrue(bd);
	}

}
