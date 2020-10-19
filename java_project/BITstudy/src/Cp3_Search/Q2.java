package Cp3_Search;

import java.util.Scanner;

public class Q2 {
	
	public static void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요솟수: ");
		int num = sc.nextInt();
		
		int[] array = new int[num+1];
		int n = 0;
		int src = 0;
		
		for(int i=0; i<num; i++) {
			
			System.out.println("x["+i+"]: ");
			
			n = sc.nextInt();
			array[i] = n;
		}
		
		System.out.println("검색하실 값을 입력하세요.");
		src = sc.nextInt();
		
		System.out.print("  | ");
		
		for(int i=0; i<num; i++) {
			System.out.print(i+" ");
		}
		System.out.println("");
		System.out.println("--+------------------------");
		
		for(int i=0; i<num; i++) {
			
			System.out.print("  | ");
			
			for(int k=0; k<i; k++){
				System.out.print("  ");
			}
			
			System.out.print("*\n");
			System.out.print(" "+i+"| ");
			
			for(int j=0; j<num; j++) {
				System.out.print(array[j]+" ");
			}
			
			System.out.println("");
			
			if(src == array[i]) {
				System.out.println(src+"는(은) x["+i+"]에 있습니다.");
				break;
			}
			
			System.out.println("  |");
		}
		
	}

	public static void main(String[] args) {

		method2();
	}

}
