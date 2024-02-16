package rohini_deshmane.string_programs;
/*
 * Assignment - 62 : 16th Feb'2024
"Print sum of numbers and Handle decimal numbers too:
input: te3ch4.5noc7red8.1its
output: 22.6
hint: 3 + 4.5 + 7 + 8.1"
 */

public class SumOfDigitWithDecimalNumbersToo {
	
	String getDecimalDigitFromString(String str, int index) {
		String digitStr ="";
		for(int i=index; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				digitStr = digitStr+Character.toString(str.charAt(i));
			} else if(!Character.isDigit(str.charAt(i)))
					break;
		}
		return digitStr;
	}

	double findSumOfNumbers(String str) {
		double sum=0;
		String digit="";
		for(int i=0; i<str.length();) {
			if(Character.isDigit(str.charAt(i))) {
				if(str.charAt(i+1) =='.') {
					digit = str.charAt(i)+"."+getDecimalDigitFromString(str, i+2);
				}
				int cnt = digit.length();
				i=i+cnt;
				//sum = sum + Double.parseDouble(Character.toString(str.charAt(i)));
			}
			else
				i++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		SumOfDigitWithDecimalNumbersToo sumOfNegativeNumber = new SumOfDigitWithDecimalNumbersToo();
		double sum = sumOfNegativeNumber.findSumOfNumbers("te3ch4.5noc7red8.1its");
		System.out.println("Sum Of number = "+sum);
		System.out.println("\n");
		sum = sumOfNegativeNumber.findSumOfNumbers("te3.67ch4noc7r4.7ed0.8its");
		System.out.println("Sum Of number = "+sum);
	}
}
