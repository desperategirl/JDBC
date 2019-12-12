package _3_object_cooperation;

public class Cooperation_Test {
	
	public static void main(String[] args) {
		
		Student student1 = new Student("1", 5000);
		Student student2 = new Student("2", 15000);
		
		Bus bus37 = new Bus(37);
		student1.takeBus(bus37);
		student1.showInfo();
		bus37.showInfo();
		
		System.out.println();
		
		Subway subway1 = new Subway("1호선");
		student2.takeSubway(subway1);
		student2.showInfo();
		subway1.showInfo();
		
		
	}

}
