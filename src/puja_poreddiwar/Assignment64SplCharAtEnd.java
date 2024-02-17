/*
 * Assignment - 64: 16th Feb'2024
"Print the string by placing special characters at the end
input: -AasH?3v7i!
output: AasH37i-?!
 */

package puja_poreddiwar;

public class Assignment64SplCharAtEnd {

	String str1 = "";
	String str2 = "";
	String temp = "";

	void printSplCharAtEnd(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch) == true || Character.isLetter(ch) == true) {
				str1 += ch;
			} else if (Character.isDigit(ch) == false || Character.isLetter(ch) == true) {
				str2 += ch;
			}
			temp = str1 + str2;
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		String str = "-AasH?3v7i!";
		new Assignment64SplCharAtEnd().printSplCharAtEnd(str);
	}
}
