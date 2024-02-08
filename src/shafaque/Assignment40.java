package shafaque;

public class Assignment40 {

	String getAllConsonantAndVowels(String input) {
		char lastCh = ' ';
		String name = "";
		for (int i = 0; i < input.length(); i++) {
			String str = input.toLowerCase();
			char ch = str.charAt(0);
			if (i == str.length() - 1) {
				lastCh = str.charAt(i);

			}
			if (((ch != 'a') && (ch != 'e') && (ch != 'i') && (ch != 'o') && (ch != 'u')) && (((lastCh != 'a')
					|| (lastCh != 'e') || (lastCh != 'i') || (lastCh != 'o') || (lastCh != 'u')))) {

				name = str;
			}

		}
		return name;
	}

	public static void main(String[] args) {

		String[] str = { "Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima" };
		for (int i = 0; i < str.length; i++) {
			String name = str[i];
			String input = new Assignment40().getAllConsonantAndVowels(name);
			if (input != "") {
				System.out.println(input);
			}
		}
	}
}
