package Cp1_Algorithm;

import java.util.Arrays;

public class Q4_5 {
	
	public static int method4(int a, int b, int c) {
		
		int [] arrayNum = new int[3];
		
		arrayNum[0] = a;
		arrayNum[1] = b;
		arrayNum[2] = c;
		
		Arrays.sort(arrayNum);
		
		return arrayNum[1];
	}
	
// Q5 답안: 예제와 다르게 Q5에 적힌 풀이는 하나의 조건문이 실행될 때마다 다수의 관계연산자, 논리연산자를 실행시켜야 함

	public static void main(String[] args) {
		
		// System.out.println("세 값의 중앙값: "+method4(-8,15,10));
		
		
	}
}
