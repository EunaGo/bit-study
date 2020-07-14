package ex;

/*
 * new: 일반적인 객체 생성법
 * .getinstance(): 싱글톤패턴을 적용한 객체 생성법 ()객체 얻어오기
 */

public class TestMain {

	public static void main(String[] args) {
		
		
		Singleton s = Singleton.getInstance();
		s.print();
		

		Member member = new Member();
		
		System.out.println(member.getName());

	}

}