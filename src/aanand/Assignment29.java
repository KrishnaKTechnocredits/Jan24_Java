package aanand;

public class Assignment29 {
	int differeceInOddEven;

	int diffBetweenSumOfOddAndEven(String str) {
		int oddSum = 0;
		int evenSum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				int digit = Character.getNumericValue(ch);
				if (ch % 2 == 0) {
					evenSum = evenSum + digit;
				} else {
					oddSum = oddSum + digit;
				}
			}
		}
		System.out.println("Sum of even numbers: " + evenSum);
		System.out.println("Sum of odd numbers: " + oddSum);
		differeceInOddEven = oddSum - evenSum;
		return differeceInOddEven;
	}

	public static void main(String[] args) {
		Assignment29 assignment29 = new Assignment29();
		int output = assignment29.diffBetweenSumOfOddAndEven("te3ch4noc7re9d8its");
		System.out.println("Differenec between sum of Odd and even numbers in string" + output);
	}
}
