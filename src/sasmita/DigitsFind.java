package sasmita;

public class DigitsFind {

	void digitString(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println("There are " + count + " digits in " + input);
	}

	public static void main(String[] args) {
		new DigitsFind().digitString("te3c3hn5o2cre3dit");
	}
}
