/*Assignment - 42 : 4th Feb'2024

Print all the names from given array having 2 or more than 2 digits

input : {"Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha"}
output : Is45ha
         I2sh4a4n  --------------------------------------------------------------------------*/

package pallavi_raut;

class FindNamesWithDigitsInArray {

	public static void main(String[] args) {
		String[] arr = { "Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha" };
		FindNamesWithDigitsInArray findNamesWithDigitsInArray = new FindNamesWithDigitsInArray();
		findNamesWithDigitsInArray.printNameWithDigitsInArray(arr);
	}

	void printNameWithDigitsInArray(String[] str) {
		for (int index = 0; index < str.length; index++) {
			if (isDigitNumber(str[index]) == true) {
				System.out.println(str[index]);
			}
		}
	}

	boolean isDigitNumber(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			boolean flag = Character.isDigit(str.charAt(i));
			if (flag == true) {
				count++;
			}
		}
		if (count >= 2) {
			return true;
		}
		return false;
	}
}