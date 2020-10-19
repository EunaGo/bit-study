package Cp1_Algorithm;

public class Q10_11 {

	public static int method(int a, int b) {
		
		int result = 0;
		
		result = b - a;
		
		return result;
	}
	
	public static int method2(int a) {
		
		int result = 0;
		
		while(a>0) {
			a = a/10;
			result ++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		// System.out.println("b - a = "+method(1,2));
		
		System.out.println("자릿수 : "+method2(1000000000));
		
	}
}
