package shridhar_k;

public class ProgrammingTest2_1 {
	char printLastConsonants(String inputStr) {

		for (int i = 0; i < inputStr.length(); i++) {
			char ch = inputStr.charAt(i);
			if (inputStr.indexOf(ch) != inputStr.lastIndexOf(ch)) {
				inputStr = inputStr.replace(String.valueOf(ch), "@");
			}
			ch = inputStr.charAt(i);
			if ('a' == ch || 'e' == ch || 'i' == ch || 'o' == ch || 'u' == ch) {
				inputStr = inputStr.replace(String.valueOf(ch), "@");
			}
		}
		inputStr = inputStr.replace("@", "");
		if (inputStr.length() > 0) {
			char ch = inputStr.charAt(inputStr.length() - 1);
			System.out.println(ch);
			return ch;
		} else {
			System.out.println("No unique consonants");
			char ch = ' ';
			return ch;
		}
	}

	public static void main(String[] args) {
		new ProgrammingTest2_1().printLastConsonants("aakansha");
	}
}
