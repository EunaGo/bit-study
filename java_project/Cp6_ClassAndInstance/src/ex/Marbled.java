package ex;

public class Marbled {

	// <class>
	// 변수: 소유하고 있는 구슬의 개수
	// 메서드: 놀이를 통한 구슬을 주고받음(구슬의 잃고 얻음)
	// <instance>
	// 어린이1 >> 구슬15
	// 어린이2 >> 구슬9
	// <main method>
	// 시뮬레이션, 어린이들의 보유구슬개수 출력

	int child1, child2;
	int numOfMarble;

	void marbling(Marbled player, int n) {

		numOfMarble = n;
		player.numOfMarble-=n;
	}
	
	void setData(int c1, int c2) {
		
		child1 = c1;
		child2 = c2;
	}
	
	public static void main(String[] args) {
			
		Marbled m = new Marbled();
		
		m.setData(15,9);
		
		System.out.println();
		//System.out.println("1차 게임에서 어린이 1은 어린이 2의 구슬 2개를 획득 ");
		//System.out.println(m.marbling(1, 7));
		//System.out.println("1차 게임에서 어린이 1은 어린이 2의 구슬 2개를 획득 ");
		
		//int result1 = m.marbling();  
		//int result2 = m.marbling();  
		
		//System.out.println("child1의 구슬: "+);
	}

}
//teacher said
//객체 : 영희, 철수, 구슬
//속성(상태값): 구슬의 개수
//기능: 게임, 구슬을주고, 구슬을 받고

//클래스: 1개
//변수: 구슬의 개수,
//메서드: 