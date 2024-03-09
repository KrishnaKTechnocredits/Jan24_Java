package sasmita;

public class PatternPrinting {
	void pattern() {
		for (int index = 1; index <= 4; index++) {
			for (int i= 1; i <= index; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new PatternPrinting().pattern();

	}

}
