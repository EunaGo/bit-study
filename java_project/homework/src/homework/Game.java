package homework;
/*
 다음조건을 만족하는 클래스를 구성하자. 구슬치기와 딱지치기
어린아이가 소유하고 있는 구슬의 개수 정보를 담을 수 있다.
놀이를 통한 구슬을 주고받음을 표현하는 메서드가 존재한다.

두 번째 조건은 두 아이가 구슬치기를 하는 과정에서 
구슬의 잃고 얻음을 의미하는 것이다.

조건을 만족하는 클래스를 정의하였다면, 
다음조건을 만족하는 인스턴스를 각각 생성하자. ( 하나의 클래스만 작성하자 )

어린이 1의 보유자산  구슬 15개
어린이 2의 보유자산  구슬 9개

인스턴스의 생성이 완료되면 다음의 상황을 main 메서드 내에서 시뮬레이션 하자.
“1차 게임에서 어린이 1은 어린이 2의 구슬 2개를 획득한다”
“2차 게임에서 어린이 2는 어린이 1의 구슬 7개를 획득한다.”
마지막으로 각각의 어린이의 보유 구슬의 개수를 출력하고 프로그램 종료.
 */

public class Game {

	int child1 = 15;
	int child2 = 9;
	int cnt = 0;

	void giveandtake(char c, int num) {
		
		cnt++;

		if (c == 'a') {
			child1 = child1 + num;
			child2 = child2 - num;
		} else if (c == 'b') {
			child1 = child1 - num;
			child2 = child2 + num;
		}
	}

	void showGame(char c, int num, int cnt) {

		if (c == 'a')
			System.out.println(cnt+"차 게임에서 어린이1은 어린이 2의 구슬" + num + "개를 획득한다.");
		else if(c=='b')
			System.out.println(cnt+"차 게임에서 어린이 2는 어린이1의 구슬"+num+"개를 획득한다.");
	}
	
	void showData() {
		System.out.println("a어린이가 획득한 구슬: "+child1);
		System.out.println("b어린이가 획득한 구슬: "+child2);
	}

	public static void main(String[] args) {

		Game g = new Game();
		
		g.giveandtake('a', 2);
		g.showGame('a', 2, g.cnt);
		g.giveandtake('b', 7);
		g.showGame('b', 7, g.cnt);
		g.showData();
	}

}
