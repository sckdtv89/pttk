package com.restaurant.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.restaurant.model.BanDat;
import com.restaurant.model.BanDatMonAn;

public class BanDatMonAnDaoTest {

	@Test
	public void testGetMonAn() {
		int maBan = 1;
		BanDatMonAnDao bdgmDAO = new BanDatMonAnDao();
		ArrayList<BanDatMonAn> lstBDMA = new ArrayList<BanDatMonAn>();
		lstBDMA = (ArrayList<BanDatMonAn>) bdgmDAO.getMonAn(maBan);
		assertNotNull(lstBDMA);
		assertEquals(2, lstBDMA.size());
	}

}
