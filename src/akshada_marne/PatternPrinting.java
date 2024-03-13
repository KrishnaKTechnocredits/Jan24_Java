package akshada_marne;

public class PatternPrinting {

	void printStar() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	
	
	void printNum() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}

	void printNumPattern() {
		int count = 1;
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}

	}

	public static void main(String args[]) {
		PatternPrinting patternPrinting = new PatternPrinting();
		patternPrinting.printStar();
		System.out.println();
		patternPrinting.printNum();
		System.out.println();
		patternPrinting.printNumPattern();
	}

}
