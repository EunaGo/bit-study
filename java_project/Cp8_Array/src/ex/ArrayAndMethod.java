package ex;

public class ArrayAndMethod {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		int[] ref;

		ref = addAllArray(arr, 10);

		System.out.println("동일 배열 참조 여부 확인: " + (arr == ref));

		for (int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] addAllArray(int[] ar, int addVal) {

		for (int i = 0; i < ar.length; i++) {
			ar[i] = ar[i] + addVal;

		}

		return ar;
	}
}
