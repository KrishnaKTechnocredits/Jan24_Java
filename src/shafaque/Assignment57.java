package shafaque;

public class Assignment57 {

	void squareOfOddDigit(String str) {

		int num2 = 0;
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				if (ch % 2 != 0) {
					int num1 = Character.getNumericValue(ch);
					num2 = num1 * num1;
					sum = sum + num2;
				}
		}
		System.out.println("Sum of squares of odd digits : " + sum);
	}

	public static void main(String[] args) {
		String str = "te3ch4noc7red8its";
		new Assignment57().squareOfOddDigit(str);
	}

}
