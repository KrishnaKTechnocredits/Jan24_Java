/*Assignment - 48 : 4th Feb'2024
Return the string extracting all the digits & special characters from it. 

input :- Aas-H3v7i
output:- -37*/

package madhura_kulkarni;

public class Assignment48 {

	public static void main(String[] args) {
		String S = "Aas-H3v7i";
		new Assignment48().printString(S);

	}

	void printString(String str) {
		System.out.println("Input string is: " + str);
		String answer = "";
		System.out.println("Output string after extracting digits & special characters from it :");
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch) == false && Character.isLowerCase(ch) == false)
				answer = answer + ch;
		}
		System.out.println(answer);
	}
}
