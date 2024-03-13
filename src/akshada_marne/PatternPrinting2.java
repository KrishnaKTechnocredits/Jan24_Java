package akshada_marne;

public class PatternPrinting2 {

	void printStarHashPattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print("# ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	void printNumPattern() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		PatternPrinting2 patternPrinting2 = new PatternPrinting2();
		patternPrinting2.printStarHashPattern();
		System.out.println();
		patternPrinting2.printNumPattern();
	}
}
