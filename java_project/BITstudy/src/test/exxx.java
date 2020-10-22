package test;

public class exxx {

	public static int solution(int num) {

		int answer = 0;
		long a=num;
		while (answer <= 500) {
			
			if (a % 2 == 0) {
				a = a / 2;
			} else {
				a = a * 3 + 1;
			}
			
			answer++;
			
			if (answer == 500 && a != 1) {
				answer = -1;
				break;
			} else if (a == 1) {
				break;
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		System.out.println(solution(626331));

	}

}
