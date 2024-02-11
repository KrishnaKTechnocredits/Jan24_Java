/*Assignment - 48 : 4th Feb'2024
Return the string extracting all the digits & special characters from it. 

input :- Aas-H3v7i
output:- -37

hint
if(Character.isUpperCase(ch) || Character.isLowerCase(ch))
	str = str + ch;
	*/

package padmaja;

public class StringExtractingDigitsAndSpecialChars {
	void printString(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (!Character.isUpperCase(ch) && !Character.isLowerCase(ch))
				output = output + ch;
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		StringExtractingDigitsAndSpecialChars s1 = new StringExtractingDigitsAndSpecialChars();
		s1.printString("Aas-H3v7i");
	}
}
