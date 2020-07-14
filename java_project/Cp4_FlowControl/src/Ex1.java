
public class Ex1 {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=0; i <=10 ;i++) {
			sum = sum+i;
		}
		
		System.out.println("1부터 10까지의 합: "+sum);
		
		int i=1;
		
		sum = 0;
		
		while(i<11) {
			//System.out.println(i);
			sum = sum + i;
			i++;
		}
		System.out.println("1부터 10까지의 합: "+sum);

	}

}
