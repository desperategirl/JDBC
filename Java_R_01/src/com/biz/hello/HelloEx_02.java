package com.biz.hello;

public class HelloEx_02 {

	/*
	 * main() method
	 * eclipse 도구에서 Run(Ctrl + F11)을 눌러서
	 * 어떤 명령문들의 실행을 시켜볼 수 있도록 만든 기본 method 
	 */
	public static void main(String[] args) {
		
		// view() 라는 명령문은 자바에 없는 명령문이다.
		
		// 이 클래스에 내가 만든 view() 명령을 5번 실행하라      =
		// 이 클래스에 내가 만든 view() method를 5번 호출하라(불러와라)
		view();
		view();
		view();
		view();
		view();
		
	}

	public static void view() {
		
		System.out.println("우리나라만세");
		System.out.println("대한민국만세");
		System.out.println("republic of korea");
		
		
	}
}
