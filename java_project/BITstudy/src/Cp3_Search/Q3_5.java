package Cp3_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Q3_5 {

	public static void method3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수: ");
		int n = sc.nextInt();

		int[] a = new int[n];
		int[] idx = new int[n];
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "]: ");
			a[i] = sc.nextInt();
		}

		System.out.println("검색하실 값을 입력: ");
		int key = sc.nextInt();

		for (int j = 0; j < n; j++) {

			if (a[j] == key) {
				idx[cnt] = j;
				cnt++;
			}

		}
		System.out.println("idx의 개수: " + cnt);

	}

	public static void method4() {

		Scanner sc = new Scanner(System.in);

		System.out.println("요솟수: ");
		int num = sc.nextInt();

		int[] array = new int[num];
		int n = 0;
		int key = 0;

		for (int i = 0; i < num; i++) {

			System.out.println("x[" + i + "]: ");

			n = sc.nextInt();
			array[i] = n;
		}

		Arrays.sort(array);

		System.out.println("검색하실 값을 입력하세요.");
		key = sc.nextInt();

		System.out.print("  | ");

		for (int i = 0; i < num; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("--+------------------------");

		int idx = num / 2;
		int max = num - 1;
		int min = 0;
		int cnt = 0;

		while (true) {

//			System.out.print(" | ");
//			for(int i=0; i<min; i++)
//				System.out.println(" ");
//			System.out.println("<-");
//			for(int i=0; i<; i++)
//				System.out.println(" ");
//			System.out.println("<-");
//			for(int i=0; i<min; i++)
//				System.out.println(" ");
//			System.out.println("<-");

			System.out.print(" " + idx + "| ");

			for (int i = 0; i < num; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println("");

			if (array[idx] > key) {
				max = idx - 1;
				idx = (max - min) / 2;
			} else if (array[idx] < key) {
				min = idx + 1;
				idx = (max + min) / 2;
			} else if (array[idx] == key) {
				break;
			}

		}

		System.out.println(key + "는(은) x[" + idx + "]에 있습니다.");

	}

	public static void method5() {

		Scanner sc = new Scanner(System.in);

		System.out.println("요솟수: ");
		int num = sc.nextInt();

		int[] array = new int[num];
		int n = 0;
		int key = 0;

		for (int i = 0; i < num; i++) {

			System.out.println("x[" + i + "]: ");

			n = sc.nextInt();
			array[i] = n;
		}

		Arrays.sort(array);

		System.out.println("검색하실 값을 입력하세요.");
		key = sc.nextInt();

		System.out.print("  | ");

		for (int i = 0; i < num; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("--+------------------------");

		int idx = num / 2;
		int max = num - 1;
		int min = 0;
		int result = 0;

		while (true) {

			System.out.print(" " + idx + "| ");

			for (int i = 0; i < num; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println("");

			if (array[idx] > key) {
				max = idx - 1;
				idx = (max - min) / 2;
			} else if (array[idx] < key) {
				min = idx + 1;
				idx = (max + min) / 2;
			} else if (array[idx] == key) {
				result = idx;
				for (int i = idx - 1; i >= min; i--) {
					if (array[i] == key) {
						result = i;
					}
				}
				break;
			}

		}
		System.out.println(key+"는(은) x["+result+"]에 있습니다.");
	}

	public static void main(String[] args) {
		// method3();
		//method4();
		method5();
	}
}
