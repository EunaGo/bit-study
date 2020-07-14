package ver02;

public class PhoneInfor {

	private String name;
	private String phoneNumber;
	private String birthday;

//초기화를 위한 생성자
	PhoneInfor(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}

	PhoneInfor(String name, String phoneNumber) {
		this(name, phoneNumber, "입력값이 없습니다");

	}

	void showInfo() {
		System.out.println("이름: " + this.name);
		System.out.println("전화번호: " + this.phoneNumber);
		System.out.println("생일: " + this.birthday);

	}
}


