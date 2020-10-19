package Cp1_Algorithm;

public class Q7_9 {

	public static int method(int num) {
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		
		return sum;
	}
	
	public static int method2(int num) {
		
		int sum = 0;
		
		sum = (num * (num+1))/2;
		
		return sum;
	}
	
	public static int method3(int a, int b) {
		
		int max = a;
		int min = b;
		int sum = 0;
		
		if(max < b) {
			max = b;
			min = a;
		}
		
		for(int i = min; i <= max; i++) {
			sum = sum + i;
		}
		
		return sum;
	}

	public static void main(String[] args) {

		//System.out.println("합계 : "+method(7));
		
		//System.out.println("가우스 합계 : "+method2(10));
		
		System.out.println("정수 a와 b사이의 모든 합 : "+method3(1,10));
		
	}
	
}
