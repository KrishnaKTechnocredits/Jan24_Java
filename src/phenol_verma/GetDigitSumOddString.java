/*Assignment - 28 : 31st Jan'2024

Print sum of all the odd digits in the given String.

input : te3ch4noc7red8its
output : 10

input : te2chn6ocred8its
output : 0*/

package phenol_verma;

public class GetDigitSumOddString {
	void getSumOfDigit(String str) {
		int digitSumOddNum = 0;

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				if (Character.getNumericValue(ch) % 2 != 0) 
					digitSumOddNum = digitSumOddNum + Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of odd digits in String is " + digitSumOddNum);
	}
	
	public static void main(String[] args) {
		GetDigitSumOddString getDigitSumOddString = new GetDigitSumOddString();
		getDigitSumOddString.getSumOfDigit("te3ch4nocred8its");
	}

}
