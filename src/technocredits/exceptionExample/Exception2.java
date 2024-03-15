package technocredits.exceptionExample;

public class Exception2 {
	
	static void m1(int num){
		System.out.println(1);
		System.out.println(2);
		
		try {
			int x = 10/num;
			System.out.println(x);
			Exception2 exception2 = null;
			System.out.println("IT");
			exception2.m2();
		}catch(NullPointerException ae) {		
			System.out.println("techno");
		}catch(ArithmeticException ae) {
			int x = 10/0;
			System.out.println(x);
			System.out.println("credits");
		}catch(Exception ae) {
			System.out.println("techno");
		}
		System.out.println(3);
		System.out.println(4);
		System.out.println("Pune");
	}
	
	void m2(){
		System.out.println("India");
	}
	
	public static void main(String[] args) {
		m1(1);
		System.out.println("Hello");
	}
}
