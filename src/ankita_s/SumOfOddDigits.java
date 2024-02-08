package ankita_s;

public class SumOfOddDigits {

	void printSumOfOddDigits(String str) {
		int sum = 0;
		{
			for (int index = 0; index < str.length(); index++) {
				char ch = str.charAt(index);
				boolean temp = Character.isDigit(ch);
				int temp1 = Character.getNumericValue(ch);
				if (temp == true && temp1 % 2 != 0) {
					sum = sum + temp1;
				}
			}
			System.out.println("sum of odd num:- " + sum);
		}
	}

	public static void main(String[] args) {
		SumOfOddDigits sumOfOddDigits = new SumOfOddDigits();
		sumOfOddDigits.printSumOfOddDigits("te3ch4noc7red8its");
		sumOfOddDigits.printSumOfOddDigits("te2chn6ocred8its");
	}
}
