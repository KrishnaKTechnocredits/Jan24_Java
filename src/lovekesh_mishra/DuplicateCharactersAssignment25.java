package lovekesh_mishra;

class DuplicateCharactersAssignment25 {

	void Print(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			input.indexOf(ch);
			if (index == input.indexOf(ch)) {
				if (input.lastIndexOf(ch) != input.indexOf(ch)) {
					System.out.print(ch);
				}
			}

		}
	}

	public static void main(String[] args) {
		DuplicateCharactersAssignment25 duplicateCharactersAssignment25 = new DuplicateCharactersAssignment25();
		duplicateCharactersAssignment25.Print("aakanksha");
	}

}
