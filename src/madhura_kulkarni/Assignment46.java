/*Assignment - 46 : 4th Feb'2024
Rearrange a string in a way having all digits first followed by Uppercase followed by lowercase.
 
input :-AasH3v7i
output:-37AHsvi*/

package madhura_kulkarni;

public class Assignment46 {

	public static void main(String[] args) {
		String S = "AasH3v7i";
		new Assignment46().printString(S);

	}

	void printString(String str) {
		System.out.println("Input string is: " + str);
		String upperCase = "";
		String lowerCase = "";
		String digit = "";
		String answer = "";
		System.out.println(
				"Rearranging a string in a way having all digits first followed by Uppercase followed by lowercase :");
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch) == true)
				upperCase = upperCase + ch;
			else if (Character.isLowerCase(ch) == true)
				lowerCase = lowerCase + ch;
			else if (Character.isDigit(ch) == true)
				digit = digit + ch;

		}
		answer = digit + upperCase + lowerCase;
		System.out.println(answer);
	}
}
