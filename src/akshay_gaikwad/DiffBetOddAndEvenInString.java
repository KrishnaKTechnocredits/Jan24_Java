package akshay_gaikwad;

public class DiffBetOddAndEvenInString {
	void diffBetOddAndEvenInString(String input) {
		int oddSum = 0;
		int evenSum = 0;
		for (int index = 0 ; index < input.length() ; index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				int chValue = Character.getNumericValue(ch);
				if (chValue % 2 == 0) {
					evenSum += chValue;
				}else {
					oddSum += chValue;
				}
			}
		}
		if(oddSum > evenSum) {
			System.out.println("Difference between Odd and Even digits in " + input + " is : " + (oddSum - evenSum));
		}else {
			System.out.println("Difference between Even and Odd digits in " + input + " is : " + (evenSum - oddSum));
		}
	}
	public static void main(String[] args) {
		new DiffBetOddAndEvenInString().diffBetOddAndEvenInString("te3ch4noc7re9d8its");
	}
}
