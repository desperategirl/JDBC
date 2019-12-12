package com.biz.dbms.dao;

import java.util.List;

import com.biz.dbms.persistence.BBsDTO;

public interface BBsDao {

	public List<BBsDTO> selectAll();
	
	public BBsDTO findById(long bs_id);
	
	public int insert(BBsDTO bbsDTO); 
	public int update(BBsDTO bbsDTO);
	public int delete(long bs_Id); // findById랑 항상 같이 사용한ㄷ랄라랄
	
	// DB와 관련한 메서드는 최소한 이 다섯가지는 구현을 해야 한다앙ㄹㅇㄹㅇㄹ
	
	
}
