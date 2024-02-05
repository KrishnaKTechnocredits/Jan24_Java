package kanchan_ghuge;

class Assignment28 { // done
	int sum = 0;

	void printSumOfOddDigit(String input) {

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				int num = Character.getNumericValue(ch);
				if (num % 2 == 1) {
					sum = sum + num;
				}
			}
		}
		System.out.println("sum of digit = " + sum);
	}

	public static void main(String[] args) {
		new Assignment28().printSumOfOddDigit("te3ch4noc7red8its");
		new Assignment28().printSumOfOddDigit("te2chn6ocred8its");
	}
}
