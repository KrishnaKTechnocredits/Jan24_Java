package shramika_vaidya;

public class PatternPrintEx2 {

	void getPatternPrint1(int n) {
		for (int i = 0; i <= n; i++) {
			for (char j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void getPatternPrint2(int n1) {
		for (int i = 1; i < n1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	void getPatternPrint3(int n2) {
		int count = 1;
		for (int i = 1; i < n2; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PatternPrintEx2 patternPrintEx2 = new PatternPrintEx2();
		patternPrintEx2.getPatternPrint1(4);
		System.out.println("--------------------------------");
		patternPrintEx2.getPatternPrint2(7);
		System.out.println("--------------------------------");
		patternPrintEx2.getPatternPrint3(5);
	}
}
