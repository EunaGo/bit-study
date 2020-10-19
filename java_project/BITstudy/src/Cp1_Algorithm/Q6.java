package Cp1_Algorithm;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값: ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i<=n) {
			sum += i;
			i++;
		}
		
		// Q6 답안: while안에서 i는 n과 같을 때까지 실행되는데, 벗어나기전에 i++ 연산이 실행되므로 마지막 i의 값은 n+1입니다.
		System.out.println("while문을 벗어나기 전의 마지막 i값: "+i);
		
		System.out.println("1부터 "+ n +"까지의 합은 "+ sum + "입니다.");
		
	}
}
