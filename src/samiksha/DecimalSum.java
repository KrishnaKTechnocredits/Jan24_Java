package samiksha;

public class DecimalSum {

	void printSum() {
		double sum = 0;
		double sum1 = 0;
		String str = "te3ch4.5noc7red8.1its";
		for (int index = 0; index < str.length(); index++) {
			String str1 = "";
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				if (str.charAt(index + 1) == '.') {
					if (Character.isDigit(str.charAt(index + 2))) {
						str1 = str1 + ch + str.charAt(index + 1) + str.charAt(index + 2);
						sum = sum + Double.parseDouble(str1);
					}
				} else if (str.charAt(index - 1) != '.') {
					sum1 = sum1 + Character.getNumericValue(ch);
				}
			}
		}
		System.out.println("sum = " + (sum + sum1));
	}

	public static void main(String[] args) {
		new DecimalSum().printSum();
	}
}
