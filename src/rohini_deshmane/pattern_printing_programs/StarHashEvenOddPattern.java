package rohini_deshmane.pattern_printing_programs;

import java.util.Scanner;

/*
 
* 
# # 
* * * 
# # # # 

 */

public class StarHashEvenOddPattern {
	void patternPrinting(int rowCount) {
		System.out.println();
		for(int i=1; i<=rowCount; i++) {
			for(int j=1; j<=i; j++) {
				if(i%2==0)
					System.out.print("# ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		StarHashEvenOddPattern starHashPattern = new StarHashEvenOddPattern();
		int rowCount=0;
		System.out.println("Please enter row count");
		Scanner scanner = new Scanner(System.in);
		rowCount = scanner.nextInt();
		starHashPattern.patternPrinting(rowCount);
	}
}
