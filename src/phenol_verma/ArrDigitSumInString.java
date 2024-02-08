/*
 
 Assignment - 43 : 4th Feb'2024
PhenolV_Assignment_49
Print names with sum of digits in the names from given array.
input Aakansha, Aas3hvi, Isha, I2sh4a4n
output : Aakansha -> 0
         Aas3hvi -> 3
		 Isha -> 0
		 I2sh4a4n -> 10
		 */
package phenol_verma;

public class ArrDigitSumInString {

	void digitSum(String arr[]) {
		int sumDigit = 0;
		for (int index = 0; index < arr.length; index++) {
			String testStr = arr[index];
			for (int chIndex = 0; chIndex < testStr.length(); chIndex++) {
				// char ch = testStr.charAt(chIndex); -- Removed to optimize the code
				if (Character.isDigit(testStr.charAt(chIndex))) {
					sumDigit = sumDigit + Character.getNumericValue(testStr.charAt(chIndex));
				}
			}
			System.out.println(testStr + " -> " + sumDigit);
			sumDigit = 0;
		}
	}

	public static void main(String[] args) {
		ArrDigitSumInString arrDigitSumInString = new ArrDigitSumInString();
		String arr[] = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n" };
		arrDigitSumInString.digitSum(arr);
	}

}
