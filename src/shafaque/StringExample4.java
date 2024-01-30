package shafaque;

public class StringExample4 {

	void outVowels() {
		String str = "technocredits";
		{
			for (int index = 0; index < str.length(); index++) {
				char ch = str.charAt(index);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					String vowels = String.valueOf(ch);
					str = str.replace(vowels, "*");
				}

			}
			str = str.replace("*", "");
			System.out.print(str);
		}
	}

	public static void main(String[] args) {
		new StringExample4().outVowels();
	}

}
