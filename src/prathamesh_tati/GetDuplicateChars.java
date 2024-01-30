/*Print all the duplicate characters from the given String.

input = "aakanksha";
output : ak */

package prathamesh_tati;

public class GetDuplicateChars {
	int count = 0;

	void getDuplicateCharacters(String str) {
		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch))
				if (str.indexOf(ch) != str.lastIndexOf(ch))
					System.out.print(ch);
		}
	}

	public static void main(String[] args) {
		GetDuplicateChars getDuplicateChars = new GetDuplicateChars();
		getDuplicateChars.getDuplicateCharacters("aakanksha");
	}
}
