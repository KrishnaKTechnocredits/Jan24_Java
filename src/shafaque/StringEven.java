package shafaque;

public class StringEven {

	void printEvenChar() {
		String str = "te3ch4nocred8its";
		int lastevennum = 0;

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch) && Character.getNumericValue(ch) % 2 == 0) {
				lastevennum = Character.getNumericValue(ch);
			}
		}
		System.out.print("The last Even Number in String is " + lastevennum);
	}

	public static void main(String[] args) {
		new StringEven().printEvenChar();
	}
}
