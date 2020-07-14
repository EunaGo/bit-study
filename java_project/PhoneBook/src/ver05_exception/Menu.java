package ver05_exception;

public class Menu {
	
	public static void showMenu() {
		System.out.println("===================");
		System.out.println("메뉴를 입력해주세요.");
		System.out.println(MenuInterFace.INSERT+". 친구 정보 입력");
		System.out.println(MenuInterFace.SEARCH+". 친구 정보 검색");
		System.out.println(MenuInterFace.DELETE+". 친구 정보 삭제");
		System.out.println(MenuInterFace.EDIT+". 친구 정보 수정");
		System.out.println(MenuInterFace.PRINT_ALL+". 친구정보 전체보기");
		System.out.println(MenuInterFace.EXIT+". 프로그램 종료");
		System.out.println("===================");
	}

}