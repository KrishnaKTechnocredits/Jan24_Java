package samiksha;

public class SpCharAtEnd {

	void printSpCharAtEnd(String str) {
		String output = "";
		String output1 = "";
		String output2 = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isLetter(ch) || Character.isDigit(ch)) {
				output1 = output1 + ch;
			} else {
				output2 = output2 + ch;
			}
		}
		output = output1 + output2;
		System.out.println(output);
	}

	public static void main(String[] args) {
		new SpCharAtEnd().printSpCharAtEnd("-AasH?3v7i!");
	}
}
