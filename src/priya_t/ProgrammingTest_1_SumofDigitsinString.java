//Print sum of all the digits in the given String.

//input : te3ch4nocred8its
//output : 15
package priya_t;

public class ProgrammingTest_1_SumofDigitsinString {

	public static void main(String[] args) {
		int sum = 0;
		String str = "te3ch4nocred8its";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) { // "348"
				int b = Integer.parseInt(String.valueOf(ch));
				sum = sum + b;
			}
		}
		System.out.println(sum);
	}

}
