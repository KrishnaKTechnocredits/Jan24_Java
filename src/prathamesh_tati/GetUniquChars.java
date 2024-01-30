/*Assignment - 24 : 29th Jan'2024
Print all the characters from given String having frequency 1 (print unique characters from given string) [with indexOf & lastIndexOf]

String str = "technocredits";
output : hnordis*/

package prathamesh_tati;

public class GetUniquChars {

	void printUniqueCharacters(String str) {

		for (int index = 0; index <= str.length() - 1; index++) {

			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch))
				System.out.print(ch);
		}
	}

	public static void main(String[] args) {
		GetUniquChars getUniquChars = new GetUniquChars();
		getUniquChars.printUniqueCharacters("technocredits");
	}
}