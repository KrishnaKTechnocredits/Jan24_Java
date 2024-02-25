/*Assignment - 64: 16th Feb'2024
"Print the string by placing special characters at the end
input: -AasH?3v7i!
output: AasH37i-?!"*/
package madhura_kulkarni;

public class Assignment64 {

	void placingSpecialCharAtEnd(String str) {
		String temp1 = "";
		String temp2 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch) || Character.isLowerCase(ch) || Character.isDigit(ch)) {
				temp1 = temp1 + ch;
			} else {
				temp2 = temp2 + ch;
			}
		}
		System.out.println("String by placing special characters at the end : " + temp1 + temp2);
	}

	public static void main(String[] args) {
		String input = "-AasH?3v7i!";
		new Assignment64().placingSpecialCharAtEnd(input);
	}

}
