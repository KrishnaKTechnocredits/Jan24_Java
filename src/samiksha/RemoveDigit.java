package samiksha;

public class RemoveDigit {

	void printString(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				output = output + ch;
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		new RemoveDigit().printString("Aas-H3v7i");
	}
}
