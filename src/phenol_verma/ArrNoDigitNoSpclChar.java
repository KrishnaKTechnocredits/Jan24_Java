/*
Assignment - 47 : 4th Feb'2024
PhenolV_Assignment_53
Return the string extracting all the digits & special characters from it. 
input :- String arr[] = { "AasH@3v7i", "Aaka2n&$s5ha", "I2sh(^4a4n", "Aa&$#s3hvi" };

output:- AasHvi
Aakansha
Ishan
Aashvi


hint
if(Character.isUpperCase(ch) || Character.isLowerCase(ch))
	str = str + ch;
 */

package phenol_verma;

public class ArrNoDigitNoSpclChar {

	void removeDigit(String arr[]) {
		String finalStringWODigit = "";
		String finalStringWOSPlCharDigit = "";

		for (int index = 0; index < arr.length; index++) {
			String testStr = arr[index];
			//For loop to remove digits
			for (int chIndex = 0; chIndex < testStr.length(); chIndex++) {
				if (!Character.isDigit(testStr.charAt(chIndex))) {
					finalStringWODigit = finalStringWODigit + testStr.charAt(chIndex);
				}
			}
			//For loop to remove special characters
			for (int chIndex = 0; chIndex < finalStringWODigit.length(); chIndex++) {
				if (Character.isLetterOrDigit(finalStringWODigit.charAt(chIndex))) {
					finalStringWOSPlCharDigit = finalStringWOSPlCharDigit + finalStringWODigit.charAt(chIndex);
				}
			}
			System.out.println(finalStringWOSPlCharDigit);
			finalStringWODigit = "";
			finalStringWOSPlCharDigit = "";
		}
	}

	public static void main(String[] args) {
		ArrNoDigitNoSpclChar arrNoDigitNoSpclChar = new ArrNoDigitNoSpclChar();
		String arr[] = { "AasH@3v7i", "Aaka2n&$s5ha", "I2sh(^4a4n", "Aa&$#s3hvi" };
		arrNoDigitNoSpclChar.removeDigit(arr);
	}
}
