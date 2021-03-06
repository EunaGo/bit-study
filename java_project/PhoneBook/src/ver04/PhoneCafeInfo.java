package ver04;

public class PhoneCafeInfo extends PhoneInfo {

	String cafeName;
	String nickName;

	PhoneCafeInfo(String name, String phoneNumber, String addr, String email, String cafeName, String nickName) {
		super(name, phoneNumber, addr, email);
		this.cafeName = cafeName;
		this.nickName = nickName;
	}

	@Override
	void showAllInfo() {
		super.showAllInfo();
		System.out.println("카페 이름: " + cafeName);
		System.out.println("닉네임: " + nickName);
	}

}
