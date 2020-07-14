package ex;

public class MethodDefAdd {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		hiEveryone(7,140);
		hiEveryone(20,163);
		hiEveryone(17,170);
		hiEveryone(25, 158);
		
		
		System.out.println("프로그램 종료");
		byEveryone();
	}

	
	static void hiEveryone(int age, double height) {
		if(age<10)
			return;
		System.out.println("제 나이는"+age+"세 입니다.");
		System.out.println("저의 키는 "+height+"cm 입니다.");
		
	}
	
	static void byEveryone() {
		System.out.println("bye bye");
	}
	
	
}
