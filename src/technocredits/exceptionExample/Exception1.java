package technocredits.exceptionExample;

public class Exception1 {
	
	void m1(int num){
		System.out.println(1);
		System.out.println(2);
		
		try {
			int x = 10/num;
			System.out.println(x);
		}catch(NullPointerException ae) {		
			System.out.println("techno");
		}catch(ArithmeticException ae) {
			int x = 10/10;
			System.out.println(x);
			System.out.println("credits");
		}catch(Exception ae) {
			System.out.println("techno");
		}
		System.out.println(3);
		System.out.println(4);
		System.out.println("Pune");
	}
	
	void m2(int num){
		System.out.println(1);
		System.out.println(2);
		
		try {
			int x = 10/num;
			System.out.println(x);
		}catch(Exception ae) {
			System.out.println("techno");
		}
		System.out.println(3);
		System.out.println(4);
		System.out.println("Pune");
	}
	
	public static void main(String[] args) {
		System.out.println("Hi");
		new Exception1().m1(0);
		System.out.println("Hello");
	}
}
