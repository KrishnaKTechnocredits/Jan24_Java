/*Write a Program to Print a Following Patterns:
		*
		##
		***
		####
		*****

		1
		2 2
		3 3 3 
		4 4 4 4
		*/
package garima_s;

public class PatternPrinting2 {

	void printPatternStarHash() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 != 0) {
					System.out.print("* ");
				} else {
					System.out.print("# ");
				}
				
			}System.out.println();
		}
	}

	void printPatternNumber() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PatternPrinting2 patternPrinting2 = new PatternPrinting2();
		patternPrinting2.printPatternStarHash();
		patternPrinting2.printPatternNumber();
	}

}
