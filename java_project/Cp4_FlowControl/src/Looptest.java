
public class Looptest {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		for(int i = 0; i < 6;i++) {
			System.out.println(i);
		}
		
		System.out.println("------------------");
		
		int j = 0;
		int k = 1;
		
		while( j < 6) {
			System.out.println(j);
			j++;
		}
		
		System.out.println("-------------------");

		do {
			System.out.println(k);
			k++;
		}
		while(k<6);
		
	}

}
