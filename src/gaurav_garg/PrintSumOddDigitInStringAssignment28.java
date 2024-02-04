package gaurav_garg;

public class PrintSumOddDigitInStringAssignment28 {
	int sum;

	void printSumOddDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			char char1 = str.charAt(i);
			boolean answer = Character.isDigit(char1);

			if (answer == true) {
				int num = Character.getNumericValue(char1);
				if (char1 % 2 == 1) {
					sum = sum + num;
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new PrintSumOddDigitInStringAssignment28().printSumOddDigit("te3ch4noc7red8its");
		new PrintSumOddDigitInStringAssignment28().printSumOddDigit("te2chn6ocred8its");
	}
}
