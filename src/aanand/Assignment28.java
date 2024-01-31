package aanand;

public class Assignment28 {
	int sum;

	int sumOfOddDigitsFromString(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				int digit = Character.getNumericValue(ch);
				if (digit % 2 != 0) {
					sum = sum + digit;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment28 assignment28 = new Assignment28();
		int output = assignment28.sumOfOddDigitsFromString("te3ch4noc7red8its");
		System.out.println(output);
	}
}
