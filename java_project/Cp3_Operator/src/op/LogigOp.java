package op;

public class LogigOp {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		boolean check1 = num1 > num2;
		
		boolean check2 = num1 == num2;
		
		
		if (check1) {
			System.out.println("num1�� ���� num2d�� ������ Ů�ϴ�.");
		}
		else {
			System.out.println("num1�� ���� num2�� ������ �۽��ϴ�.");
		}
		
		if (check2) {
			System.out.println("num1�� ���� num2d�� ���� �����ϴ�.");
		}
		else {
			System.out.println("num1�� ���� num2�� ���� �ٸ��ϴ�.");
		}
		
		
		System.out.println("------------------------");
		
		int age = 20;
		char gender = 'w';
		boolean mCheck = true;
		
		boolean result = age > 19 && gender == 'w' && mCheck;
		
		if(result) {
			System.out.println("�޼����� �����ϴ�.");
		}
		
		
		
		
	}

}
