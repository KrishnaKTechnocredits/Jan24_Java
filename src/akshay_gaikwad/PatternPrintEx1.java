package akshay_gaikwad;

public class PatternPrintEx1 {

	void starPattern(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	void numberPattern(int row) {
		for (int i = 1; i <= row; i++) {
			int count = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}

	void numberPattern2(int row) {
		int count = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PatternPrintEx1 obj = new PatternPrintEx1();
		obj.numberPattern(4);
		System.out.println("---------------");
		obj.numberPattern(6);
		System.out.println("---------------");
		obj.numberPattern2(4);
		System.out.println("---------------");
	}
}
