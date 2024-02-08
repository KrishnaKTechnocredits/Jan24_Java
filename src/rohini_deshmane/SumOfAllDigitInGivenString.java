package rohini_deshmane;
/*
 * Programming test - 1 : 31st Jan'2024

Print sum of all the digits in the given String.

input : te3ch4nocred8its
output : 15

input : technocredits
output : 0 
 */
public class SumOfAllDigitInGivenString {

	int printSumOfDigit(String str) {
		int sum =0;
		char ch; int chNum;
		for(int i=0; i< str.length(); i++) {
			ch = str.charAt(i);
			if(Character.isDigit(ch)==true) {
				chNum = Character.getNumericValue(ch);
				sum = sum+chNum;
			}
		}
		return sum;
	}
	
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
		SumOfAllDigitInGivenString sumOfAllDigitInGivenString = new SumOfAllDigitInGivenString();
		int sum = sumOfAllDigitInGivenString.printSumOfDigit("te3ch4nocred8its");
		System.out.println("Sum of digi in given string te3ch4nocred8its = "+ sum);
		sum = sumOfAllDigitInGivenString.printSumOfDigit("technocredits");
		System.out.println("Sum of digi in given string technocredits = "+ sum);
		int sumOfEven = sumOfAllDigitInGivenString.printSumOfEvenDigits("te3ch4nocred8its");
		System.out.println("Sum of Even digi in given string te3ch4nocred8its = "+ sumOfEven);
		int sumOfOdd = sumOfAllDigitInGivenString.printSumOfOddDigits("te3ch4nocred8its");
		System.out.println("Sum of Odd digi in given string te3ch4nocred8its = "+ sumOfOdd);
		
	}
}
