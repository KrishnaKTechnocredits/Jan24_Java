package samiksha;

public class PatternPrintingEx {

	void processData(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	void printPattern(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	void printPattern1(int num) {
		int count = 1;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PatternPrintingEx ex = new PatternPrintingEx();
		ex.processData(4);
		System.out.println();
		ex.printPattern(6);
		System.out.println();
		ex.printPattern1(4);
	}
}
