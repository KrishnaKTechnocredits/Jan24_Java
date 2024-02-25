/*
 Assignment - 65 :  16th Feb'2024
"Remove digits and whitespace characters:
input: H2i H3el4lo P4un2e5
output: HiHelloPune"
 */
package puja_poreddiwar;

public class Assignment65RemvDigitsSpace {

	String str1 = "";

	void printStrWithoutDigitsSpace(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isDigit(ch) && ch != ' ') {
				str1 += ch;
			}
		}
		System.out.println(str1);
	}

	public static void main(String[] args) {
		String str = "H2i H3el4lo P4un2e5";
		new Assignment65RemvDigitsSpace().printStrWithoutDigitsSpace(str);
	}
}
