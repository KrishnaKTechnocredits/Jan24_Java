package shravani_rapelli;

public class UsingAllLoops {
	
	void forLoop(int startRange, int endRange) {
		int count = 0;
		for (int i = startRange; i <= endRange; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				count++;
			}
			if (count == 5)
				break;
		}
	}
	
	void whileLoop(int startRange, int endRange) {
		int count = 0;
		int i = startRange;
		while (i <= endRange) {
			if (i % 2 == 0) {
				System.out.println(i);
				count++;
			}
			if (count == 5)
				break;
			i++;
		}
	}
	
	void doWhileLoop(int startRange, int endRange) {
		int count = 0;
		int i = startRange;
		do {
			if (i % 2 == 0) {
				System.out.println(i);
				count++;
			}
			if (count == 5)
				break;
			i++;
		} while (i <= endRange);
	}
	
	public static void main(String[] args) {
		UsingAllLoops usingAllLoops = new UsingAllLoops();
		System.out.println("Output using forLoop");
		usingAllLoops.forLoop(10, 50);
		System.out.println("Output using whileLoop");
		usingAllLoops.whileLoop(10, 50);
		System.out.println("Output using doWhileLoop");
		usingAllLoops.doWhileLoop(10, 50);
	}
}


