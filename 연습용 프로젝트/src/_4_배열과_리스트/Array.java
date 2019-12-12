package _4_배열과_리스트;

public class Array {
	
	public static void main(String[] args) {
		
		double[] data = new double[5]; // 자료형[] 배열이름 = new 자료형[배열개수]; or 자료형 배열이름[] = new 자료형[배열개수];
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.3;
		
		for(int i = 0; i <data.length; i++ ) {
			System.out.println(data[i]);
		}
		
		
	}
	
	

}
