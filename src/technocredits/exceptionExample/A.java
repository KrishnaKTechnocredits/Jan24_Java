package technocredits.exceptionExample;

class A {
	void m1() {
		System.out.println("A m1");
		B b = new B();
		try {
			b.m2();
		}catch(NullPointerException re) {
			
		}
		System.out.println("A m1 end");
	}

	public static void main(String[] args){
		try {
			new A().m1();			
		}catch(ArithmeticException re) {
			System.out.println("catch");
		}
		System.out.println("end");
	}
}
