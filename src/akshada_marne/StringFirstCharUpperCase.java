package akshada_marne;

public class StringFirstCharUpperCase {
	String perform(String str) {
		String output = "";

		if (Character.isLowerCase(str.charAt(0)))
			output = output + Character.toUpperCase(str.charAt(0));
		else
			output = output + str.charAt(0);

		for (int i = 1; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
				output = output + ch;
			} else
				output = output + ch;
		}
		return output;
	}

	void printString(String[] input) {
		String finalOutput = "";
		for (int index = 0; index < input.length; index++) {
			finalOutput = finalOutput + " " + perform(input[index]);
		}
		System.out.println(finalOutput);
	}

	public static void main(String args[]) {
		StringFirstCharUpperCase stringFirstCharUpperCase = new StringFirstCharUpperCase();

		String str = "hi hEllO how are you";
		String[] arr = str.split(" ");
		stringFirstCharUpperCase.printString(arr);

	}
}
