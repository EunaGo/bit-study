package ex;

import java.util.Scanner;

public class KeyboardScaning {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("���ڸ� �Է����ּ���");
		int num1 = sc.nextInt();

		System.out.println("���ڸ� �Է����ּ���");
		int num2 = sc.nextInt();

		System.out.println("���ڸ� �Է����ּ���");
		int num3 = sc.nextInt();

		int sum = num1 + num2 + num3;
		System.out.printf("�Էµ� ������ %d,%d,%d �Դϴ�. ���ڵ��� ���� %d�Դϴ�.", num1, num2, num3, sum);

	}
}
