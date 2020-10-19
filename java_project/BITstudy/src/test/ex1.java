package test;

import java.util.HashMap;
import java.util.Map;

public class ex1 {
	
	void Stringformat() {
		System.out.printf("%d 는 %s",100,"hello");
		System.out.println("dkdkdk");
		System.out.printf("%%%ds*\n", 7, "");
		System.out.printf(String.format("%%%ds*\n", 7), "");
		
		System.out.println("---------------------");
		
		String str = String.format(String.format("%%%ds*\n", 7), "");
		System.out.println(str);
	}
	
	public static void keyset() {
        Map<String, String> map = new HashMap<String, String>(); 
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        
        for( String key : map.keySet() ){
            String value = map.get(key);
            System.out.println( String.format("키 : "+key+", 값 : "+value));
        }
        
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

		
	}
	
	static class Fruit {
		public final static Fruit apple = new Fruit();
		public final static Fruit banana = new Fruit();
	}
	
	static class Company {
		public final static Company apple = new Company();
		public final static Company google = new Company();
	}
	

	public static void main(String[] args) {

		Fruit apple = Fruit.apple;
	}

}
