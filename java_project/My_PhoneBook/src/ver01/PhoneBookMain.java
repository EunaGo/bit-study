package ver01;

public class PhoneBookMain {
	
	public static void main(String[] args) {
		
		PhoneInfo info = new PhoneInfo("goeuna","010-0000-0000","2000.04.15");
		
		info.showInfo();
		
		System.out.println("----------------------------");
		
		info = new PhoneInfo("kimeuna","010-9999-9999");
		info.showInfo();

	}

}
