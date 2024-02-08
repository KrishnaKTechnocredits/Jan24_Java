/*Assignment - 41 : 4th Feb'2024
PhenolV_Assignment_47
Print all the names from given array having more than 2 digits
input : {"Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha"}
output : Is45ha
         I2sh4a4n*/

package phenol_verma;

public class ArrStrWith2Digit {
	void strWith2Dgt(String arr[]) {
		int digitCount = 0;
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			for (int strIndex = 0; strIndex < str.length(); strIndex++) {
				char ch = str.charAt(strIndex);
				if (Character.isDigit(ch)) {
					digitCount++;
				}
				if (digitCount == 2) {
					System.out.println(arr[index]);
					break;
				}
			}
			digitCount = 0;
		}
	}

	public static void main(String[] args) {
		ArrStrWith2Digit arrStrWith2Digit = new ArrStrWith2Digit();
		String arr[] = { "Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha" };
		arrStrWith2Digit.strWith2Dgt(arr);
	}

}
