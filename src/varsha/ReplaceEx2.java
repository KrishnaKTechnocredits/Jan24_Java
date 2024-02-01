package varsha;

public class ReplaceEx2 {

	void printReplaceString(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				input = input.replace(ch, '*');
			}
		}
		input = input.replace("*", "");
		System.out.println(input);
	}

	public static void main(String[] args) {
		new ReplaceEx2().printReplaceString("TechNoCREdits");
	}
}
