

public class 연습 {
	 void devide(int num1, int num2) {
	      if (num2 == 0) {
	    	  System.out.println("나누는 수는 0이 될 수 없습니다");
	    	  return;
	      } else {
	    	  int result = num1 / num2;
	    	  System.out.println(num1 + " 나누기 " + num2 + " 는 "  + result + " 입니다.");
	      }
	 }
	
	
	public static void main(String[] args) {
		연습 a = new 연습();
		a.devide(10, 20);
		
	}

}