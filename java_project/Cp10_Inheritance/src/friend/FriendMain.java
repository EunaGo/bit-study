package friend;

import java.util.InputMismatchException;

public class FriendMain {

	public static void main(String[] args) {

		// FriendInfoHandler handler = new FriendInfoHandler(10);
		FriendInfoHandler handler = FriendInfoHandler.getInstance();

		while (true) {
			System.out.println("===메뉴를 선택해주세요===");
			System.out.println(" " + Menu.INSERT_HIGH + ". 고교 친구 저장");
			System.out.println(" " + Menu.INSERT_UNIV + ". 대학 친구 저장");
			System.out.println(" " + Menu.PRINT_BASIC + ". 기본 정보 출력");
			System.out.println(" " + Menu.PRINT_ALL + ". 전체 정보 출력");
			System.out.println(" " + Menu.EXIT + ". 종료");
			System.out.println("====================");

			int choice = 0;

			try {

				choice = handler.kb.nextInt();

			} catch (InputMismatchException e) { // InputMismatchException
				System.out.println("정상적인 메뉴의 번호 입력이 되지 않았습니다");
				System.out.println("메뉴를 다시 입력해주세요.");
				handler.kb.nextLine();
				continue;
			} catch (Exception e) {
				System.out.println("예외발생");
				handler.kb.nextLine();
				continue;
			}
			handler.kb.nextLine(); // 앞의 버퍼를 클리어하는 목적

			switch (choice) {
			case Menu.INSERT_HIGH:
			case Menu.INSERT_UNIV:
				handler.addFriend(choice);
				break;
			case Menu.PRINT_BASIC:
				handler.showAllSimpleData();
				break;
			case Menu.PRINT_ALL:
				handler.showAllData();
				break;
			case Menu.EXIT:
				System.out.println("프로그램을 종료합니다.");
				return;

			}

		}

	}

}
