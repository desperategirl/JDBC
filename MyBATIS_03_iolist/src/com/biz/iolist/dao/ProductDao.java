package com.biz.iolist.dao;

import java.util.List;

import com.biz.iolist.persistence.ProductDTO;

public interface ProductDao {
	
	public List<ProductDTO> selectAll();
	public ProductDTO findById(String p_code);
	public void insert(ProductDTO productDTO);
	public void update(ProductDTO productDTO);
	public void delete(String p_code);

}
