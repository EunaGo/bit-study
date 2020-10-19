package Cp4_StackAndQue;

import java.util.Scanner;

public class Q1 {

	static Scanner sc = new Scanner(System.in);

	static int[] IntStack;
	static int pointer = -1;

	// push
	public static void push(int stackSize) {

		if (pointer >= stackSize - 1) {
			System.out.println("스택이 가득차서 push할 수 없습니다.");
		} else {
			System.out.println("push 값 입력:");
			int pushNum = sc.nextInt();

			pointer++;
			IntStack[pointer] = pushNum;
		}

	}

	// pop
	public static void pop() {

		if (pointer < 0) {
			System.out.println("스택이 비어서 pop할 수 없습니다.");
		} else {
			pointer--;
		}
		
	}

	// peek
	public static int peek(int stackSize) {

		int top = 0;

		if (pointer == -1) {
			top = -1;
		} else {
			top = IntStack[pointer];
		}

		return top;
	}

	// dump
	public static void dump() {

		System.out.print(" |");

		for (int i = 0; i <= pointer; i++) {
			System.out.print(i + " ");
		}

		System.out.println("");
		System.out.print(" |");

		for (int i = 0; i <= pointer; i++) {
			System.out.print(IntStack[i] + " ");
		}
		System.out.println("");
	}

	// indexOf
	public static void indexOf() {

		System.out.println("검색할 값을 입력: ");
		int key = sc.nextInt();
		int[] keyResult = new int[pointer + 1];
		int cnt = 0;

		if (pointer == -1) {
			System.out.println("검색하실 값이 없습니다.");
		} else {
			for (int i = 0; i <= pointer; i++) {
				if (key == IntStack[i]) {
					keyResult[cnt] = i;
					cnt++;
				}
			}
		}

		if (cnt > 0) {
			System.out.print("검색하신 값은 ");
			for (int i = 0; i < cnt; i++) {
				System.out.print("IntStack[" + keyResult[i] + "] ");
			}
			System.out.println("에 있습니다.");
		} else {
			System.out.println("검색한 값이 없습니다.");
		}
		
	}

	public static void main(String[] args) {

		System.out.print("Stack의 크기를 입력: ");
		int stackSize = sc.nextInt();

		IntStack = new int[stackSize];

		int peekResult = 0;

		while (true) {

			System.out.println(">> 메뉴 선택");
			System.out.println("(1)push  (2)pop  (3)peek  (4)dump (5)indexOf");
			System.out.println("(6)capacity  (7)size  (8)isEmpty  (9)isFull  (0)clear");

			int selectMenu = sc.nextInt();

			switch (selectMenu) {

			case 1: // push
				push(stackSize);
				break;

			case 2: // pop
				pop();
				break;

			case 3: // peek : 스택이 비어있지 않다면, 꼭대기 요소를 반환
				peekResult = peek(stackSize);
				if (peekResult == -1) {
					System.out.println("Stack이 비어있음");
				} else {
					System.out.println("Stack의 peek: " + peekResult);
				}
				break;

			case 4: // dump: 스택의 모든 데이터 출력
				dump();
				break;

			case 5: // indexOf: 검색
				indexOf();
				break;

			case 6: // capacity: 스택의 용량
				System.out.println("스택의 용량: " + IntStack.length);
				break;

			case 7: // size: 스택에 쌓인 데이터 수
				System.out.println("스택에 쌓인 데이터 수: " + (pointer + 1));
				break;

			case 8: // isEmpty: 스택이 비어있는지 확인
				if (pointer == -1) {
					System.out.println("스택이 비었습니다.");
				} else {
					System.out.println("스택이 비어있지 않습니다.");
				}
				break;

			case 9: // isFull: 스택이 가득찼는지 확인
				if (pointer == stackSize - 1) {
					System.out.println("스택이 가득 찼습니다.");
				} else {
					System.out.println("스택이 가득 차있지 않습니다.");
				}
				break;

			case 0: // clear: 스택의 모든 데이터 삭제
				pointer = -1;
				System.out.println("Stack의 모든 데이터를 삭제");
				break;

			default:
				System.out.println("잘못된 입력 !!");
				break;
			}
		}

	}

}
