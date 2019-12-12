package com.biz.hello;

public class HelloEx_06 {
	
	public static void main(String[] args) {
		// int a = add();
		int b = add(30,40);
        String c = add("Republic","Korea");
		
		int d;
		d = add(50,60);
		
		System.out.println(b+ " " + c+ " " + d);
		
		
	}
	
	public static void add() {
	}
	
	public static int add(int n1, int n2) {
		return 50 + 40;
	}

	public static String add(String s1, String s2) {
		return s1 + s2;
	}


}
