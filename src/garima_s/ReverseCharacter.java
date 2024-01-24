package garima_s;

public class ReverseCharacter {

	void printCharacter(String value) {
		for (int index = (value.length() - 1); index >= 0; index--) {
			System.out.println(value.charAt(index));
		}
	}

	public static void main(String[] args) {
		ReverseCharacter reverseCharacter = new ReverseCharacter();
		reverseCharacter.printCharacter("techno");
	}
}
