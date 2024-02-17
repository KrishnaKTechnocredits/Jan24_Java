package ashwini_b;

/*
Assignment - 62 : 16th Feb'2024
"Print sum of numbers and Handle decimal numbers too:
input: te3ch4.5noc7red8.1its
output: 22.6
hint: 3 + 4.5 + 7 + 8.1"
 */
public class SumOfNumAndHandleDecimalNum {

	void printSum(String input) {
		double sum = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				if (input.charAt(i + 1) == '.' && Character.isDigit(input.charAt(i + 2))) {
					String strNum = ch + "." + (input.charAt(i + 2));
					double newnum = Double.parseDouble(strNum);
					i += 2;
					sum = sum + newnum;
				} else {
					int num = Character.getNumericValue(ch);
					sum = sum + num;
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		SumOfNumAndHandleDecimalNum sumOfNumAndHandleDecimalNum = new SumOfNumAndHandleDecimalNum();
		sumOfNumAndHandleDecimalNum.printSum("te3ch4.5noc7red8.1its");
	}
}
