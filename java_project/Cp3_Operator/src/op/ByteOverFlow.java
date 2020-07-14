package op;

public class ByteOverFlow {

	public static void main(String[] args) {
		
		byte b = 0;
		int i = 0;
		
		for (int x=0;x<270;x++) {
			System.out.println(b++);
			System.out.println("\t");
			System.out.println(i++);
		}
	}

}
