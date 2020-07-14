package friend;

/* 
 친구의 정보를 저장하기 위한 클래스 
 상속을 목적으로 기본 클래스 정의
 기본 속성과 기능을 구성
 
 대딩 : 이름, 전번, 주소, 이메일, 전공, 학년
 고딩 : 이름, 전번, 주소, 직장
 */

public abstract class Friend implements Info {

	String name; // 친구의 이름
	String phoneNum; // 친구의 전화번호
	String addr; // 친구의 주소
	
	// 생성자
	Friend(String name, String phoneNum, String addr){
		this.name = name;
		this.phoneNum = name;
		this.addr = addr;
	}
	
	void showBasicInfo() {
		System.out.println("이름 : "+this.name);
		System.out.println("전화번호 : "+this.phoneNum);
		System.out.println("주소 : "+this.addr);
	}
	
	// 상속의 목적으로 오버라이딩할 메서드
	//void showData() {}			// 기본데이터와 하위 클래스의 데이터를 출력 >> 오버라이딩
	
	// 추상메서드
//	abstract void showData();
	
}
