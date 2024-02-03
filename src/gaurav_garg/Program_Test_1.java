package gaurav_garg;

public class Program_Test_1 {

	void printSumAllDigitInString(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			boolean digit = Character.isDigit(c);

			if (digit == true) {
				int num1 = Character.getNumericValue(c);
				sum = sum + num1;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Program_Test_1().printSumAllDigitInString("te3ch4nocred8its");
		new Program_Test_1().printSumAllDigitInString("technocredits");
	}
}
