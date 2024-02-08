package shramika_vaidya;

class SumOfAllOddDigits {

	void printSumOfAllOddDigits(String str) {
		int count = 0;
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				if (num % 2 != 0) {
					count++;
					sum = sum + num;
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		SumOfAllOddDigits sumOfAllOddDigits = new SumOfAllOddDigits();
		sumOfAllOddDigits.printSumOfAllOddDigits("te3ch4noc7red8its");
		sumOfAllOddDigits.printSumOfAllOddDigits("te2chn6ocred8its");
	}
}
