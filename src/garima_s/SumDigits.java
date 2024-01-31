package garima_s;

public class SumDigits {

	void printCharacter(String str) {
		int sum = 0;
		int value = 0;
		System.out.print("Sum of Digits of " + str + " : ");
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				value = Character.getNumericValue(ch);
				sum = sum + value;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		SumDigits sumDigits = new SumDigits();
		sumDigits.printCharacter("te3ch4nocred8its");
		sumDigits.printCharacter("Technocredits");

	}
}