package _2_cat_GetterSetterMethod;

public class Cat_ServiceClass {
	
	/*
	 * private int catId;			 // 고양이의 번호
	 * private String catName;		 // 고양이의 이름
	 * private int catGender; 		 // 고양이의 성별
	 * private String catSpecies; 	 // 고양이의 종
	 * private int catWeight; 	
	 * 	 // 고양이의 몸무게
	 * private String catColor; 	 // 고양이의 털 색
	 * 
	 */
	Cat_VO cVO = new Cat_VO();
	
	public void catId (int a) {
		cVO.setCatId(a);

		if ( cVO.getCatId() > 0 && cVO.getCatId() < 11) {
		 System.out.println("이 고양이는 " + cVO.getCatId() + "번 입니다.");
		} else if ( cVO.getCatId() == 11 || cVO.getCatId() > 11){ // 고양이의 번호가 11이거나 11 초과인 정수일 때
			System.out.println("고양이의 번호는 1번부터 10번까지입니다. 다시 입력하세요.");
		}
		
		// return cVO.getCatId();
	}
	
	public void checkGender(int a) {
		if(a == 1) {
			System.out.println("이 고양이는 수컷입니다");
			cVO.setCatGender(a);
		}
		else if(a == 2) {
			System.out.println("이 고양이는 암컷입니다");
			cVO.setCatGender(a);
		}
		else
			System.out.println("성별은 1, 2만 있습니다. 다시 입력하세요");
	}
	
	
	public void catName() {
		
	}
	
	
	
	
	

}
