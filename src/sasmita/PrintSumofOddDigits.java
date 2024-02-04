package sasmita;

public class PrintSumofOddDigits {

	void sumOfOddDigits(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int charV = Character.getNumericValue(ch);
			if (Character.isDigit(ch)) {
				if (charV % 2 != 0) {
					sum +=charV;
				}
			}

		}
		System.out.println("Sum of all odd digits in " + str + "is :" + sum);
	}

	public static void main(String[] args) {
		PrintSumofOddDigits printsumOfOdd = new PrintSumofOddDigits();
		printsumOfOdd.sumOfOddDigits("te3ch4noc7red8its");
		printsumOfOdd.sumOfOddDigits("te2chn6ocred8its");
	}
}
