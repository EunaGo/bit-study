package scm;

public class Tv extends Product{

	Tv(int price){
		super(price);
	}
	
	public String toString() {
		return "Tv";
	}
	
	void display() {
		System.out.println("채널을 시청합니다.");
	}
	
}
