package gaurav_garg;

public class PrintDuplicateCharacterStringAssignment25 {

	void printDuplicateCharcter(String str) {
		for (int i = 0; i < str.length(); i++) {
			char char1 = str.charAt(i);
			int index1 = str.indexOf(char1);
			int index2 = str.lastIndexOf(char1);
			if (i == str.indexOf(char1)) {
				if (index1 != index2) {
					System.out.print(char1);
				}
			}
		}
	}

	public static void main(String[] args) {
		new PrintDuplicateCharacterStringAssignment25().printDuplicateCharcter("aakanksha");
	}
}
