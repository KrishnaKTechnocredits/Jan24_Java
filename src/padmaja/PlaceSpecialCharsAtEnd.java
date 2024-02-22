/*Assignment - 64: 16th Feb'2024
"Print the string by placing special characters at the end
input: -AasH?3v7i!
output: AasH37i-?!" */

package padmaja;

public class PlaceSpecialCharsAtEnd {

	void printSpecialCharsAtEnd(String str) {
		String str1 = "";
		String str2 = "";
		String finalstr = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (!Character.isLowerCase(ch) && !Character.isUpperCase(ch) && !Character.isDigit(ch))
				str2 = str2 + ch;
			else
				str1 = str1 + ch;
		}
		finalstr = str1 + str2;
		System.out.println(finalstr);
	}

	public static void main(String[] args) {
		PlaceSpecialCharsAtEnd placeSpecialCharsAtEnd = new PlaceSpecialCharsAtEnd();
		placeSpecialCharsAtEnd.printSpecialCharsAtEnd("-AasH?3v7i!");
	}
}
