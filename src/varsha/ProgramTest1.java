package varsha;

public class ProgramTest1 {

	void printSumOfDigit(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of numberic value in given string is : " + sum);
	}

	public static void main(String[] args) {
		new ProgramTest1().printSumOfDigit("te3ch4nocred8its");
	}

}
