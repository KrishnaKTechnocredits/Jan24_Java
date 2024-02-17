package varsha;

//Detect empty input string:
//input: ""
//output: Empty string, no character found.

public class CheckStringIsEmpty {

	void printString(String input) {
		if (input.isEmpty()) {
			System.out.println("Empty string, no character found");
		}
	}

	public static void main(String[] args) {
		new CheckStringIsEmpty().printString("");
	}
}
