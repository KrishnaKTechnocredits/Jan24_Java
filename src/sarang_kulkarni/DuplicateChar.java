
/*
 Assignment - 25 : 29th Jan'2024
Print all the duplicate characters from the given String.

input = "aakanksha";
output : ak 
*/

package sarang_kulkarni;

public class DuplicateChar {

	void findDupicate(String str) {

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (i == str.indexOf(ch)) {

				if (str.indexOf(ch) != str.lastIndexOf(ch)) {
					System.out.print(ch);
				}
			}
		}
	}

	public static void main(String[] arg) {
		new DuplicateChar().findDupicate("aakanksha");
	}
}
