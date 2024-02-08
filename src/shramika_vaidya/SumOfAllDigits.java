package shramika_vaidya;

class SumOfAllDigits {

	void printSumOfAllDigits(String str) {
		int count = 0;
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				count++;
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		SumOfAllDigits sumOfAllDigits = new SumOfAllDigits();
		sumOfAllDigits.printSumOfAllDigits("te3ch4nocred8its");
		sumOfAllDigits.printSumOfAllDigits("technocredits");
	}
}
