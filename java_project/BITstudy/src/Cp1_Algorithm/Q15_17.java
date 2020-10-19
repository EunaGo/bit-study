package Cp1_Algorithm;

public class Q15_17 {
	
	// 왼쪽 아래가 직각인 이등변 삼각형
	static void triangleLB(int n) {
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				
				if(i>=j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		
	}
	
	// 왼쪽 위가 직각인 이등변 삼각형
	static void triangleLU(int n) {
		
		for(int i=n; i>0; i--) {
			for(int j=0; j<i; j++) {
			
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}
	
	// 오른쪽 위가 직각인 이등변 삼각형
	static void triangleRU(int n) {
		
		for(int i=n; i>0; i--) {
			for(int j=n; j>0; j--) {
				
				if(i>=j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		
	}
	
	// 오른쪽 아래가 직각인 이등변 삼각형
	static void triangleRB(int n) {
		
		for(int i=1; i<=n; i++) {
			for(int j=n; j>0; j--) {
				
				if(i>=j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		
	}
	
	// n단의 피라미드 출력
	static void spira(int n) {
		
		int num = (n-1)*2+1;
		int cnt = n;
		
		for(int i=n; i>0; i--) {
			for(int j=1; j<=num; j++) {
				
				if(i>j || cnt < j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
			cnt ++;
		}
	}
	
	static void npira(int n) {
		
		int num = (n-1)*2+1;
		int cnt = n;
		int cnt2 = 1;
		
		for(int i=n; i>0; i--) {
			for(int j=1; j<=num; j++) {
				
				if(i>j || cnt < j) {
					System.out.print(" ");
				}else {
					System.out.print(cnt2);
				}
			}
			System.out.println("");
			cnt ++;
			cnt2 ++;
		}
	}

	public static void main(String[] args) {

		// triangleLB(5);
		// triangleLU(5);
		// triangleRU(5);
		// triangleRB(5);
		// spira(8);
		npira(15);
	}

}
