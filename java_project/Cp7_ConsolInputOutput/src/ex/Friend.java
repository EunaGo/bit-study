package ex;

public class Friend {

	String myName;
	
	Friend(String name){
		myName = name;	// ������ �ʱ�ȭ
	}
	
	// object Ŭ������ toString() �޼��带 �籸���Ѵ� >> �������̵�
	// �޼����� ����ΰ� ���� �޼����� ����ο� �����ؾ��Ѵ�.
	public String toString() {
		
		return "�� �̸���" + this.myName + "�Դϴ�.";
	}
	
	public static void main(String[] args) {
		
		Friend f1 = new Friend("�����");
		
		Friend f2 = new Friend("������");
		
		System.out.println(f1. toString());
		System.out.println(f2. toString());
		
		System.out.println(f1);
		System.out.println(f2);
	}

	//@Override
	//public String toString() {
	//	return "Friend [myName=" + myName + "]";
	//}
}
