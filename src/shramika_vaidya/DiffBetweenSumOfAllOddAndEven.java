package shramika_vaidya;

class DiffBetweenSumOfAllOddAndEven {

	void getDifferance(String str) {
		int count = 0;
		int oddNumSum = 0;
		int evenNumSum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				if (num % 2 != 0) {
					count++;
					oddNumSum = oddNumSum + num;
				} else if (num % 2 == 0) {
					count++;
					evenNumSum = evenNumSum + num;
				}
			}
		}
		System.out.println((oddNumSum - evenNumSum));
	}

	public static void main(String[] args) {
		DiffBetweenSumOfAllOddAndEven diffBetweenSumOfAllOddAndEven = new DiffBetweenSumOfAllOddAndEven();
		diffBetweenSumOfAllOddAndEven.getDifferance("te3ch4noc7re9d8its");
	}
}
