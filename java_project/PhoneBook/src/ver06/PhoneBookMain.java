package ver06;

import java.util.InputMismatchException;


import ver05_exception.exception.BadNumberException;

public class PhoneBookMain {

	public static void main(String[] args) {

		// PhoneBookManager manager = new PhoneBookManager(100);
		PhoneBookManager manager = PhoneBookManager.getInstance();

		while (true) {

			Menu.showMenu();

			int select = 0;

			try { // 정상범위는 1 ~ 6 : MenuInterFace.INSERT~ MenuInterFace.EXIT

				select = manager.kb.nextInt();

				if (select >= MenuInterFace.INSERT && select <= MenuInterFace.EXIT) {

					BadNumberException e = new BadNumberException("잘못된 메뉴입력");

					throw e;

				}
			} catch (InputMismatchException e) {
				
				System.out.println("잘못된 메뉴 입력입니다. \n확인하시고 다시 입력해주세요.");
				continue;
				
			} catch (BadNumberException e) {
				
				System.out.println("메뉴 범위는 벗어난 숫자 입력입니다.\n다시 확인 후 입력해주세요.");
				continue;
				
			} catch (Exception e) {
				
				System.out.println("잘못된 메뉴 입력입니다. \n확인하시고 다시 입력해주세요.");
				continue;
				
			} finally {
				
				manager.kb.nextInt();
				
			}
			switch (select) {
			case MenuInterFace.INSERT:
				manager.creatInfo();
				break;
			case MenuInterFace.SEARCH:
				manager.showInfo();
				break;
			case MenuInterFace.DELETE:
				manager.deleteInfo();
				break;
			case MenuInterFace.EDIT:
				manager.editInfo();
				break;
			case MenuInterFace.PRINT_ALL:
				manager.showAllInfo();
				break;
			case MenuInterFace.EXIT:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}

	}

}
