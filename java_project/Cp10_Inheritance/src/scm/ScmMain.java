package scm;

public class ScmMain {

	public static void main(String[] args) {

		// 상속 관계에서 다형성
		// 상위클래스 타입의 참조 변수 = 하위클래스의 인스턴스

		Product p = new Tv(100);

		Tv tv = new Tv(10);
		Computer com = new Computer(20);
		Audio aud = new Audio(30);

		int sum = tv.price + com.price + aud.price;

		Product p1 = tv; // 자동 형변환
		Product p2 = com; //
		Product p3 = aud; //

		// 상위클래스 타입의 배열 생성
		Product[] products = new Product[3];
		products[0] = new Tv(100);
		products[1] = new Computer(200);
		products[2] = new Audio(300);

		// instanceof 연산자 >> 참조변수가 참조하는 인스턴스를 특정 클래스 타입으로 형변환이 가능한지 여부 확인
		// instanceof >> p1 instanceof Computer >> true/false

		if (products[0] instanceof Computer)
			((Computer) products[0]).programming(); // 명시적 형변환 상위타입의 변수 > 하위 타입의 변수
		
		// 전달하는 배열에 Computer가 있다면 프로그래밍을 하겠다.
		for(int i=0;i<products.length;i++) {
			if (products[i] instanceof Computer)
				((Computer) products[i]).programming();
		}
		
		System.out.println("====================");
		System.out.println("====================");
		
		int sumOfPrice = 0;

		int sumOfPoint = 0;

//		for (int i = 0; i < products.length; i++) {
//			System.out.println(products[i]);
//			sum += products[i].price;
//			sumOfPoint += products[i].bonusPoint;
//		}

//		System.out.println("전체 제품의 가격의 합은 "+sumOfPrice);
//		System.out.println("전체 제품의 포인트의 합은 "+sumOfPoint);

		// 구매자가 제품을 구매하는 시뮬레이션
		// 구매자 생성
		Buyer buyer = new Buyer();

		// 제품 생성
		Tv product1 = new Tv(200);
		Computer product2 = new Computer(250);
		Audio product3 = new Audio(100);

		// Tv구매
		buyer.buy(product1);

		// Computer 구매
		buyer.buy(product2);

		// Audio 구매
		buyer.buy(product3);

		buyer.buy(product2);

		buyer.summary();

		System.out.println("현재 보유금액은 " + buyer.money + "입니다.");
		System.out.println("현재 보유 포인트는 " + buyer.bonusPoint + "입니다.");
	}

}
