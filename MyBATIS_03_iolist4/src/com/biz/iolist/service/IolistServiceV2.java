package com.biz.iolist.service;

import java.util.List;
import java.util.Scanner;

import com.biz.iolist.dao.DeptDao;
import com.biz.iolist.dao.IolistDao;
import com.biz.iolist.dao.ProductDao;
import com.biz.iolist.persistence.DeptDTO;

public class IolistServiceV2 {

	Scanner scanner ;
	
	protected IolistDao ioDao ;
	protected ProductDao proDao;
	protected DeptDao deptDao;
	/*
	 * 매입매출등록
	 * 날짜 현재날짜로 자동등록
	 * 
	 * 거래처검색
	 * 거래처코드입력
	 * 입력한코드 검증
	 * 
	 * 상품검색
	 * 상품코드입력
	 * 입력한코드 검증
	 * 
	 * 매입, 매출구분입력
	 * 
	 * 매입, 매출에 따라서 
	 * 매입단가, 매출단가 가져오기(세팅)
	 * 
	 * 수량입력
	 * 단가 * 수량 계산
	 * 
	 * 
	 * 매입합계 또는 매출합계 계산하기
	 * 
	 * insert() 
	 * 추가된 데이터 보여주기
	 */
	
	public void insert() {
		System.out.println("===============================");
		System.out.println("거래처 코드 검색");
		System.out.println("===============================");

		System.out.print("거래처 코드 >> ");
		String strDCode = scanner.nextLine();

		List<DeptDTO> deptList = null;
		if(strDCode.trim().isEmpty()) {
			deptList = deptDao.selectAll();
		} else {
			deptList = deptDao.findBy???(strDCode);	
		}
		this.viewList(deptList);
	
		
		
	}
	
}
