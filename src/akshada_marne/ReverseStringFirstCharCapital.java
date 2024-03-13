package akshada_marne;

public class ReverseStringFirstCharCapital {
	String performOperation(String str) {

		String output = "";

		char firstLetter = Character.toLowerCase(str.charAt(0));
		output = output + firstLetter;

		for (int i = 1; i <= str.length() - 2; i++) {
			char ch = str.charAt(i);
			output = output + ch;
		}

		char LastLetter = Character.toUpperCase(str.charAt(str.length() - 1));
		output = output + LastLetter;

		return output;
	}

	String reverseString(String str) {
		String output = "";
		String getString = performOperation(str);

		for (int i = getString.length() - 1; i >= 0; i--) {
			char ch = getString.charAt(i);
			output = output + ch;
		}
		return output;
	}

	void displayString(String[] input) {

		for (int index = 0; index < input.length; index++) {
			String finalOutput = reverseString(input[index]);
			System.out.print(finalOutput + " ");
		}
	}

	public static void main(String args[]) {
		ReverseStringFirstCharCapital reverseStringFirstCharCapital = new ReverseStringFirstCharCapital();
		String str = "Hi Hello Maulik";
		String[] arr = str.split(" ");
		reverseStringFirstCharCapital.displayString(arr);
	}

}
