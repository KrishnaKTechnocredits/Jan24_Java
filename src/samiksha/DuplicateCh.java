package samiksha;

/*Print all the duplicate characters from the given String.

 input = "aakanksha";
 output : ak 
*/

public class DuplicateCh {

	void printDuplicate(String str) {
		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch)) {
				if (str.indexOf(ch) != str.lastIndexOf(ch))
					System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		DuplicateCh duplicate = new DuplicateCh();
		duplicate.printDuplicate("aakanksha");
	}
}
