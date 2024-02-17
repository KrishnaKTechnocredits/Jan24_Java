package shramika_vaidya;

public class PrintTheSumOfNegativeNum {

	String getDigitAndSpecialChar(String str) {
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((!Character.isDigit(ch) && !Character.isUpperCase(ch) && !Character.isLowerCase(ch))
					|| Character.isDigit(ch)) {
				str1 = str1 + ch;
			}
		}
		return str1;
	}

	int getSumOfNegativePrinted(String input) {
		int sum = 0;
		String output = getDigitAndSpecialChar(input);
		for (int i = 0; i < output.length(); i++) {
			if (output.charAt(i) == '-') {
				char ch = output.charAt(i + 1);
				int num = ((Character.getNumericValue(ch)) * (-1));
				sum = sum + num;
			}
		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		new PrintTheSumOfNegativeNum().getSumOfNegativePrinted("te-3ch4noc7red-8its");
	}
}
