
public class HelloEx_02 {
	
	public static void main(String[] args) {
		
		AddClass addClass;
		addClass = new AddClass();
		addClass.add();
		
		int ret = addClass.add("Korea", "Republic");
		System.out.println(ret);
		
		AddClass addClass2 = new AddClass();
		addClass2.add();
		
		
		int aa = addClass.add("A", "B");
		System.out.println(aa);
	}

}
