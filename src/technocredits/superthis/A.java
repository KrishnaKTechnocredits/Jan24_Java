package technocredits.superthis;

class A {
	A(int x) {
		this(false, 10.2);
		System.out.println(1);
	}

	A(String name) {
		System.out.println(2);
	}

	A(boolean f, double d) {
		this("Hi");
		System.out.println(3);
	}

	A() {
		this(1);
		System.out.println(4);
	}

	final static void m1() {
	
	}
	
	public static void main(int[] x) {
	
	}
	
	public static void main(String[] args){
		A a = new A();
	}
}