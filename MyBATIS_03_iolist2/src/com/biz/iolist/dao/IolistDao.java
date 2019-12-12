package com.biz.iolist.dao;

import java.util.List;

import com.biz.iolist.persistence.IolistDTO;

public interface IolistDao {
	
	public List<IolistDTO> selectAll();
	public IolistDTO findById();
	public int insert(IolistDTO iolistDTO);
	public int update(IolistDTO iolistDTO);
	public int delete(IolistDTO iolistDTO);

}
