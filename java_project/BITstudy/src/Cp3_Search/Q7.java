package Cp3_Search;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q7 {
	
	public static void method7() {
		
		Scanner sc = new Scanner(System.in);
		
		Double[] arr = {1.2, 2.0, 0.5, 0.45, -0.5, 0.8, -2.5};

		Arrays.sort(arr, Collections.reverseOrder());

		System.out.println("내림차순 시력 데이터 : " + Arrays.toString(arr));
		
		System.out.println("특정 시력을 입력: ");
		double num = sc.nextDouble();
		
		System.out.print("해당되는 시력을 가진 인덱스: ");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				System.out.print("arr["+i+"] ");
			}
		}
		
	}

	public static void main(String[] args) {

		method7();
	}

}
