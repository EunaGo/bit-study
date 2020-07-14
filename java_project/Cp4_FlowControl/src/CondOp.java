
public class CondOp {

	public static void main(String[] args) {
		
		int num1 = 100, num2 = 50;
	
		int bigNum, diffNum;
		
		bigNum = (num1>num2)?num1:num2;
		
		diffNum = (num1>num2)?num1-num2:num2-num1;
		
		System.out.println("큰수: "+bigNum);
		System.out.println("두 수의 차이: "+ diffNum);
		

	}

}
