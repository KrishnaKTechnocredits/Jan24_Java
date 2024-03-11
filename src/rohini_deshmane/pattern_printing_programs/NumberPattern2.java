package rohini_deshmane.pattern_printing_programs;
/*

1
2 3
4 5 6
7 8 9 10

 */

import java.util.Scanner;

public class NumberPattern2 {
	void patternPrinting(int rowCount) {
		int num=1;
		System.out.println();
		for(int i=1; i<=rowCount; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		NumberPattern2 numberPattern2 = new NumberPattern2();
		int rowCount=0;
		System.out.println("Please enter row count");
		Scanner scanner = new Scanner(System.in);
		rowCount = scanner.nextInt();
		numberPattern2.patternPrinting(rowCount);
	}
}
