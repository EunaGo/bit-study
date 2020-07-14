
public class WhileBreak {

	public static void main(String[] args) {

		int i = 0;
		int sum = 0;

		while (true) {

			if (i > 5) {
				break;
			}
			System.out.println(0);
			
			i++;
			sum+=i;
		}
		System.out.println("마지막 값: "+ i);
		System.out.println("합이 100이 넘어간 값: " + sum);
	}

}
