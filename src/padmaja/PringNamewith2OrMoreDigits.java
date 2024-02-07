/*Assignment - 42 : 4th Feb'2024

Print all the names from given array having 2 or more than 2 digits

input : {"Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha"}
output : Is45ha
         I2sh4a4n
         */

package padmaja;

public class PringNamewith2OrMoreDigits {

	int digitsCount(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch) == true)
				count++;
		}
		return count;
	}

	void printString(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			int count = digitsCount(str);
			if (count >= 2)
				System.out.println(str);
		}
	}

	public static void main(String[] args) {
		String[] input = { "Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha" };
		PringNamewith2OrMoreDigits print = new PringNamewith2OrMoreDigits();
		print.printString(input);
	}
}
