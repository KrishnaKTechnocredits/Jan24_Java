/*
 	Assignment - 62 : 16th Feb'2024
 	PhenolV_Assignment_67
Print the string by placing special characters at the end
input: -AasH?3v7i!
output: AasH37i-?!
 * 
 * 
 */
package phenol_verma;

public class StrPlaceSpclCharAtEnd {
	String strLetter = "";
	String strSplChar = "";

	void placeSpclCharAtLast(String str) {
		for (int index = 0; index < str.length(); index++) {
			char chr = str.charAt(index);
			if (Character.isLetterOrDigit(chr)) {
				strLetter = strLetter + Character.toString(chr);
			} else {
				strSplChar = strSplChar + Character.toString(chr);
			}
		}
		str = strLetter + strSplChar;
		System.out.println("Out string where special charater at the last - " + str);
	}

	public static void main(String[] args) {
		StrPlaceSpclCharAtEnd strPlaceSpclCharAtEnd = new StrPlaceSpclCharAtEnd();
		String str = "-AasH?3v7i!";
		System.out.println("Original String - " + str);
		strPlaceSpclCharAtEnd.placeSpclCharAtLast(str);

	}

}
