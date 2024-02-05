package rohini_deshmane;
/*
 * Assignment - 44 : 4th Feb'2024

Print names with sum of digits in the names from given array.

input Aakansha, Aas3hvi, Isha, I2sh4a4n
output : Aakansha -> 0
         Aas3hvi -> 3
		 Isha -> 0
		 I2sh4a4n -> 10
 */
public class SumOfDigitsFromArrayString {

	int sumOfDigits(String str) {
		int sum=0;
		for(int i=0; i<str.length(); i++) {
			char digitCh = str.charAt(i);
			if(Character.isDigit(digitCh)) {
				int digit = Integer.parseInt(String.valueOf(digitCh));
				sum=sum+digit;
			}
		}
		return sum;
	}
	
	void printStringWithDigitSum(String[] arr) {
		for(int i=0; i<arr.length; i++) {
			int sum = sumOfDigits(arr[i]);
			System.out.println(arr[i]+" -->  "+sum);
		}
	}
	
	public static void main(String[] args) {
		SumOfDigitsFromArrayString sumOfDigitsFromArrayString = new SumOfDigitsFromArrayString();
		String[] arr= {"Aakansha", "Aas3hvi", "Isha", "I2sh4a4n"};
		sumOfDigitsFromArrayString.printStringWithDigitSum(arr);
	}
}
