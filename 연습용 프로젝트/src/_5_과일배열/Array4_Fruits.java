package _5_과일배열;

public class Array4_Fruits {
	
	// 객체 배열 사용하기
	private String fruitName;
	private String color;
	private String season;
	
	
	public Array4_Fruits() { // 디폴트 생성자 없이도 코드는 돌아가는데 왜 만들었는가
		
	}
	
	public Array4_Fruits(String fruitName, String color, String season ) { // 과일 색깔과 계절을 매개변수로 받는 생성자
		this.fruitName = fruitName;
		this.color = color;
		this.season = season;  
	}

	public String getFruitName() { // 다른 클래스에서 이 코드를 사용할 때 
									// 멤버 변수 값을 가져오거나 저장할 수 있도록 게터세터 메서드 시작 
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	
	public String color() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String setSeason() {
		return season;
	}


	public void setSeason(String season) { // 게터세터 메서드 끝
		this.season = season;
	}
	
	
	public void showFruitsInfo() {
		System.out.println("이 과일의 이름은 " + fruitName + "이고 색깔은 " 
							+ color + "이고 제철은" + season + "입니다."); 
		// 과일 정보를 출력해주는 메서드
	}


	
	
	

}
