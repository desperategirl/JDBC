package _1_exercise;

public class Student_클래스에_main_함수_추가하기_144p {
	
	public static class Student { 
		int studentID;
		String studentName;
		int grade;
		String address;
		
		public String getStudentName() {
			return studentName;
		}
		
		public static void main(String[] args) {
			
			Student studentAhn = new Student(); // student 클래스 생성
			studentAhn.studentName = "안연수"; // 멤버 변수에 값을 대입하는 코드
			
			System.out.println(studentAhn.studentName);
			System.out.println(studentAhn.getStudentName());
			
		}
	}

}
