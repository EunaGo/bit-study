package ex;

public class Marbled {

	// <class>
	// ����: �����ϰ� �ִ� ������ ����
	// �޼���: ���̸� ���� ������ �ְ����(������ �Ұ� ����)
	// <instance>
	// ���1 >> ����15
	// ���2 >> ����9
	// <main method>
	// �ùķ��̼�, ��̵��� ������������ ���

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
		//System.out.println("1�� ���ӿ��� ��� 1�� ��� 2�� ���� 2���� ȹ�� ");
		//System.out.println(m.marbling(1, 7));
		//System.out.println("1�� ���ӿ��� ��� 1�� ��� 2�� ���� 2���� ȹ�� ");
		
		//int result1 = m.marbling();  
		//int result2 = m.marbling();  
		
		//System.out.println("child1�� ����: "+);
	}

}
//teacher said
//��ü : ����, ö��, ����
//�Ӽ�(���°�): ������ ����
//���: ����, �������ְ�, ������ �ް�

//Ŭ����: 1��
//����: ������ ����,
//�޼���: 