package varsha.patternPrinting;

//*
//**
//***
//****
//
//1
//1 2
//1 2 3 
//1 2 3 4
//1 2 3 4 5
//1 2 3 4 5 6
//
//1
//2 3
//4 5 6
//7 8 9 10

public class PatternPrintEx1 {

	void printStarPattern(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	void printNumberPattern(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	void printPattern(int num) {
		int k = 1;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PatternPrintEx1 patternPrintEx1 = new PatternPrintEx1();
		patternPrintEx1.printStarPattern(4);
		System.out.println();
		patternPrintEx1.printNumberPattern(6);
		System.out.println();
		patternPrintEx1.printPattern(4);

	}
}
