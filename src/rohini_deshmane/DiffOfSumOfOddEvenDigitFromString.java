package rohini_deshmane;

public class DiffOfSumOfOddEvenDigitFromString {
	
	int printSumOfEvenDigits(String str) {
		int sum =0, chNum;
		char ch;
		for(int i=0; i<str.length();i++) {
			ch = str.charAt(i);
			if(Character.isDigit(ch)==true) {
				chNum = Character.getNumericValue(ch);
				if(chNum %2 == 0) {
					sum = sum+chNum;
				}
			}
		}
		return sum;
	}

	int printSumOfOddDigits(String str) {
		int sum =0, chNum;
		char ch;
		for(int i=0; i<str.length();i++) {
			ch = str.charAt(i);
			if(Character.isDigit(ch)==true) {
				chNum = Character.getNumericValue(ch);
				if(chNum %2 != 0) {
					sum = sum+chNum;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		DiffOfSumOfOddEvenDigitFromString oddEvenSumDiff = new DiffOfSumOfOddEvenDigitFromString();
		int evenSum = oddEvenSumDiff.printSumOfEvenDigits("te3ch4noc7re9d8its");
		int oddSum = oddEvenSumDiff.printSumOfOddDigits("te3ch4noc7re9d8its");
		System.out.println("Difference between even and odd = "+ (oddSum - evenSum));
	}
}
