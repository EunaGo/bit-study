
public class CondOp {

	public static void main(String[] args) {
		
		int num1 = 100, num2 = 50;
	
		int bigNum, diffNum;
		
		bigNum = (num1>num2)?num1:num2;
		
		diffNum = (num1>num2)?num1-num2:num2-num1;
		
		System.out.println("ū��: "+bigNum);
		System.out.println("�� ���� ����: "+ diffNum);
		

	}

}
