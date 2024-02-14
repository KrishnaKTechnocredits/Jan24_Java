package kanchan_ghuge;

/*Assignment - 43 : 4th Feb'2024

Print all the names from given array having atleast one special character.

input : {"Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha"}
output : Aaka$nsha
         Aas-hvi
         Var#s-ha  */

class Assignment43 {

	boolean specialChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (!Character.isAlphabetic(ch) && !Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}

	void printString(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			if (specialChar(arr[index])) {
				System.out.println(arr[index]);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha" };
		new Assignment43().printString(arr);
	}
}
