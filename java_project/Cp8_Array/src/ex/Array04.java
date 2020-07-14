package ex;

public class Array04 {

	public static void main(String[] args) {

		int[] ball = new int[45];

		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}

		int temp = 0;

		for (int i = 0; i < 10000; i++) {

			int j = (int) (Math.random() * 44) + 1;

			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(ball[i]);
		}
	}

}
