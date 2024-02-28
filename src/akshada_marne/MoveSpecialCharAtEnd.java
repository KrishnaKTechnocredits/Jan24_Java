package akshada_marne;

public class MoveSpecialCharAtEnd {

	void perform(String str) {
		String output = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isUpperCase(ch) || Character.isLowerCase(ch) || Character.isDigit(ch))
				output = output + ch;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (!Character.isUpperCase(ch) && !Character.isLowerCase(ch) && !Character.isDigit(ch))
				output = output + ch;
		}
		System.out.print(output);
	}

	public static void main(String args[]) {
		MoveSpecialCharAtEnd moveSpecialCharAtEnd = new MoveSpecialCharAtEnd();
		moveSpecialCharAtEnd.perform("-AasH?3v7i!");
	}

}
