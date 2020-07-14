package ver02;

/*
 * trim(): 문자열의 앞뒤 공백을 제거
 * isEmpty(): 인스턴스는 생성되었으나, List안에 값이 존재하지 않는 상태 ("")
 * NUll: 인스턴스가 생성되지 않은 상태. 주소값도 참조하지 않는다. 
 */

import java.util.Scanner;

public class PhoneBookManager {
	
	PhoneInfo creatInstance() {
		
		PhoneInfo info = null;
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요 >> ");
		String name = sc.nextLine();
		
		System.out.println("전화번호를 입력해주세요 >> ");
		String phoneNumber = sc.nextLine();
		
		System.out.println("생일을 입력해주세요 >> ");
		String birthday = sc.nextLine();
		
		// 사용자의 입력 데이터에 따라 인스턴스 생성을 구분
		if(birthday==null||birthday.trim().isEmpty()) {
			info = new PhoneInfo(name,phoneNumber);
		} else {
			info = new PhoneInfo(name, phoneNumber,birthday);
		}
	
		return info;
	}

}
