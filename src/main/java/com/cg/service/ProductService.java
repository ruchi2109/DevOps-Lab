package com.cg.service;

import com.cg.dao.ProductDao;

public class ProductService {
	
private ProductDao dao;
	
	public ProductService(ProductDao dao) 
	{
		this.dao = dao;
	}
	
	public boolean addProduct(String product)
	{
		return dao.save(product);
	}

}
