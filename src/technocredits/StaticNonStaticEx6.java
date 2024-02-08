package technocredits;

class StaticNonStaticEx6 {
	int num = 10;
	static StaticNonStaticEx6 ex6 = new StaticNonStaticEx6();
	String name = "techno";
	
	static void m1() {
		System.out.println("Hi");
		ex6.m2();
	}
	
	static void m3() {
		System.out.println("Hello");
		ex6.m2();
	}
	
	static void display() {
		System.out.println("Jan24 javaselenium");
		ex6.m2();
	}

	void m2() {
		System.out.println("technocredits");
		int temp = 10;
	}

	public static void main(String[] args) {
		m1();
		StaticNonStaticEx6 ex6 = new StaticNonStaticEx6();
	}
}