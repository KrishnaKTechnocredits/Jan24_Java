
/*Assignment - 42 : 4th Feb'2024

Print all the names from given array having 2 or more than 2 digits

input : {"Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha"}
output : Is45ha
         I2sh4a4n*/

package sarang_kulkarni;

public class NamesWith2OrMorethan2Digits {

	void printStringHavingDigitMoreThan2(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			int count = getFreqOfDigitsInString(arr[index]);
			if (count > 1) {
				System.out.println(arr[index]);
			}
		}
	}

	int getFreqOfDigitsInString(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String[] arr = { "Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha" };
		new NamesWith2OrMorethan2Digits().printStringHavingDigitMoreThan2(arr);
	}
}
