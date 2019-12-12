package _2_cat_GetterSetterMethod;

public class Cat_Test {
	
	public static void main(String[] args) {
		
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
		
		Cat_VO catJabong = new Cat_VO();
		// catJabong.catName = "자봉"; // 이걸 실행하면 오류가 뜬다
		// private으로 설정해놔서 직접접근이 안되기 때문
		
		catJabong.setCatId(1); // 고양이의 번호를 1번부터 순서대로 설정
		System.out.println(catJabong.getCatId());
		
		catJabong.setCatName("자봉"); // 고양이의 이름을 setter method로 main()에서 설정
		System.out.println(catJabong.getCatName());
		catJabong.setCatGender(2); // 고양이의 성별 setter method로 main()에서 설정
		catJabong.setCatSpecies("Bengal"); // 고양이의 종을 setter method를 main()에서 설정
		catJabong.setCatWeight(4);  // 고양이의 몸무게를 설정
		catJabong.setCatColor("갈색"); // 고양이의 색을 설정
		
		
		
		// 왜 getter method는 지금 여기서 쓰이지 않는 것인가?
		
		
		System.out.println(); // 고양이 개체 구분을 위한 공백 줄 1개
		
		Cat_VO catYangi = new Cat_VO();

		catYangi.setCatId(2); 
		catYangi.setCatName("양이"); 
		catYangi.setCatGender(1);
		catYangi.setCatSpecies("코리안 숏헤어"); 
		catYangi.setCatWeight(5);  
		catYangi.setCatColor("회색과 흰색");
		
		
		
		System.out.println(); // 고양이 개체 구분을 위한 공백 줄 1개
		
		Cat_VO catWierdCat = new Cat_VO();

		catWierdCat.setCatId(15); 
		catWierdCat.setCatName("이상한 고양이"); 
		catWierdCat.setCatGender(5);
		catWierdCat.setCatSpecies("이상한 종"); 
		catWierdCat.setCatWeight(19);  
		catWierdCat.setCatColor("보라색");
		
		Cat_ServiceClass cat_service = new Cat_ServiceClass();
		// cat_service.catId(2);
		cat_service.checkGender(5);
		
		System.out.println(catWierdCat.getCatId());
		
		
	}

}
