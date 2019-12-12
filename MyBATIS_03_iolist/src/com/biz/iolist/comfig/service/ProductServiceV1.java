package com.biz.iolist.comfig.service;

import com.biz.iolist.config.DBConnection;
import com.biz.iolist.dao.ProductDao;

public class ProductServiceV1 {

	protected ProductDao proDao;
	
	public ProductServiceV1() {
			this.proDao = DBConnection.getSqlSessionFactory()
							.openSession(true)
							.getMapper(ProductDao.class);
	}
	
}
