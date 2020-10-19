package Cp1_Algorithm2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q6_7 {

	public static void method6() {

		Scanner sc = new Scanner(System.in);

		System.out.println("값 입력: ");
		int num = sc.nextInt();

		System.out.println("진수 입력: ");
		int x = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();

		int mok = 0;
		int na = 0;

		while (num > 0) {
			mok = num / x;
			na = num % x;

			list.add(na);
			num = mok;
			System.out.println("몫 "+mok);
			System.out.println("나머지 "+na);
		}

		for(int i=list.size()-1; i>=0; i--) {
			System.out.print(list.get(i)+" ");
		}
	}


	public static void main(String[] args) {
		method6();
	}

}
