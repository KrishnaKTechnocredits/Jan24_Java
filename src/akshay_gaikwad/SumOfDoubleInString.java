/*"Print sum of numbers and Handle decimal numbers too:
input: te3ch4.5noc7red8.1its
output: 22.6
hint: 3 + 4.5 + 7 + 8.1"
 */
package akshay_gaikwad;

public class SumOfDoubleInString {
	
	//1st try
	void printSumOfDouble(String input) {
		double sum = 0;
		String target = "";

		for (int index = 1; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == '.' && Character.isDigit(input.charAt(index - 1)) && Character.isDigit(input.charAt(index + 1))) {
				String beforeDec = String.valueOf((input.charAt(index - 1)));
				String afterDec = String.valueOf((input.charAt(index + 1)));
				target = beforeDec + ch + afterDec;
				sum += Double.parseDouble(target);
			} else if (Character.isDigit(ch) && input.charAt(index - 1) != '.' && input.charAt(index + 1) != '.') {
				sum += Character.getNumericValue(ch);
			} else if (Character.isDigit(input.charAt(index - 1))) {
				sum += Character.getNumericValue(input.charAt(index - 1));
			}
		}
		System.out.println("Sum of all doubles in given string : " + sum);
	}
	
	//2nd try
	void printSumOfDouble2(String input) {
		double sum = 0;
		for (int index = 0; index < input.length(); index++) {
			String target = "";
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				target += Character.toString(ch);
				if ((input.charAt(index + 1) == '.')) {
					target += Character.toString('.');
					index++;
					if (Character.isDigit(input.charAt(index + 1))) {
						target += Character.toString(input.charAt(index + 1));
						index++;
					}
				}
			}
			if(!target.isEmpty())
				sum += Double.parseDouble(target);
		}
		System.out.println("Sum of all doubles in given string : " + sum);
	}

	public static void main(String[] args) {
		//new SumOfDoubleInString().printSumOfDouble("te3ch4.5noc7red8.1its");
		new SumOfDoubleInString().printSumOfDouble2("te3ch4.5noc7red8.1its");


	}
}
