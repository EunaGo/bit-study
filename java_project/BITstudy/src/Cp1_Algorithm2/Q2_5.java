package Cp1_Algorithm2;

import java.util.Scanner;

public class Q2_5 {
	
	public static void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		String[] arrayNum = num.split(" ");
		
		String box = null;
		
		int arrayLength = arrayNum.length;
		
		for(int i=0; i<arrayLength/2; i++) {
			
			System.out.println("a["+i+"]과(와) a["+(arrayLength-i-1)+"]를 교환합니다.");
			
			box = arrayNum[i];
			
			arrayNum[i] = arrayNum[arrayLength-i-1];
			
			arrayNum[arrayLength-i-1] = box;
			
			for(int j=0; j<arrayLength; j++) {
				System.out.print(arrayNum[j]+" ");
			}
			System.out.println("");
			
		}
		System.out.println("역순 정렬을 마쳤습니다.");
	}
	
	public static void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		String[] a = num.split(" ");
		
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum += Integer.parseInt(a[i]);
		}
		
		System.out.println("배열 a의 합계: "+sum);
	}
	
	public static void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		String[] b = num.split(" ");
		
		String[] a = new String[b.length];
		
		System.out.print("배열 a: ");
		
		for(int i=0; i<b.length; i++) {
			a[i] = b[i];
			System.out.print(a[i]+" ");
		}
		
	}
	
	public static void method5() {
		
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		String[] b = num.split(" ");
		
		String[] a = new String[b.length];
		
		System.out.print("배열 a: ");
		
		for(int i=0; i<b.length; i++) {
			a[i] = b[b.length-i-1];
			System.out.print(a[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		
		//method2();
		//method3();
		//method4();
		method5();
	}

}
