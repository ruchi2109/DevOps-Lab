package com.cg.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.cg.dao.ProductDao;
import com.cg.service.ProductService;

public class TestMocking {
	
	private ProductDao dao;
	private ProductService service;
	
	@Before
	public void init() 
	{
		dao = Mockito.mock(ProductDao.class);
		service = new ProductService(dao);
	}
	
	@Test
	public void testAddProduct()
	{
		Mockito.when(dao.save("iPhone")).thenReturn(true);
		assertTrue(service.addProduct("iPhone"));
		Mockito.verify(dao).save("iPhone");
	}
	
	@After
	public void destroy() {
		dao = null;
		service = null;
	}

}
