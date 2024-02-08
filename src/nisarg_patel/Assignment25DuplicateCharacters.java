package nisarg_patel;

public class Assignment25DuplicateCharacters {

	void printDuplicates(String input) {
		System.out.print("Duplicate Characters of a given String : ");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == index) {
				if (input.indexOf(ch) != input.lastIndexOf(ch)) {
					System.out.print(input.charAt(index));
				}
			}
		}
	}

	public static void main(String[] args) {
		new Assignment25DuplicateCharacters().printDuplicates("aakanksha");
	}
}
