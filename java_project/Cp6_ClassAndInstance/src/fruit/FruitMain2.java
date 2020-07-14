package fruit;

public class FruitMain2 {

	public static void main(String[] args) {
		
		// seller1 ��ü ����
		FruitSeller seller1 = new FruitSeller(30, 0, 1000);
		
		// seller2 ��ü ����
		FruitSeller seller2 = new FruitSeller(20, 0 ,1500);
		
		// seller3 ��ü ����
		FruitSeller seller3 = new FruitSeller(20, 0 ,1000);
				
		// buyer ��ü ����
		FruitBuyer buyer = new FruitBuyer(10000, 0);
		
		//seller1���� ����
		buyer.buyApple(seller1, 3000);
		
		//seller2���� ����
		buyer.buyApple(seller2, 3000);

		//seller3���� ����
		buyer.buyApple(seller3, 4000);
		
		System.out.println("�Ǹ��� 1�� ���� ��Ȳ");
		seller1.showResult();
		
		System.out.println("�Ǹ��� 2�� ���� ��Ȳ");
		seller2.showResult();
		
		System.out.println("�Ǹ��� 3�� ���� ��Ȳ");
		seller3.showResult();
		
	}

}
