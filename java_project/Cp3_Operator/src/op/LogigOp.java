package op;

public class LogigOp {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		boolean check1 = num1 > num2;
		
		boolean check2 = num1 == num2;
		
		
		if (check1) {
			System.out.println("num1의 값이 num2d의 값보다 큽니다.");
		}
		else {
			System.out.println("num1의 값이 num2의 값보다 작습니다.");
		}
		
		if (check2) {
			System.out.println("num1의 값이 num2d의 값과 같습니다.");
		}
		else {
			System.out.println("num1의 값이 num2의 값과 다릅니다.");
		}
		
		
		System.out.println("------------------------");
		
		int age = 20;
		char gender = 'w';
		boolean mCheck = true;
		
		boolean result = age > 19 && gender == 'w' && mCheck;
		
		if(result) {
			System.out.println("메세지를 보냅니다.");
		}
		
		
		
		
	}

}
