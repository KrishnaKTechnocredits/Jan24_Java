package technocredits;

public class StaticNonStaticEx1 {

	int x = 10;
	static int y = 20;
	
	void display(){
	
	}
	
	static void m2() {
		System.out.println("techno " + y);
	}
	
	static void m1(){
		System.out.println("Hi");
		m2();
	}
	
	public static void main(String[] args){
		System.out.println("Hello");
		m1();
		System.out.println("end");
	}
}
