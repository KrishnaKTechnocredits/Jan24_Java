package varsha;

//Print sum of numbers and Handle decimal numbers too:
//input: te3ch4.5noc7red8.1its
//output: 22.6
//hint: 3 + 4.5 + 7 + 8.1

public class SumOfAllTheDigitInGivenString {

	double getSumOfAllTheNum(String input) {
		double sum = 0;
		String value = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch) && input.charAt(i - 1) != '.') {
				if (input.charAt(i + 1) == '.') {
					value = "";
					value = value + ch + input.charAt(i + 1) + input.charAt(i + 2);
					sum = sum + Double.parseDouble(value);
				} else {
					sum = sum + Character.getNumericValue(ch);
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfAllTheDigitInGivenString sumOfAllTheDigitInGivenString = new SumOfAllTheDigitInGivenString();
		double d = sumOfAllTheDigitInGivenString.getSumOfAllTheNum("te3ch4.5noc7red8.1its");
		System.out.println(d);
	}
}
