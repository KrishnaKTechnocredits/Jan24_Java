package akshay_gaikwad;

public class SumOfDigitsInStringArray {
	void printSumOfDigitInString(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			System.out.println(str + " -> " + getSumOfDigitInStr(str));
		}
	}
	
	int getSumOfDigitInStr(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		String [] arr = {"Aakansha", "Aas3hvi", "Isha", "I2sh4a4n"};
		new SumOfDigitsInStringArray().printSumOfDigitInString(arr);
		
	}
}
