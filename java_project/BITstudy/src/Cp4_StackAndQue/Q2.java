package Cp4_StackAndQue;

import java.util.Scanner;

public class Q2 {

	static Scanner sc = new Scanner(System.in);

	public class Gstack<E> {

		private int max;
		private int ptr;
		private E[] stk;

		public E dump(int ptr) {
			return stk[ptr];
		}

		public void push(int ptr, E key) {
			this.stk[ptr] = key;
		}

	}

}
