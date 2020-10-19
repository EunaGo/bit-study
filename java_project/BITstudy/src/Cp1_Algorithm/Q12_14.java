package Cp1_Algorithm;

import java.util.Scanner;

public class Q12_14 {
	
	public static void method12() {
		
		System.out.println("   | 1  2  3  4  5  6  7  8  9");
		System.out.println("---+---------------------------");
		
		int result = 0;
		
		for(int i=1; i<10; i++) {
			System.out.print(" "+i+"| ");
			for(int j=1; j<10; j++) {
				
				result = i*j;
				
				if(result<10) {
					System.out.print(" ");
				}
				
				System.out.print(result+" ");
			}
			System.out.println("");
		}
		
	}
	
	public static void method13() {
		
		System.out.println("   | 1  2  3  4  5  6  7  8  9");
		System.out.println("---+---------------------------");
		
		int result = 0;
		
		for(int i=1; i<10; i++) {
			System.out.print(" "+i+"| ");
			for(int j=1; j<10; j++) {
				
				result = i+j;
				
				if(result<10) {
					System.out.print(" ");
				}
				
				System.out.print(result+" ");
			}
			System.out.println("");
		}
	}
	
	public static void method14() {
		
		System.out.println("사각형을 출력합니다.");
		System.out.println("단 수: ");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {

		// method12();
		// method13();
		method14();
	}

}
