package homework;

import java.util.Scanner;

public class Array {
	

	public static int miniValue(int[] arr) {
		
		//arr = new int[5];
		int min=arr[0];
		
		for(int i=0; i<5;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	} // 최소값 반환

	public static int maxValue(int[] arr) {
		
		int max = arr[0];
		
		
		for(int i=0; i<5;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}

		return max;
	} // 최대값 반환

	int[] key() {
		
		int[] arr;

		arr = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}

		return arr;
	}

	public static void main(String[] args) {
		
		Array kb = new Array();
		
		int array [];
		array = kb.key();
		
		System.out.println("min: " + kb.miniValue(array));
		System.out.println("max: " + kb.maxValue(array));

	}

}
