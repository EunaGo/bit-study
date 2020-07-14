package ver05;

public class PhoneBookMain {

	public static void main(String[] args) {

		PhoneBookManager manager = new PhoneBookManager(100);
		
		while(true) {
			
			Menu.showMenu();
			
			int select = manager.kb.nextInt();
			manager.kb.nextLine();
			
			switch(select) {
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
