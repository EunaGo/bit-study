package ver05;

// 상속을 위한 기본 클래스 구성
// 인스턴스 생성의 목적이 없음
public class PhoneInfo implements Info {

	String name; // 친구의 이름
	String PhoneNumber; // 친구의 전화번호
	String addr; // 친구의 주소
	String email; // 친구의 이메일

	// 인스턴스 변수 초기화
	PhoneInfo(String name, String PhoneNumber, String addr, String email) {
		this.name = name;
		this.PhoneNumber = PhoneNumber;
		this.addr = addr;
		this.email = email;
	}

	// 기본 정보출력 메서드
	void showBasicInfo() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + PhoneNumber);
		System.out.println("주소: " + addr);
		System.out.println("이메일: " + email);
	}

	// 전체정보 출력
	public void showAllInfo() {
		showBasicInfo();
		// 상속 후 오버라이딩을 통해 재 구성

	}
}
