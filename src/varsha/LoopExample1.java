package varsha;

public class LoopExample1 {

	void evenWithForLoop() {
		int count = 0;
		for (int index = 1;; index++) {
			if (index % 2 == 0) {
				count++;
				System.out.println("Even : " + index);
			}
			if (count == 5)
				break;
		}
	}

	void evenWithWhileLoop(int startNum) {
		int count = 0;
		int index = startNum;
		while (count < 5) {
			if (index % 2 == 0) {
				count++;
				System.out.println("Even : " + index);
			}
			index++;
		}
	}

	void evenWithDoWhileLoop(int startNum) {
		int index = startNum;
		int count = 0;
		do {
			if (index % 2 == 0) {
				System.out.println("Even : " + index);
				count++;
			}
			index++;
		} while (count < 5);
	}

	public static void main(String[] args) {
		LoopExample1 loopExample1 = new LoopExample1();
		System.out.println("-------EvenWithForLoop Output-------");
		loopExample1.evenWithForLoop();
		System.out.println("-------EvenWithWhileLoop Output-------");
		loopExample1.evenWithWhileLoop(1);
		System.out.println("-------EvenWithDoWhileLoop Output-------");
		loopExample1.evenWithDoWhileLoop(1);
	}
}
