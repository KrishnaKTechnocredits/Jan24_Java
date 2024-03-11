package padmaja;

public class PatterntPrinting2 {
	void printNumberPatter() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	void printNumberPatter1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 != 0)
					System.out.print("*" + " ");
				else
					System.out.print("#" + " ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		PatterntPrinting2 patternPrinting = new PatterntPrinting2();
		patternPrinting.printNumberPatter();
		System.out.println(" ");
		patternPrinting.printNumberPatter1();
	}
}
