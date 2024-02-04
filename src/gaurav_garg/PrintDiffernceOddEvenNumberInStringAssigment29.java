package gaurav_garg;

public class PrintDiffernceOddEvenNumberInStringAssigment29 {
	int sum1, sum2;

	void printOddEvenDigitDiffernce(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			boolean answer = Character.isDigit(c);

			if (answer == true) {
				int numb1 = Character.getNumericValue(c);

				if (numb1 % 2 == 1) {
					sum1 = sum1 + numb1;
				}
				if (numb1 % 2 == 0) {
					sum2 = sum2 + numb1;
				}
			}
		}
		System.out.print(sum1 - sum2);
	}

	public static void main(String[] args) {
		new PrintDiffernceOddEvenNumberInStringAssigment29().printOddEvenDigitDiffernce("te3ch4noc7re9d8its");
	}
}
