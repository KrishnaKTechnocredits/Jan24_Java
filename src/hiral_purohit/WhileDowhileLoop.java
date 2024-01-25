package hiral_purohit;

public class WhileDowhileLoop {

	void forloop(int num1, int num2) {
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0)
				System.out.println(i + " is even number");
		}
	}

	void whileLoop(int num1, int num2) {
		int i = num1;
		while (i <= num2) {
			if (i % 2 == 0)
				System.out.println(i + " is even number");
				i++;
		}
	}

	void doWhileLoop(int num1, int num2) {
		int i = num1;
		do {
			if (i % 2 == 0)
				System.out.println(i + " is even number");
				i++;
		} while (i <= num2);
	}

	public static void main(String[] args) {
		WhileDowhileLoop whileDowhileLoop = new WhileDowhileLoop();
		System.out.println("output of forLoop is:");
		whileDowhileLoop.forloop(1, 10);
		System.out.println("output of whileLoop is:");
		whileDowhileLoop.whileLoop(1, 10);
		System.out.println("output of doWhileLoop is:");
		whileDowhileLoop.doWhileLoop(1, 10);
	}
}
