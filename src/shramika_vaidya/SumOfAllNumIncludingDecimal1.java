package shramika_vaidya;

public class SumOfAllNumIncludingDecimal1 {

	void getSumOfAll(String str) {
		double sum1 = 0, sum = 0;
		String temp = "";
		String temp1 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '.') {
				temp1 = temp + str.charAt(i - 1) + ch + str.charAt(i + 1);
				double ans = Double.parseDouble(temp1);
				sum1 = sum1 + ans;
			} else if (Character.isDigit(ch) && str.charAt(i + 1) != '.' && str.charAt(i - 1) != '.') {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println(sum1 + sum);
	}

	public static void main(String[] args) {
		String input = "te3ch4.5noc7red8.1its";
		new SumOfAllNumIncludingDecimal1().getSumOfAll(input);
	}
}
