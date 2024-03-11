package rohini_deshmane.pattern_printing_programs;
/*
 
 1
 2 2
 3 3 3
 4 4 4 4
 
 */

import java.util.Scanner;

public class NumberPattern3 {
	void patternPrinting(int rowCount) {
		int num=1;
		System.out.println();
		for(int i=1; i<= rowCount; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
				num++;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		NumberPattern3 numberPattern3 = new NumberPattern3();
		int rowCount=0;
		System.out.println("Please enter row count");
		Scanner scanner = new Scanner(System.in);
		rowCount = scanner.nextInt();
		numberPattern3.patternPrinting(rowCount);
	}
}
