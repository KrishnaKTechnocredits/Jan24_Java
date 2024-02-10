package nikita_patil;

public class Assignment24 {



	void uniqueChar(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (str.indexOf(ch) == str.lastIndexOf(ch) ) {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		Assignment24 a = new Assignment24();
		a.uniqueChar("technocredits");

	}

}

