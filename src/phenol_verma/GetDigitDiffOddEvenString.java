/*Assignment - 29 : 31st Jan'2024

Print difference between sum of all the odd digits and even digits in the given String.

input : te3ch4noc7re9d8its
output : 7

hint : 19 - 12 = 7*/

package phenol_verma;

public class GetDigitDiffOddEvenString {
	void getSumOfDigit(String str) {
		int digitSumOddNum = 0;
		int digitSumEvenNum = 0;
		int difference = 0;

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				if (Character.getNumericValue(ch) % 2 != 0) 
					digitSumOddNum = digitSumOddNum + Character.getNumericValue(ch);
				else
					digitSumEvenNum = digitSumEvenNum + Character.getNumericValue(ch);
			}
			difference = digitSumOddNum - digitSumEvenNum;
		}
		System.out.println("Sum of odd digits in String is " + digitSumOddNum);
		System.out.println("Sum of even digits in String is " + digitSumEvenNum);
		System.out.println("Difference between odd and even digits is  " + difference);
	}
	
	public static void main(String[] args) {
		GetDigitDiffOddEvenString getDigitDiffOddEvenString = new GetDigitDiffOddEvenString();
		getDigitDiffOddEvenString.getSumOfDigit("te3ch4nocred8its");
	}

}
