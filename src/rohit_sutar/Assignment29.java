package rohit_sutar;

/*
 * Print difference between sum of all the odd digits and even digits in the given String.
 * input : te3ch4noc7re9d8its
 * output : 7
 * hint : 19 - 12 = 7
 */

public class Assignment29 {

	void findDifference(String strInput) {
		int evenSum = 0;
		int oddSum = 0;
		int storeNumericValue1, storeNumericValue2, difference;
		char ch;
		
		//to find sum of even numbers in a string
		for(int i = 0 ; i < strInput.length() ; i++) {
			ch = strInput.charAt(i);
			if(Character.isDigit(ch) == true) {
				storeNumericValue1 = Character.getNumericValue(ch);
				if(storeNumericValue1 % 2 != 0) {
					evenSum = storeNumericValue1 + evenSum;
				}
			}
		}
		System.out.println("Addition of Odd Numbers : "+evenSum);
		
		//to find sum of odd numbers in a string
		for(int i = 0 ; i < strInput.length() ; i++) {
			ch = strInput.charAt(i);
			if(Character.isDigit(ch) == true) {
				storeNumericValue2 = Character.getNumericValue(ch);
				if(storeNumericValue2 % 2 == 0) {
					oddSum = storeNumericValue2 + oddSum;
				}
			}
		}
		System.out.println("Addition of Even numbers : "+oddSum);
		difference = evenSum - oddSum;
		System.out.println(difference);
	}
	
	public static void main(String[] args) {
		Assignment29 assignment29 = new Assignment29();
		assignment29.findDifference("te3ch4noc7re9d8its");
		//assignment29.findDifference("te3ch4noc7re9d8its");
	}
}
