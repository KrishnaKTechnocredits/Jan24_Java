package rohini_deshmane.pattern_printing_programs;

import java.util.Scanner;

/*
 
1
1 2
1 2 3 
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6

 */

public class NumberPattern1 {
	void patternPrinting(int rowCount) {
		System.out.println();
		for(int i=1; i<=rowCount; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		NumberPattern1 numberPattern1 = new NumberPattern1();
		int rowCount=0;
		System.out.println("Please enter row count");
		Scanner scanner = new Scanner(System.in);
		rowCount = scanner.nextInt();
		numberPattern1.patternPrinting(rowCount);
	}
}
