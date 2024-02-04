//Print sum of all the odd digits in the given String.
package priya_t;
import java.util.ArrayList;

public class Assignment28_SumofOddNo {

	public static void printOddNo(String str) {
		int sum = 0;
		String word = "te3ch4noc7red8its";

		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
			if (Character.isDigit(ch)) {
				int ModifiedString = Integer.parseInt(String.valueOf(ch));
				if (ch % 2 != 0) { //
					System.out.println("Odd No. is:" + ch);
					sum = sum + ModifiedString;
				}
			}
		}
		System.out.println("Sum of odd digits:" + sum);
	}

	public static void main(String[] args) {
		Assignment28_SumofOddNo oddno = new Assignment28_SumofOddNo();
		oddno.printOddNo("te3ch4noc7red8its");
	}
}