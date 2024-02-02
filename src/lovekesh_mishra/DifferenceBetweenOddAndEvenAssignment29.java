package lovekesh_mishra;

class DifferenceBetweenOddAndEvenAssignment29 {

	void difference(String input) {
		int sum1 = 0;
		int sum2 = 0;
		int diff = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			boolean isflag = Character.isDigit(ch);
			if (isflag == true) {
				if (ch % 2 == 0) {
					sum1 = sum1 + Character.getNumericValue(ch);
				}
				if (ch % 2 != 0) {
					sum2 = sum2 + Character.getNumericValue(ch);
				}

			}
			diff = sum2 - sum1;
		}
		System.out.println("output is ----> " + diff);
	}

	public static void main(String[] args) {
		DifferenceBetweenOddAndEvenAssignment29 differenceOf = new DifferenceBetweenOddAndEvenAssignment29();
		differenceOf.difference("te3ch4noc7re9d8its");

	}

}
