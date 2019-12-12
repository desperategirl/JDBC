package com.biz.hello;

public class HelloEx_04 {
	
	public static void main(String[] args) {
		
		add(); // 똑같은 add지만 괄호안에 아무 것도 없는 메서드인 첫번째 add()를 호출함
		add(30,40); // 똑같은 add지만 괄호안에 변수가 선언되어 있는 method를 찾아 호출한다.
		add(40,50);
		add(50,60);
		add(60,70);
		잡채만들기(100);
		/*
		 * add(int n1 =30, int n2 = 40)
		 * sum n1 + n2
		 * sysout(sum)
		 */
		
	}
	

	public static void 잡채만들기(int 몇명) {
		System.out.println("잡채" + 몇명 + "인분 만들기");
	}

	
	
	public static void add() {
		
		int num1 = 40;
		int num2 = 50;
		int sum = num1 + num2;
		System.out.println(sum);
		
	}
	
	public static void add(int n1, int n2) { // method의 괄호 안에 들어있는 변수는 매개변수라는 것.
		
		int sum = n1+n2;
		System.out.println(sum);
		
	}
	
}
