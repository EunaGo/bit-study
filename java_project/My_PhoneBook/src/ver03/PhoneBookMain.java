package ver03;

import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {
		
		PhoneBookManager manager = new PhoneBookManager();
		
		PhoneInfo info = null;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
//			info = manager.creatInstace();
//			info.showInfo();
			
			//Menu.showMenu();
			
			int selectNum = sc.nextInt();
			
			switch(selectNum) {
			
			case 1: manager.addInfo();
						break;
			case 2: manager.searchInfo();
						break;
			case 3: manager.deleteInfo();
						break;
			case 4: manager.showAllData();
						break;
			case 5:
					System.out.println("프로그램이 종료되었습니다.");
					System.exit(0);
					break;
			
			}	
		
		}

	}

}
