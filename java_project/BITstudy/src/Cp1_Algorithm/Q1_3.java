package Cp1_Algorithm;

public class Q1_3 {

	public static int max4(int a, int b, int c, int d) {

		int max = a;
		
		if(max < b) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		if(max < d) {
			max = d;
		}
		
		return max;
	}

	public static void main(String[] args) {
		System.out.println("max : "+max4(1,2,3,4));
	}
}
