package hiral_purohit;
//Print sum of numbers and Handle decimal numbers too:

//input: te3ch4.5noc7red8.1its
//output: 22.6

public class Assignment_62 {

	void toPrintSumOfDigit(String str) {
		double sum = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch) && str.charAt(i - 1) != '.') {
				if (str.charAt(i + 1) == '.') {
					String temp = "";
					temp = temp + ch + str.charAt(i + 1) + str.charAt(i + 2);
					sum = sum + Double.parseDouble(temp);
				} else {
					sum = sum + Character.getNumericValue(ch);
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Assignment_62().toPrintSumOfDigit("te3ch4.5noc7red8.1its");
	}
}
