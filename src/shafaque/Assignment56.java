package shafaque;

public class Assignment56 {

	void printvowels(String str) {
		for (int index = 0; index < str.length(); index++) {
			str = str.toLowerCase();
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				if (str.indexOf(ch) == str.lastIndexOf(ch))
					System.out.println(ch);

		}
	}

	public static void main(String[] args) {
		Assignment56 assi56 = new Assignment56();
		String str = "technocredits";
		assi56.printvowels(str);

	}
}
