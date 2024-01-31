package ankita_s;

public class SumOfDigits {

	void printSumOfDigits(String str) {
		int sum = 0;
		{
			for (int index = 0; index < str.length(); index++) {
				char ch = str.charAt(index);
				boolean temp = Character.isDigit(ch);
				if (temp == true) {
					sum = sum + Character.getNumericValue(ch);
				}
			}
			System.out.println("Total sum :" + sum);
		}
	}

	public static void main(String[] args) {
		SumOfDigits SumOfDigits = new SumOfDigits();
		SumOfDigits.printSumOfDigits("te3ch4nocred8its");
		SumOfDigits.printSumOfDigits("technocredits");
	}
}
