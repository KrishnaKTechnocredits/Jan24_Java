/*
 * Assignment - 40 : 4th Feb'2024
PhenolV_Assignment_46
Print all the names from given array which should start with vowel and atleast have one digit.
input : {"Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha"}
output : Aas3hvi
         I2sh4a4n
         */
package phenol_verma;

public class ArrStrVowal1Digit {
	void strVowal1Digit(String arr[]) {
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index].toLowerCase();
			char frstChar = str.charAt(0);
			if (frstChar == 'a' || frstChar == 'e' || frstChar == 'i' || frstChar == 'o' || frstChar == 'u') {
				for (int strIndex = 0; strIndex < str.length(); strIndex++) {
					char ch = str.charAt(strIndex);
					if (Character.isDigit(ch)) {
						System.out.println(arr[index]);
						break;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		ArrStrVowal1Digit arrStrVowal1Digit = new ArrStrVowal1Digit();
		String arr[] = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha" };
		arrStrVowal1Digit.strVowal1Digit(arr);

	}
}
