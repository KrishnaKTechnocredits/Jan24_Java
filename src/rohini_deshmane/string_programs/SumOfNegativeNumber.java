package rohini_deshmane.string_programs;
/*
 * Assignment - 65 : 16th Feb'2024

"Print sum of negative numbers:
input: te-3ch4noc7red-8its
output: -11"
 */

public class SumOfNegativeNumber {
	
	String getDigitFromString(String str, int index) {
		String digitStr ="";
		for(int i=index; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				digitStr = digitStr+Character.toString(str.charAt(i));
			} else if(!Character.isDigit(str.charAt(i)))
					break;
		}
		return digitStr;
	}

	double findSumOfNegativeNo(String str) {
		double sum=0;
		String digit;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '-') {
				digit = "-"+getDigitFromString(str, i+1);
				System.out.println(digit);
				sum = sum + Double.parseDouble(digit);
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		SumOfNegativeNumber sumOfNegativeNumber = new SumOfNegativeNumber();
		double sum = sumOfNegativeNumber.findSumOfNegativeNo("te-3ch4noc7red-8its");
		System.out.println("Sum Of Negative number = "+sum);
		System.out.println("\n");
		sum = sumOfNegativeNumber.findSumOfNegativeNo("te-367ch4noc7r-47ed-8its");
		System.out.println("Sum Of Negative number = "+sum);
	}
}
