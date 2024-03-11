package rohini_deshmane.pattern_printing_programs;

import java.util.Scanner;

/*

*
**
***
****
*****

 */

public class StarPattern {

	void patternPrinting(int rowCount) {
		System.out.println();
		for(int i=0; i<=rowCount; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		StarPattern starPattern = new StarPattern();
		int rowCount=0;
		System.out.println("Please enter row count");
		Scanner scanner = new Scanner(System.in);
		rowCount = scanner.nextInt();
		starPattern.patternPrinting(rowCount);
	}
}
