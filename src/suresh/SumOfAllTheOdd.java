package suresh;

public class SumOfAllTheOdd {

	void getOddDigits(String input) {
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			boolean flg = Character.isDigit(ch);
			if (flg == true) {
				boolean fl = (Character.getNumericValue(ch) % 2 != 0);
				if (fl == true) {
					sum = sum + Character.getNumericValue(ch);
				}
			}

		}
		System.out.println("sum of odd digits is " + sum);

	}

	public static void main(String[] args) {
		SumOfAllTheOdd sumOfAllTheOdd = new SumOfAllTheOdd();
		sumOfAllTheOdd.getOddDigits("te3ch4noc7red8its");
		sumOfAllTheOdd.getOddDigits("te2chn6ocred8its");
	}
}
