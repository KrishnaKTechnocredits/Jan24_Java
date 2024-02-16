package samiksha;

public class SquareSum {

	void printSumOfSquare() {
		String str = "te3ch4noc7red8its";
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				if (ch % 2 != 0) {
					int c = Character.getNumericValue(ch);
					sum = sum + (c * c);
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new SquareSum().printSumOfSquare();
	}
}
