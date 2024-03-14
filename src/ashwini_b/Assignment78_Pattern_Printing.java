package ashwini_b;
/*
 Assignment - 78 : 9th March'2024
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

public class Assignment78_Pattern_Printing {
	void starPatternPrint() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*' + " ");
			}
			System.out.println();
		}
	}
	
	void patternPrint() {
		for(int i = 0 ; i <= 6 ; i++) {
			for(int j = 1 ; j <= i ; j++ ) {
				System.out.print( j + " ");
			}
			System.out.println();
		}
	}
	
	void secondPatternPrint() {
		int temp = 0; 
		for (int i = 0 ; i <= 4 ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				temp++;
				System.out.print( temp + " ");
			}
			System.out.println();
			}
		}
	

	public static void main(String[] args) {
		Assignment78_Pattern_Printing assignment78_Pattern_Printing = new Assignment78_Pattern_Printing();
		assignment78_Pattern_Printing.starPatternPrint();
		assignment78_Pattern_Printing.patternPrint();
		assignment78_Pattern_Printing.secondPatternPrint();
}
}
