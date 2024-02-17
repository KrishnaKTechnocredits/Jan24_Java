package akshada_marne;

public class SumOfSquare {

	void squareSum(String str) {
		int num = 0;
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch) == true && ch % 2 != 0) {
				num = Character.getNumericValue(ch);
				sum = sum + (num * num);
			}
		}
		System.out.println(sum);
	}

	public static void main(String args[]) {
		SumOfSquare sumOfSquare = new SumOfSquare();
		sumOfSquare.squareSum("te3ch4noc7red8its");
	}
}
