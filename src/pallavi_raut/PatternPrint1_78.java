/*
*
**
***
****

1
1 2
1 2 3 
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6

1
2 3
4 5 6
7 8 9 10

*/
package pallavi_raut;

public class PatternPrint1_78 {

	public static void main(String[] args) {
		PatternPrint1_78 patternPrint = new PatternPrint1_78();
		patternPrint.patternPrint1(4);
		System.out.println();
		patternPrint.patternPrint2(6);
		System.out.println();
		patternPrint.patternPrint3(4);
	}

	void patternPrint1(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

	void patternPrint2(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");

			}
			System.out.println();
		}

	}

	void patternPrint3(int row) {
		int count = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}

	}

}
