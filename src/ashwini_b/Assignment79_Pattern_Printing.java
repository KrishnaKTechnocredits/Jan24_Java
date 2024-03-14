package ashwini_b;

/*
 Assignment 79:
 1
 2 2
 3 3 3
 4 4 4 4
 
 *
 # #
 * * * 
 # # # #
 * * * * *
 */
public class Assignment79_Pattern_Printing {

	void patternPrint() {

		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	void patternPrint2() {

		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print('#' + " ");
				} else {
					System.out.print('*' + " ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment79_Pattern_Printing assignment79_Pattern_Printing = new Assignment79_Pattern_Printing();
		assignment79_Pattern_Printing.patternPrint();
		assignment79_Pattern_Printing.patternPrint2();
	}

}
