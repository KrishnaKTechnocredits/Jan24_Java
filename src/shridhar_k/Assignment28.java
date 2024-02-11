//Print sum of all the odd digits in the given String.
package shridhar_k;

public class Assignment28 {
	void sumOfOdd(String inputStr) {
		System.out.println("input: " + inputStr);
		int sum = 0;
		for (int index = 0; index < inputStr.length(); index++) {
			char ch1 = inputStr.charAt(index);
			boolean flag1 = Character.isDigit(ch1);
			if (flag1) {
				int characterNum = Character.getNumericValue(ch1);
				if (characterNum % 2 != 0) {
					sum = sum + characterNum;
				}
			}
		}
		System.out.println("output: " + sum);
		System.out.println("");
	}

	public static void main(String[] arg) {
		Assignment28 assignment28 = new Assignment28();
		assignment28.sumOfOdd("te3ch4noc7red8its");
		assignment28.sumOfOdd("te2chn6ocred8its");
	}

}
