package varsha;

public class ReplaceEx1 {

	void printReplaceString(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				input = input.replace(ch, '*');
			}
		}
		input = input.replace("*", "");
		System.out.println(input);
	}

	public static void main(String[] args) {
		new ReplaceEx1().printReplaceString("technocredits");
	}

}
