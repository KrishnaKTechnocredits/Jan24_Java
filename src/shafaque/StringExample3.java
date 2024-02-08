package shafaque;

public class StringExample3 {

	void doubleChar() {
		String str = "aakanksha";

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch)) {
				if (str.indexOf(ch) != str.lastIndexOf(ch))

				{
					System.out.print(ch);
				}

			}
		}
	}

	public static void main(String[] args) {
		new StringExample3().doubleChar();
	}
}
