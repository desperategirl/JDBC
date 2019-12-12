package _4_배열과_리스트;

public class Array_1 {
	
	public static void main(String[] args) {
		
		int[] catAge = new int[5];
		int size = 0; // 유효한 값이 저장된 배열 요소 개수를 저장할 변수 선언
		
		catAge[0] = 3; size++;
		catAge[1] = 5; size++;
		catAge[2] = 2; size++;   // 값을 저장한 후 size 변수 증가
		
		for(int i = 0; i < size; i++) {
			System.out.println(catAge[i]); // 유효한 값이 저장된 배열 요소 개수만큼 반복문 실행
		}
		
		
		
		
	}
	

}
