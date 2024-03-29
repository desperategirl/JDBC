package com.biz.mybatis.exec;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.biz.mybatis.config.DBConnection;
import com.biz.mybatis.mapper.BookDao;
import com.biz.mybatis.persistence.BookDTO;

public class MyBatisEx_02 {
	
	public static void main(String[] args) {
		/*
		 * JDBC의 다양한 클래스를 댇신하여
		 * Java 어플리케이션과 DBMS간의 연결 Connection을
		 * 대신 관리해줄 클래스, 객체선언
		 * 
		 * sessopm
		 * 네트워크 환경에서 지점과 지점사이가 다양한 방법으로
		 * 연결되고 데이터를 주고받을 준비가 된 통로
		 */
		SqlSession sqlSession = DBConnection.getSqlSessionFactory().openSession(true);
		
		BookDao bookDao 
					= sqlSession.getMapper(BookDao.class);
	
		BookDTO bookDTO = bookDao.findById("B0026");
		System.out.println(bookDTO.toString());
		
	}

}
