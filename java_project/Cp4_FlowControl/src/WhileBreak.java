
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
		System.out.println("������ ��: "+ i);
		System.out.println("���� 100�� �Ѿ ��: " + sum);
	}

}
