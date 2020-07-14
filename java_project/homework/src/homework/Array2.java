package homework;

public class Array2 {

	public static void addOneDArr(int[] arr, int add) {

		for (int i = 0; i < arr.length; i++)
			arr[i] += add;
	}

	public static void addOneDArr(int[][] arr, int add) {
		
		arr = new int[3][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] += add;
			}
		}

	}

	public static void main(String[] args) {

		int arr2[][];
		arr2 = new int[3][5];

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = i + j;
			}
		}

		addOneDArr(arr2, 1);

		for (int i = 0; i < arr2.length; i++) {

			for (int j = 0; j < arr2[i].length; j++) {

				System.out.print(arr2[i][j] + "\t");

			}

			System.out.println();

		}

	}
}
