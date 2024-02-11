//Assignment - 48 : 4th Feb'2024
//Return the string extracting all the digits & special characters from it. 
//input :- Aas-H3v7i
//output:- -37

package prathamesh_tati;

public class ExtractDigitsAndSpecialChars {
	String str = "";

	void getDigitsAndSpecialChars(String input) {

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (!Character.isUpperCase(ch) && !Character.isLowerCase(ch))
				str = str + ch;
		}
		System.out.println("All the digits & special characters from given String is " + str);
	}

	public static void main(String[] args) {
		ExtractDigitsAndSpecialChars extractDigitsAndSpecialChars = new ExtractDigitsAndSpecialChars();
		String input = "Aas-H3v7i";
		extractDigitsAndSpecialChars.getDigitsAndSpecialChars(input);
	}
}