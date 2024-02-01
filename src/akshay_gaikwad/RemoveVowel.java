package akshay_gaikwad;

public class RemoveVowel {
	void removeVowel(String input) {
		for (int index = 0 ; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				input = input.replace(ch , '_');
			}
		}
		String str = String.valueOf('_');
		System.out.println(input.replace(str, ""));
	}
	public static void main(String[] args) {
		new RemoveVowel().removeVowel("technocredits");
	}
}
