package ver05_exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import ver05_exception.exception.BadNumberException;

// PhoneInfo 타입의 배열로 친구들의 정보를 "저장, 수정, 삭제, 검색, 출력"
public class PhoneBookManager {

	//// 1. 배열 선언
	PhoneInfo[] books;

	// 배열에 저장된 요소의 개수
	int numOfInfo;
	Scanner kb;

	// 생성자를 통해서 배열 생성, 요소의 개수 초기화
	PhoneBookManager(int num) {
		// 배열의 생성
		books = new PhoneInfo[num];
		// 요소 개수의 초기화
		numOfInfo = 0;
		kb = new Scanner(System.in);
	}

	// 싱글톤 패턴
	private static PhoneBookManager manager = new PhoneBookManager(100);

	public static PhoneBookManager getInstance() {
		return manager;
	}
	//

	//// 2. 배열에 정보 저장
	// 배열에 추가
	void addInfo(PhoneInfo info) {
		// 배열에 numOfInfo 숫자 >> index 참조값 저장
		books[numOfInfo] = info;
		numOfInfo++;
	}

	// 사용자로부터 받은 데이터로 인스턴스 생성
	void creatInfo() {

		System.out.println("1.일반  2.대학  3.회사  4.동호회");
		System.out.println("입력하고자 하는 번호를 입력해주세요.");

		// int select = kb.nextInt();
		// kb.nextLine();
		// 사용자 선택번호
		// int select = Integer.parseInt(kb.nextLine());

		/*
		 * if (!(select > 0 && select < 5)) {
		 * System.out.println("정상적인 메뉴 선택이 아닙니다.\n메뉴를 다시 선택해주세요."); return; }
		 */

		int select = 0;

		while (true) {
			try { // 정상범위 1~3
				select = kb.nextInt();

				if (select > 0 && select < 4) {
					BadNumberException e = new BadNumberException("잘못된 메뉴 번호 입력");

					throw e;
				}

			} catch (InputMismatchException e) {
				System.out.println("잘못된 메뉴 입력입니다. \n 확인하시고 다시 입력해주세요.");
				continue;
			} catch (BadNumberException e) {
				System.out.println("메뉴 범위에 벗어난 숫자 입력입니다. \n다시 확인 후 입력해주세요.");
				continue;
			} catch (Exception e) {
				System.out.println("잘못된 메뉴 입력입니다. \n 확인하시고 다시 입력해주세요.");
				continue;
			} finally {
				manager.kb.nextLine();
			}
			break;
		}

		// 기본 클래스로 인스턴스 생성
		PhoneInfo info = null;
		String name = null, PhoneNumber = null, addr = null, email = null;

		while (true) {

			// 기본 정보 수집 : 이름, 전화번호, 주소, 이메일
			System.out.println("이름을 입력해주세요.");
			name = kb.nextLine();

			System.out.println("전화번호를 입력해주세요.");
			PhoneNumber = kb.nextLine();

			System.out.println("주소를 입력해주세요.");
			addr = kb.nextLine();

			System.out.println("이메일을 입력해주세요.");
			email = kb.nextLine();

			try {

				if (name.trim().isEmpty() || PhoneNumber.trim().isEmpty() || addr.trim().isEmpty()
						|| email.trim().isEmpty()) {

					StringEmptyException e = new StringEmptyException();
					throw e;
				}
			} catch (StringEmptyException e) {
				System.out.println("기본정보는 공백없이 모두 입력해주셔야 합니다.");
				System.out.println("다시 입력해주세요\n");
				continue;
			}
			break;
		}
		switch (select) {
//		case 1:
//			// 기본 클래스로 인스턴스 생성
//			info = new PhoneInfo(name, PhoneNumber, addr, email);
//			break;

		case MenuInterFace.UNIV:
			System.out.println("전공(학과)를 입력해주세요.");
			String major = kb.nextLine();
			System.out.println("학년을 입력해주세요.");
			String grade = kb.nextLine();

			// 대학 클래스로 인스턴스 생성
			info = new PhoneUnivInfo(name, PhoneNumber, addr, email, major, grade);
			break;

		case MenuInterFace.COMPANY:
			System.out.println("회사이름을 입력해주세요.");
			String company = kb.nextLine();
			System.out.println("부서를 입력해주세요.");
			String dept = kb.nextLine();
			System.out.println("직급을 입력해주세요.");
			String job = kb.nextLine();

			// 회사 클래스로 인스턴스 생성
			info = new PhoneCompanyInfo(name, PhoneNumber, addr, email, company, dept, job);
			break;

		case MenuInterFace.CAFE:
			System.out.println("카페이름을 입력해주세요.");
			String cafeName = kb.nextLine();
			System.out.println("닉네임을 입력해주세요.");
			String nickName = kb.nextLine();

			// 카페 클래스로 인스턴스 생성
			info = new PhoneUnivInfo(name, PhoneNumber, addr, email, cafeName, nickName);
			break;
		}

		// 생성된 인스턴스를 배열에 저장
		addInfo(info);
	}

	//// 3. 배열의 데이터 출력
	void showAllInfo() {

		// for 반복문 : 반복의 횟수 지정이 가능 numOfInfo
		// for each 반복 : x
		System.out.println("===전체 정보를 출력합니다.===");
		for (int i = 0; i < numOfInfo; i++) {
			books[i].showAllInfo();
			System.out.println("=====================");
		}
	}

	// 배열의 index(정수형 데이터) 검색 : name 기준
	int searchIndex(String name) {

		// 정상적인 index값은 0이상의 값, 찾지 못했을 때 구분 값(-1)
		int searchIndex = -1;

		// 배열의 반복으로 name값을 비교해서 index값을 찾음
		for (int i = 0; i < numOfInfo; i++) {
			if (books[i].name.equals(name)) {
				searchIndex = i;
				break;
			}
		}
		return searchIndex;
	}

	//// 4. 배열의 정보 검색 : 이름기준
	void showInfo() {

		System.out.println("검색하실 이름을 입력해주세요.");
		String name = kb.nextLine();

		int index = searchIndex(name);

		if (index < 0) {
			System.out.println("검색하신 이름의 정보가 없습니다.");
		} else {
			System.out.println("-------------------------------");
			books[index].showBasicInfo();
			System.out.println("-------------------------------");
		}
	}

	//// 5. 배열의 정보를 삭제 : 이름기준
	void deleteInfo() {

		System.out.println("삭제하실 이름을 입력해주세요.");
		String name = kb.nextLine();

		int index = searchIndex(name);

		if (index < 0) {
			System.out.println("삭제하고자 하는 이름의 정보가 없습니다.");
		} else {
														
			// 삭제 위치에서 왼쪽으로 시프트
			for (int i = index; i < numOfInfo - 1; i++) {
				books[i] = books[i + 1];
			}
			// 삭제가 되었으므로 요소의 개수 -1
			numOfInfo--;
		}
	}

	//// 6. 배열의 정보를 수정 : 이름기준
	void editInfo() {

		System.out.println("수정하실 이름을 입력해주세요.");
		String name = kb.nextLine();

		int index = searchIndex(name);

		if (index < 0) {
			System.out.println("수정하고자 하는 이름의 정보가 없습니다.");
			return;
		} else {

			String editname = books[index].name;

			System.out.println("수정 데이터 입력을 시작합니다.");
			System.out.println("이름은 " + editname + "입니다.");
			System.out.println("전화번호 입력해주세요.");
			String PhoneNumber = kb.nextLine();
			System.out.println("주소를 입력해주세요.");
			String addr = kb.nextLine();
			System.out.println("이메일을 입력해주세요.");
			String email = kb.nextLine();

			PhoneInfo info = null;

			// 저장된 인스턴스가 : 기본, 대학, 회사, 카페 >> 구별

			if (books[index] instanceof PhoneUnivInfo) {

				System.out.println("전공을 입력해주세요.");
				String major = kb.nextLine();
				System.out.println("학년을 입력해주세요.");
				String grade = kb.nextLine();

				info = new PhoneUnivInfo(editname, PhoneNumber, addr, email, major, grade);

			} else if (books[index] instanceof PhoneCompanyInfo) {

				System.out.println("회사 이름을 입력해주세요.");
				String company = kb.nextLine();
				System.out.println("부서를 입력해주세요.");
				String dept = kb.nextLine();
				System.out.println("직급을 입력해주세요.");
				String job = kb.nextLine();

				info = new PhoneCompanyInfo(name, PhoneNumber, addr, email, company, dept, job);

			} else if (books[index] instanceof PhoneCafeInfo) {

				System.out.println("카페 이름을 입력해주세요.");
				String cafeName = kb.nextLine();
				System.out.println("닉네임을 입력해주세요.");
				String nickName = kb.nextLine();

				info = new PhoneCafeInfo(name, PhoneNumber, addr, email, cafeName, nickName);

			}
//			else if (books[index] instanceof PhoneInfo) {
//
//				info = new PhoneInfo(editname, PhoneNumber, addr, email);
//			}

			// 배열에 새로운 인스턴스를 저장
			books[index] = info;
		}
	}

}
