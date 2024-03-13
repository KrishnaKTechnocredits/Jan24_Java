package ankita_s;

public class Assignment78 {
	void patternPrinting1(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	void patternPrinting2(int row) {
		for (int i = 1; i <= row; i++) {
			int count = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}

	void patternPrinting3(int row) {
		int count = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment78 ass78 = new Assignment78();
		ass78.patternPrinting1(4);
		System.out.println("--*---------*----");
		ass78.patternPrinting2(6);
		System.out.println("--*-----*----*----");
		ass78.patternPrinting3(4);
		System.out.println("--*------*---*----");
	}
}
