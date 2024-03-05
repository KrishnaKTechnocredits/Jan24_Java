package akshada_marne;

public class SumOfIntDecimal {

	void printSumOfDouble(String input) {
		double sum = 0;
		String target = "";

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (ch == '.' && Character.isDigit(input.charAt(i - 1)) && Character.isDigit(input.charAt(i + 1))) {
				String before = String.valueOf((input.charAt(i - 1)));
				String after = String.valueOf((input.charAt(i + 1)));
				target = before + ch + after;
				sum = sum + Double.parseDouble(target);
			}

			else if (Character.isDigit(ch) && input.charAt(i - 1) != '.' && input.charAt(i + 1) != '.') {
				sum = sum + Character.getNumericValue(ch);
			}

		}

		System.out.println("Sum of all doubles in given string : " + sum);
	}

	public static void main(String[] args) {
		String str = "te3ch4.5noc7red8.1its";
		SumOfIntDecimal sumOfIntDecimal = new SumOfIntDecimal();
		sumOfIntDecimal.printSumOfDouble(str);
	}
}
