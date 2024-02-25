package shafaque;

public class Assignment63 {
	void checkIfStringEmpty(String str) {
		if (str.isEmpty()) {
			System.out.println("Empty string, no character found.");
		}
	}

	public static void main(String[] args) {
		String input = "";
		Assignment63 assi63 = new Assignment63();
		assi63.checkIfStringEmpty(input);
	}

}
