package _4_배열과_리스트;

public class Array_문자저장배열 {
	/*
	 * 문자 자료형 배열을 만들고
	 * 알파벳 대문자를 A부터 Z까지 저장한 후 각 요소 값을
	 * 알파벳 문자와 정수 값(아스키 코드값)으로 출력하는 class
	 */
	public static void main(String[] args) {
		
		char[] alphabets = new char[26]; // 자료형char[] 배열이름 =  new예약어 자료형[배열개수]
		char ch = 'A'; // 문자형 변수 ch를 하나 만들고 ch안에 A라는 값을 할당시킴.
		
		for(int i = 0; i < alphabets.length; i++, ch++) { // i가 1씩 증가하는데 alphabets 배열의 길이-1까지 증가하고, ch도 1씩 증가함. 
			alphabets[i] = ch;  // alphabets배열의 0부터 시작해서 26-1까지의 배열 자리에 1씩 증가하는 ch의 값을 넣음.
			
		}
		
		for(int i = 0; i < alphabets.length; i++) { // 알파벳 배열의 길이-1까지 증가하는 i
			System.out.println(alphabets[i] + "," + (int)alphabets[i]);
			// alphabets 배열에서 alphabet[0] = ch이 0일때의 값 = A, 
			// alphabets 배열에서 alphabet[1] = ch이 1일때의 값 = B..
			// 이 순서대로 출력이 되고 A, B..의 아스키 코드값이 (int)alphabets[i]로 출력됨.
			// 형 변환 연산자(int)는 배열에 저장된 char형 문자를 int형 정수로 변환시킨다.
			
		}
		
		
		
		
		
		
		
	}

}
