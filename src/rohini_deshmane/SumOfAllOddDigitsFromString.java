package rohini_deshmane;
/*
 * Assignment - 28 : 31st Jan'2024

Print sum of all the odd digits in the given String.

input : te3ch4noc7red8its
output : 10

input : te2chn6ocred8its
output : 0
 */
public class SumOfAllOddDigitsFromString {
	
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
		SumOfAllOddDigitsFromString oddDigitSum = new SumOfAllOddDigitsFromString();
		int sum = oddDigitSum.printSumOfOddDigits("te3ch4noc7red8its");
		System.out.println(sum);	
		sum = oddDigitSum.printSumOfOddDigits("te2chn6ocred8its");
		System.out.println(sum);
	}
}
