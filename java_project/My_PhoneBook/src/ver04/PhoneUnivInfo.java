package ver04;

public class PhoneUnivInfo extends PhoneInfo{

	String major;
	String grade;
	
	PhoneUnivInfo(String name, String phoneNumber, String birthday, String major, String grade) {
		super(name, phoneNumber, birthday);
		this.major=major;
		this.grade=grade;
	}

	@Override
	void showInfo() {
		System.out.println("전공: "+major);
		System.out.println("학년: "+grade);
	}
	
	

}
