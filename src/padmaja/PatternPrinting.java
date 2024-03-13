package padmaja;

public class PatternPrinting {
	void printStartPattern() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	void printNumberPatter1() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	void printNumberPatter2() {
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
		patternPrinting.printStartPattern();
		System.out.println(" ");
		patternPrinting.printNumberPatter1();
		System.out.println(" ");
		patternPrinting.printNumberPatter2();
	}
}
