package fruit;

/*
�ۼ���: ������
������: 2020.4.17
��������: �����ڸ� ���� ���� �ʱ�ȭ, ���� ������ ��� �޼��� ����(showResult)
*/

public class FruitSeller {

	//�Ӽ� => ����
	//����� ����
	//����
	//����� ����
	
	//����: ������ ����� �ʱ�ȭ ����
	int numOfApple = 20; 			//����� ����
	int myMoney;	 			//����
	final int APPLE_PRICE;	//����� ����
	
	//������ �ִ� ������ 
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
	
	//��� => �޼���
	//1. ���� �޴´�. (�Ű�����)
	//2. ����� �Ǹ��� ������ ���Ѵ�.
	//3. ���� ��� ���� - ��ȯ �������
	//4. �����ݾ��� ���� ���Կ� �����ش�.
	//5. ����� ������ ��ȯ�Ѵ�.
	
	public int saleApple(int money) { //�޴°� = ��
		
		int num = money / APPLE_PRICE;
		numOfApple -=num;
		myMoney += money;
		return num;
	}	
	
	void showResult() {
		System.out.println("���� �����ݾ�: "+myMoney+"�̰�, ���� ������ ����� ������ "+numOfApple+"�Դϴ�.");
	}
	
	public void showSaleResult() {
		System.out.println("���� ���: "+numOfApple);
		System.out.println("�Ǹ� ����: "+myMoney);
	}
	
}
