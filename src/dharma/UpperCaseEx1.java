package dharma;

public class UpperCaseEx1 {

	void upperChar(String input) {
		for (int index = 0 ; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				input = input.replace(ch, '_');
			}
		}
		String str = String.valueOf('_');
		System.out.println(input.replace(str, ""));
	}

	public static void main(String[] args) {
		new UpperCaseEx1().upperChar("TechNoCREdits");
	}
}
