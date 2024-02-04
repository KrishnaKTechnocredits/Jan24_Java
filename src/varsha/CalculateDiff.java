package varsha;

public class CalculateDiff {

	void printSumofDigit(String text) {
		int sum1 = 0;
		int sum2 = 0;
		int diff = 0;
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (Character.isDigit(ch)) {
				if (ch % 2 == 0)
					sum1 = sum1 + Character.getNumericValue(ch);
				else
					sum2 = sum2 + Character.getNumericValue(ch);
			}
		}
		diff = sum2 - sum1;
		System.out.println("different between even & odd num in given string : " + diff);
	}

	public static void main(String[] args) {
		CalculateDiff calculateDiff = new CalculateDiff();
		calculateDiff.printSumofDigit("te3ch4noc7re9d8its");
	}

}
