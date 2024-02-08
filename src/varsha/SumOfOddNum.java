package varsha;

public class SumOfOddNum {

	void printSumofDigit(String text) {
		int sum = 0;
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (Character.isDigit(ch)) {
				if (ch % 2 != 0)
					sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of numberic value in given string is : " + sum);
	}

	public static void main(String[] args) {
		SumOfOddNum sumOfOddNum = new SumOfOddNum();
		sumOfOddNum.printSumofDigit("te3ch4noc7red8its");
		sumOfOddNum.printSumofDigit("te2chn6ocred8its");
	}

}
