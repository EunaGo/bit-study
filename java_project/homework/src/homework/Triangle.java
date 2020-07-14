package homework;
/*
 문제1.
 
밑변과 높이 정보를 지정할 수 있는 Triangle 클래스를 정의하자.

끝으로 밑변과 높이 정보를 변경시킬 수 있는 메서드와 삼각형의 넓이를 

계산해서 반환하는 메서드도 함께 정의하자.
 */

import java.util.jar.Attributes.Name;

public class Triangle {
	
	int bottom;
	int height;
	
	public void change(int b, int h) {
		
		bottom = b;
		height = h;
		
	}
	
	int calc(int b, int h) {
		
		int result = b*h/2;
		
		return result;
	}

	public static void main(String[] args) {
		
		Triangle t = new Triangle();
		
		System.out.println(t.calc(5,2));

	}

}
