package _2_cat_GetterSetterMethod;

public class Cat_VO { // 고양이 클래스
	
	// 멤버변수를 선언
	private int catId; // 고양이의 번호
	private String catName; // 고양이의 이름
	private String catSpecies; // 고양이의 종
	private int catWeight; // 고양이의 몸무게
	private String catColor; // 고양이의 털 색
	private int catGender; // 고양이의 성별
	
	// 조건 부분은 getter() setter() method에서 설정하고
	// 프린트(출력)하는 부분은 getter() setter() 에 만들지 말고, 
	// service 클래스를 만들어서 거기에서 작성하는 것이 좋다.
	
	
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		System.out.println(catId + "번 고양이의 이름은 " + catName + " 입니다.");
		this.catName = catName;
	}
	
	public int getCatGender() {
		return catGender;
	}
	/* public void setCatGender(int catGender) {
		
		if(catGender == 1) { 
			System.out.println(catName + " 고양이는 남자 고양이 입니다.");
			this.catGender = catGender;
		} else if (catGender == 2) {
			System.out.println(catName + " 고양이는 여자 고양이 입니다.");
			this.catGender = catGender;
		} else {
			System.out.println("고양이는 남자 고양이 또는 여자 고양이 뿐입니다. 다시 입력하세요.");
		}
	}
	*/
	
	public void setCatGender(int catGender) {
		this.catGender = catGender;
	}
	public String getCatSpecies() {
		return catSpecies;
	}
	public void setCatSpecies(String catSpecies) {
		System.out.println(catName + " 고양이의 종은 " + catSpecies + "입니다.");
		this.catSpecies = catSpecies;
	}
	public int getCatWeight() {
		return catWeight;
	}
	public void setCatWeight(int catWeight) {
		
		if ( catWeight > 0 && catWeight < 17 ) {
			System.out.println( this.catName + " 고양이의 몸무게는 " + catWeight +"Kg 입니다.");
		} else if ( catWeight > 17 ) {
		System.out.println("고양이는 1~16Kg 입니다. 다시 입력하세요.");
		}
		this.catWeight = catWeight;
	}
	
	public void setCatColor(String catColor) {
		
		
		if (catColor == "빨간색" || catColor == "파란색") {
			System.out.println("고양이가 " + catColor + "일 수는 없어요. 다시 입력하세요.");
		} else if (catColor == "보라색" || catColor == "초록색") {
			System.out.println("고양이가 " + catColor + "일 수는 없어요. 다시 입력하세요.");
		} else {
			System.out.println(catName + " 고양이는 " + catColor + "입니다." );
		}
	
		this.catColor = catColor;
	}
	public String getCatColor() {
		return catColor;
	}
	
	

}

	

	
