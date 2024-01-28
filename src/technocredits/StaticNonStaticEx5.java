package technocredits;

class StaticNonStaticEx5 {

	int num1 = 10;
	static int num2 = 20;
	static String name = "techno";

	void m1() {
		num1++;
		num2++;
	}

	void updateData() {
		name = "credits";
	}

	void printData() {
		System.out.println(num1 + ":" + num2 + ":" + name);
	}

	public static void main(String[] args) {
		StaticNonStaticEx5 ex5_1 = new StaticNonStaticEx5();
		ex5_1.m1();
		ex5_1.updateData();
		ex5_1.printData();

		StaticNonStaticEx5 ex5_2 = new StaticNonStaticEx5();
		ex5_2.m1();
		ex5_2.printData();
	}
}