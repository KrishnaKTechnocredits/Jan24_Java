package rohit_sutar;

/*
 * Print sum of all the odd digits in the given String.
 * input : te3ch4noc7red8its
 * output : 10
 * input : te2chn6ocred8its
 * output : 0
 */

public class Assignment28 {

	void sumOfAllOddDigits(String strInput) {
		System.out.println("Provided String is : " +strInput);
		int sum = 0;
		int storeNumbericValue;
		char ch;
		for(int i = 0 ; i < strInput.length() ; i++) {
			ch = strInput.charAt(i);
			if(Character.isDigit(ch) == true) {
				storeNumbericValue = Character.getNumericValue(ch);
				System.out.println("Digits in String : "+storeNumbericValue);
				if(storeNumbericValue % 2 != 0) {
					sum = sum + storeNumbericValue;
				}
			}
		}
		System.out.println();
		System.out.println("Addition of all Odd digits in provided string : "+sum);
	}
	
	public static void main(String[] args) {
		Assignment28 assignment28 = new Assignment28();
		assignment28.sumOfAllOddDigits("te3ch4noc7red8its");
		System.out.println();
		assignment28.sumOfAllOddDigits("te2chn6ocred8its");
	}
}
