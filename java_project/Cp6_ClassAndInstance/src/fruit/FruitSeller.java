package fruit;

/*
작성자: 고은아
수정일: 2020.4.17
수정내용: 생성자를 통한 변수 초기화, 현재 데이터 출력 메서드 생성(showResult)
*/

public class FruitSeller {

	//속성 => 변수
	//사과의 개수
	//수입
	//사과의 가격
	
	//수정: 변수의 명시적 초기화 변경
	int numOfApple = 20; 			//사과의 개수
	int myMoney;	 			//수입
	final int APPLE_PRICE;	//사과의 가격
	
	//내용이 있는 생성자 
	FruitSeller(){
		//numOfApple = 20;
		//myMoney = 0;
		//APPLE_PRICE = 1000;
		this (20,0,1000);
	}
	
	public FruitSeller(int numOfApple, int myMoney, int aPPLE_PRICE) {
		
		this.numOfApple = numOfApple;
		this.myMoney = myMoney;
		APPLE_PRICE = aPPLE_PRICE;
	}

	FruitSeller(int price){
		this (20,0,price);
	}
	
	
	//FruitSeller(int numOfApple, int myMoney, int price){
	//	this.numOfApple = numOfApple;
	//	this.myMoney = myMoney;
	//	this.APPLE_PRICE = price;
	//	
	//}
	
	//기능 => 메서드
	//1. 돈을 받는다. (매개변수)
	//2. 사과를 판매한 개수를 구한다.
	//3. 나의 사과 개수 - 반환 사과개수
	//4. 받은금액을 나의 수입에 더해준다.
	//5. 사과의 개수를 반환한다.
	
	public int saleApple(int money) { //받는것 = 돈
		
		int num = money / APPLE_PRICE;
		numOfApple -=num;
		myMoney += money;
		return num;
	}	
	
	void showResult() {
		System.out.println("현재 보유금액: "+myMoney+"이고, 현재 보유한 사과의 개수는 "+numOfApple+"입니다.");
	}
	
	public void showSaleResult() {
		System.out.println("남은 사과: "+numOfApple);
		System.out.println("판매 수익: "+myMoney);
	}
	
}
