/* Assignment 79
1
2 2
3 3 3
4 4 4 4

*
# #
* * *
# # # #
* * * * *
------------- */

package pallavi_raut;

public class PatternPrint2_79 {
	public static void main(String[] args) {
		PatternPrint2_79 patternPrint2 = new PatternPrint2_79();
		patternPrint2.patternPrint1(4);
		System.out.println();
		patternPrint2.patternPrint2(5);
	}

	void patternPrint1(int row) {
		int count = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
			}
			count++;
			System.out.println();
		}
	}

	void patternPrint2(int row) {
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
}
