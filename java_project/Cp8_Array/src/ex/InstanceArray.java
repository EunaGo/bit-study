package ex;

public class InstanceArray {

	public static void main(String[] args) {
		
		String[] strArray = new String[3];
		
		strArray[0] = "JAVA";
		strArray[1] = "JS";
		strArray[2] = "Python";
		
		System.out.println("���ڿ��� ����: "+strArray[0].length());
		System.out.println("���ڿ��� toString(): "+strArray[0].toString());
		
		for(int i=0; i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}
	}

}
