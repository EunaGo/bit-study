package fruit;

/*
�ۼ���: ������
������: 2020.4.17
��������: �����ڸ� ���� ���� �ʱ�ȭ
*/

public class FruitBuyer {

	// �Ӽ� => ����
	// 1. ���� ���� ��
	// 2. ����� ���

	// int myMoney = 5000;
	// int numOfApple = 0;

	// ���ű�� => �޼���
	// 1. ����ã��ޱ�
	// 2. ������ �� ����
	// 3. �������� ���� �ְ� �Ǹ� ��û > ����� ����
	// 4. ����� ������ ���� ����� ������ŭ ������Ų��.
	// 5. ������ ���� ���� ������ �����Ѵ�.

	int myMoney;
	int numOfApple;

	// ������
	FruitBuyer() {
		myMoney = 5000;
		numOfApple = 0;
	}
	
	FruitBuyer(int money, int num){
		myMoney = money;
		numOfApple = num;
	}

	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}

	public void showBuyResult() {
		System.out.println("���� �ܾ�: " + myMoney);
		System.out.println("����� ���: " + numOfApple);
	}

}
