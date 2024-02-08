package varsha;

public class ArrayEx9 {

	String getAllTheStrFirstConsonantAndLastVowel(String input) {
		char lastCh = ' ';
		String name = "";
		for (int index = 0; index < input.length(); index++) {
			String str = input.toLowerCase();
			char ch = str.charAt(0);
			if (index == str.length() - 1) {
				lastCh = str.charAt(index);
			}
			if (((ch != 'a') && (ch != 'e') && (ch != 'i') && (ch != 'o') && (ch != 'u')) && (((lastCh == 'a')
					|| (lastCh == 'e') || (lastCh == 'i') || (lastCh == 'o') || (lastCh == 'u')))) {
				name = str;
			}
		}
		return name;
	}

	public static void main(String[] args) {
		String[] str = { "Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima" };
		for (int index = 0; index < str.length; index++) {
			String name = str[index];
			String input = new ArrayEx9().getAllTheStrFirstConsonantAndLastVowel(name);
			if (input != "") {
				System.out.println(input);
			}
		}
	}
}
