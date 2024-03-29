package com.biz.dbms.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.biz.dbms.config.DBConnection;
import com.biz.dbms.dao.BBsDao;
import com.biz.dbms.persistence.BBsDTO;

public class BBsServiceV4 {

	SqlSession sqlSession = null;
	Scanner scanner = null;

	public BBsServiceV4() {
		sqlSession = DBConnection.getSqlSessionFactory().openSession(true);

		scanner = new Scanner(System.in);
	}

	public void bbsMenu() {

		while (true) {
			System.out.println("내용보기 (SQ 입력) W. 작성   U.수정   D. 삭제   Q. 종료");
			String strMenu = scanner.nextLine();

			if (strMenu.equalsIgnoreCase("Q")) {
				return;
			} else if (strMenu.equalsIgnoreCase("Q")) {

			} else if (strMenu.equalsIgnoreCase("W")) {
				this.writeBBS();
				this.viewBBsList();

			} else if (strMenu.equalsIgnoreCase("U")) {
				this.viewBBsList();
				this.updateBBS();
			
			} else if (strMenu.equalsIgnoreCase("D")) {
				this.deleteBBS();
				this.viewBBsList();

			} else {
				try {

					long longSEQ = Integer.valueOf(strMenu);
					this.viewText(longSEQ);

				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}

		}

	}

	public void viewText(long bs_id) {

		BBsDao bbsDao = sqlSession.getMapper(BBsDao.class);
		System.out.println("findbyid 하기 전");
		BBsDTO bbsDTO = bbsDao.findById(bs_id);
		System.out.println("findbyid 한 후");
		
		if (bbsDTO == null) {
			System.out.println("내용이 없습니당ㅇㅇㅇㅇㅇㅇㅇ");
		} else {
			System.out.println("제목 : " + bbsDTO.getBs_subject());
			System.out.println("작성 : " + bbsDTO.getBs_writer());
			System.out.println("작성일 : " + bbsDTO.getBs_date());
			System.out.println("작성시각 : " + bbsDTO.getBs_time());
			System.out.println(bbsDTO.getBs_text());
		}
		System.out.println("if문 통과 후");
	}

	public void updateBBS() {

		/*
		 * 수정할 ID를 입력받고 
		 * 내용을 한 번 보여주고 
		 * 각 항목을 입력받고 
		 * Enter를 입력하면 
		 * 원래 데이터 유지 새로 입력하면 
		 * 새로운 값으로 대치
		 */
	

			System.out.println("============================");
			System.out.println("게시글 정보 수정");
			System.out.println("=============================");
			System.out.println("수정할 ID(-Q: quit) >> ");
			String intID = scanner.nextLine();
			long longID = Long.valueOf(intID);
			if (intID.equals("-Q"))
				; // 입력을 끝내기

			// 키보드로 입력받은 ID에 해당하는 도서정보를 가져오기
			
			BBsDao bbsDao = sqlSession.getMapper(BBsDao.class);
			BBsDTO bbsDTO = bbsDao.findById(longID);
	
			/*
			 * 보통의 경우 PK를 수정하는 프로세스는 좋지 않다. 
			 * PK를 수정해야 할 경우는 기존의 Data를 삭제하고 새로운 데이터를 INSERT하거나
			 * 기존의 Data는 그대로 유지하고 새로운 데이터를 INSERT
			 */
			// 각 항목별로 값을 수정
		

			System.out.printf("변경할 작성자(%s)", bbsDTO.getBs_writer());
			String strWriter = scanner.nextLine();
			if (strWriter.trim().length() > 0) {
				bbsDTO.setBs_writer(strWriter.trim());
			}

			System.out.printf("변경할 제목(%s)", bbsDTO.getBs_subject());
			String strSubject = scanner.nextLine();
			if (strSubject.trim().length() > 0) {
				bbsDTO.setBs_subject(strSubject.trim());
			}
			
			System.out.printf("변경할 내용(%s)", bbsDTO.getBs_text());
			String strText = scanner.nextLine();
			if (strText.trim().length() > 0) {
				bbsDTO.setBs_text(strText.trim());
			}
			

			int ret = bbsDao.update(bbsDTO);
			if (ret > 0) {
				System.out.println("게시글 정보를 변경했습니다");
			} else {
				System.out.println("게시글 정보 변경 실패");
			}
		}


	public void deleteBBS() {

		// 삭제할 게시판 ID를 입력받고
		// 해당 ID의 내용을 보여주고
		// 삭제할래????????????????????????????????? 라고 물어본다음에
		// 삭제를 진행
		System.out.println("--------------o=====================");
		System.out.println("삭제할 ID(-Q : quit) >> ");
		String strID = scanner.nextLine();

		try {

			int intID = Integer.valueOf(strID);
			this.viewText(intID);
			System.out.println("--------------------------");
			System.out.println("삭제할거야????????????????????? (Yes or No)");
			String yesNo = scanner.nextLine();
			if (yesNo.equals("Yes")) {
				BBsDao bbsDao = sqlSession.getMapper(BBsDao.class);
				bbsDao.delete(intID);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void writeBBS() {
		/*
		 * 작성자, 제목, 내용을 입력하지 않으면 메시지를 보여주고 다시 입력을 받도록 하자 왜 bs_writer, bs_subject,
		 * bs_text는 NOT NULL이기 때문에 입력받지않으면 DB에서 오류가 난당
		 */
		while (true) {

			System.out.println(" 작성자 (-Q: 작성중단 >> ");
			String strWriter = scanner.nextLine();
			if (strWriter.equals("-Q"))
				break;
			if (strWriter.trim().length() < 1) {
				System.out.println("작성자는 반드시 입력해야 합니다");
				continue;
			}

			System.out.println(" 제목 >> ");
			String strSubject = scanner.nextLine();
			if (strSubject.equals("-Q"))
				break;

			if (strSubject.trim().length() < 1) {
				System.out.println("제목은 반드시 입력해야 합니다");
				continue;
			}

			System.out.println(" 내용 >> ");
			String strText = scanner.nextLine();
			if (strText.equals("-Q"))
				break;

			if (strText.trim().length() < 1) {
				System.out.println("내용은 반드시 입력해야 합니다");
				continue;
			}

			/*
			 * 작성일자, 작성시각은 컴퓨터 시간을 참조하여 자동생성을 하자.
			 * 
			 * java 1.7 이하의 코드작성
			 * 
			 * 
			 */

			// 컴퓨터의 현재 시각 가져오기
			Date date = new Date(System.currentTimeMillis());

			// date 날짜형 값을 "2019-10-24"의 문자열형으로 변환
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

			// date 날짜형 값을 "14:00:00"의 문자열형으로 변환
			SimpleDateFormat tf = new SimpleDateFormat("HH:mm:SS");

			String curDate = df.format(date);
			String curTime = tf.format(date);

			// 입력받은 데이터와 날짜, 시각을 DTO에 담기
			BBsDTO bbsDTO = BBsDTO.builder().bs_date(curDate).bs_time(curTime).bs_writer(strWriter)
					.bs_subject(strSubject).bs_text(strText).build();

			BBsDao bbsDao = sqlSession.getMapper(BBsDao.class);
			int ret = bbsDao.insert(bbsDTO);

			if (ret > 0) {
				System.out.println("게시판 작성 완료 ^.^");
			} else {
				System.out.println("게시판 작성 실패 ㅜ.ㅜ");
			}

			break;
		}
	}

	public void viewBBsList() {

		BBsDao bbsDao = sqlSession.getMapper(BBsDao.class);
		List<BBsDTO> bbsList = bbsDao.selectAll();

		System.out.println("====================");
		System.out.println("슈ㅠㅓ BBS v1");
		System.out.println("+======================");
		System.out.println("SQ\t작성일\t\\t시각\\t\t작성자\\t\t제목");
		for (BBsDTO bbs : bbsList) {
			System.out.println(bbs.getBs_id() + "\t");
			System.out.println(bbs.getBs_date() + "\t");
			System.out.println(bbs.getBs_time() + "\t");
			System.out.println(bbs.getBs_writer() + "\t");
			System.out.println(bbs.getBs_subject());
		}

		System.out.println("======================");
		for (BBsDTO bbs : bbsList) {
			System.out.println(bbs.toString());
		}

	}

}
