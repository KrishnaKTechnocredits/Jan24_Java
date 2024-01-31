package priya_t;

import java.util.ArrayList;

public class SumofOddNo {

	public static void printOddNo(String str) {

		int sum = 0;
		String word = "te3ch4noc7red8its";

		for (int j = 0; j < str.length(); j++) {

			char ch = str.charAt(j);

			if (Character.isDigit(ch)) {
				int b = Integer.parseInt(String.valueOf(ch));
				if (ch % 2 != 0) {
                    System.out.println("Odd No. is:" + ch);
                    sum = sum + b;
               }
		   }
		}
		System.out.println("Sum of odd digits:" + sum);
	}

	public static void main(String[] args) {
		SumofOddNo oddno = new SumofOddNo();
		oddno.printOddNo("te3ch4noc7red8its");
	}
}