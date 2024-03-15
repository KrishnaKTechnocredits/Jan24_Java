package technocredits.superthis;

class Test {
	int x = 10;

	Test(){
		super();
		System.out.println("Hi");
	}
	
	void processData() {
		this.x = 100;
	}

	void m1() {
		Test a = new Test();
		a.x = 1;
		System.out.println(this.x);
		System.out.println(a.x);

		System.out.println(this);
		System.out.println(a);
	}

	public static void main(String[] args) {
		Test a = new Test();
		a.m1();
	}
}