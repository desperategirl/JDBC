package _5_과일배열;

public class FruitArray {
	
	
	
	
	public static void main(String[] args) {
		
		Array4_Fruits fruitsInfo[] = new Array4_Fruits[5]; // Array4_Fruits 클래스형으로 객체배열생성
		
		fruitsInfo[0] = new Array4_Fruits("딸기","빨강색","봄");
		fruitsInfo[1] = new Array4_Fruits("수박","빨강색","여름");
		fruitsInfo[2] = new Array4_Fruits("사과","빨강색","가을");
		fruitsInfo[3] = new Array4_Fruits("배","노란색","가을");
		fruitsInfo[4] = new Array4_Fruits("자두","빨강색","여름");
		
		for(int i = 0; i< fruitsInfo.length; i++) {
			// 과일 정보를 보여주고 싶으면, 배열이름[배열번호]에 점연산자를 붙이고
			// 아까 만들어둔 과일 정보를 보여주는 메서드를 사용하면 출력이 된다.
			fruitsInfo[i].showFruitsInfo(); 
			
		}
		
		for(int i = 0; i<fruitsInfo.length; i++) {
			// 이 코드는 각 배열 요소가 가지고 있는 인스턴스 주소 값이다.
			System.out.println(fruitsInfo[i]);  
		}
		
	}

}
