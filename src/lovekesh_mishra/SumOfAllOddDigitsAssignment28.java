package lovekesh_mishra;

class SumOfAllOddDigitsAssignment28 {

	void sum(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			boolean isflag = Character.isDigit(ch);
			if (ch % 2 != 0) {

				if (isflag == true)
					sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("output is---> " + sum);
	}

	void sum2(String str) {

	}

	public static void main(String[] args) {
		SumOfAllOddDigitsAssignment28 sumOfAllOddDigits = new SumOfAllOddDigitsAssignment28();
		sumOfAllOddDigits.sum("te3ch4noc7red8its");
		sumOfAllOddDigits.sum("te2chn6ocred8its");
	}

}