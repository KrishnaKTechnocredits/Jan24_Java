package akshada_marne;

public class RemoveVowels {
	void remove(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				String temp = str.valueOf(ch);
				str = str.replace(temp, "*");
			}

		}
		str = str.replace("*", "");
		System.out.println(str);
	}

	public static void main(String args[]) {
		RemoveVowels removeVowels = new RemoveVowels();
		removeVowels.remove("technocredits");
	}

}
