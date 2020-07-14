package ver03;

import java.util.Scanner;

public class PhoneBookManager {

	PhoneInfo[] pBooks;

	int cnt;

	Scanner sc;
	
	PhoneBookManager(){
		pBooks = new PhoneInfo[100];
		
		cnt=0;
		
		sc = new Scanner(System.in);
	}

	PhoneInfo createInstance() {

		PhoneInfo info = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요 >> ");
		String name = sc.nextLine();

		System.out.println("전화번호를 입력하세요 >> ");
		String phoneNumber = sc.nextLine();

		System.out.println("생일을 입력하세요>> ");
		String birthday = sc.nextLine();

		if (birthday == null || birthday.trim().isEmpty()) {
			info = new PhoneInfo(name, phoneNumber);
		} else {
			info = new PhoneInfo(name, phoneNumber, birthday);
		}

		return info;
	}

	void addInfo(PhoneInfo info) {

		pBooks[cnt] = info;

		cnt++;
	}

	void addInfo() {

		pBooks[cnt] = createInstance();

		cnt++;
	}
	
	void showAllData() {
		for(int i=0;i<cnt;i++) {
			pBooks[i].showInfo();
			System.out.println("-------------------------");
		}
	}

	int searchIndex(String name) {

		int searchIndex = -1;

		for (int i = 0; i < cnt; i++) {
			if (pBooks[i].checkName(name)) {
				searchIndex = i;
				break;
			}
		}
		return searchIndex;
	}

	void searchInfo() {

		System.out.println("검색하실 이름을 입력하세요 >> ");
		String name = sc.nextLine();

		int searchIndex = searchIndex(name);

		if (searchIndex < 0) {
			System.out.println("찾으시는 이릅이 없습니다.");
		} else {
			pBooks[searchIndex].showInfo();
		}
	}

	void deleteInfo() {

		System.out.println("삭제하고자하는 이름을 입력하세요 >> ");
		String name = sc.nextLine();

		int searchIndex = searchIndex(name);

		if (searchIndex < 0) {
			System.out.println("찾으시는 이름이 없습니다.");
		} else {
			for (int i = searchIndex; i < cnt - 1; i++) {
				pBooks[i]=pBooks[i+1];
			}
			cnt--;
			System.out.println("요청하신 이름의 정보를 삭제했습니다.");
		}

	}
}
