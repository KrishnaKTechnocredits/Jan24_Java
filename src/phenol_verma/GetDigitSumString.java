/*Programming test - 1 : 31st Jan'2024

Print sum of all the digits in the given String.

input : te3ch4nocred8its
output : 15

input : technocredits
output : 0

Programming-Test : 1, PR #123, 20 mins*/

package phenol_verma;

public class GetDigitSumString {
	void getSumOfDigit(String str) {
		int digitSum = 0;
		int digitSumOddNum = 0;
		int digitSumEvenNum = 0;

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				digitSum = digitSum + Character.getNumericValue(ch);
				if (Character.getNumericValue(ch) % 2 != 0) 
					digitSumOddNum = digitSumOddNum + Character.getNumericValue(ch);
				else
					digitSumEvenNum = digitSumEvenNum + Character.getNumericValue(ch);
				
			}
		}
		System.out.println("Sum of digits in String is " + digitSum);
		System.out.println("Sum of odd digits in String is " + digitSumOddNum);
		System.out.println("Sum of even digits in String is " + digitSumEvenNum);


	}
	
	public static void main(String[] args) {
		GetDigitSumString getDigitSumString = new GetDigitSumString();
		getDigitSumString.getSumOfDigit("te3ch4nocred8its");
	}

}
