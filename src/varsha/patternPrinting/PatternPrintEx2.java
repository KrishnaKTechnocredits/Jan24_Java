package varsha.patternPrinting;

//1
//2 2
//3 3 3 
//4 4 4 4
//
//*
//# # 
//* * *
//# # # #
//* * * * *

public class PatternPrintEx2 {

	void printNumberPattern(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	void printPattern(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print("# ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PatternPrintEx2 PatternPrintEx2 = new PatternPrintEx2();
		PatternPrintEx2.printNumberPattern(4);
		System.out.println();
		PatternPrintEx2.printPattern(5);
	}
}
