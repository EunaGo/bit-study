package modifier;

/*
 * public : 모두 접근가능
 * default : 같은 패키지 내, 접근가능
 * protected : 같은 패캐지 내, 다른 패키지의 자식클래스 접근가능
 * private : 같은 클래스 내, 접근가능
 */

public class AccessModifier {

	 String var = "같은 클래스 허용";

	 String getVar() { 

		return this.var;
	}

	public static void main(String[] args) {

		AccessModifier s = new AccessModifier();
	
	System.out.println(s.var);
	
	System.out.println(s.getVar());

	}
}

class Second {

	AccessModifier s = new AccessModifier();

	void showData() {
		System.out.println(s.var);

		System.out.println(s.getVar());

	}

}