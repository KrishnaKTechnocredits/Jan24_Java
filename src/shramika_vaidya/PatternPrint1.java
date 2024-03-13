package shramika_vaidya;

public class PatternPrint1 {
	void getPatternPrint1(int n) {
		int count = 0;
		for (int i = 0; i <= n; i++) {
			for (char j = 1; j <= i; j++) {
				System.out.print(count + " ");
			}
			System.out.println();
			count++;
		}
	}

	void getPatternPrint2(int n) {
		for (int i = 0; i <= n; i++) {
			for (char j = 1; j <= i; j++) {
				if (i % 2 != 0) {
					System.out.print("*");
				} else
					System.out.print("#");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PatternPrint1 patternPrint1 = new PatternPrint1();
		patternPrint1.getPatternPrint1(4);
		System.out.println("--------------------------------");
		patternPrint1.getPatternPrint2(5);
	}
}
