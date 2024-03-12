package ankita_s;

public class Assignment_79 {
	void patternPrinting(int row) {
		int count = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
			}
			System.out.println();
			count++;
		}
	}

	void patternPrinting1(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 != 0) {
					System.out.print("*" + " ");
				} else {
					System.out.print("#" + " ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment_79 ass79 = new Assignment_79();
		ass79.patternPrinting(4);
		System.out.println("--*-----*-----*-");
		ass79.patternPrinting1(5);
		System.out.println("--*---*------*--");
	}
}
