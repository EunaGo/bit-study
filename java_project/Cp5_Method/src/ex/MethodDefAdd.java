package ex;

public class MethodDefAdd {

	public static void main(String[] args) {
		
		System.out.println("���α׷� ����");
		
		hiEveryone(7,140);
		hiEveryone(20,163);
		hiEveryone(17,170);
		hiEveryone(25, 158);
		
		
		System.out.println("���α׷� ����");
		byEveryone();
	}

	
	static void hiEveryone(int age, double height) {
		if(age<10)
			return;
		System.out.println("�� ���̴�"+age+"�� �Դϴ�.");
		System.out.println("���� Ű�� "+height+"cm �Դϴ�.");
		
	}
	
	static void byEveryone() {
		System.out.println("bye bye");
	}
	
	
}
