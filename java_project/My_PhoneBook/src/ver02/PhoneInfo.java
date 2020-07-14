package ver02;

public class PhoneInfo {

	String name;
	String phoneNumber;
	String birthday;

	PhoneInfo(String name, String phoneNumber, String birthday) {

		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}

	PhoneInfo(String name, String phoneNumber) {
		this(name, phoneNumber, "입력값이 없습니다.");
	}

	void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNumber);
		System.out.println("생일: " + birthday);
	}

}
