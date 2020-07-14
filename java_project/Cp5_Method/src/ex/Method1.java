package ex;

public class Method1 {

	public static void main(String[] args) {
		
		MyMath math = new MyMath();
		
		long result = math.add(10, 100);
		
		System.out.println(result);
		System.out.println(math.add(1000000000L, 5000000000L));

	}

	int add() {
		// void는 반환하지 않음

		return 10;
	}

}
