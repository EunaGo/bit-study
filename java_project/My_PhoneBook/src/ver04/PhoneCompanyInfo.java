package ver04;

public class PhoneCompanyInfo extends PhoneInfo {

	String addr;
	String email;

	PhoneCompanyInfo(String name, String phoneNumber, String birthday, String addr, String email) {
		super(name, phoneNumber, birthday);
		this.addr = addr;
		this.email = email;
	}

	@Override
	void showInfo() {
		System.out.println("주소: " + addr);
		System.out.println("이메일: " + email);
	}

}
