package suresh;

public class RemoveAllTheVowels {

	void removeVowels(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String temp = String.valueOf(ch);
			if (ch == 'e' || ch == 'i' || ch == 'o') {
				str = str.replace(temp, "*");

			}
		}
		str = str.replace("*", "");
		System.out.println(str);
	}

	public static void main(String[] args) {
		new RemoveAllTheVowels().removeVowels("technocredits");

	}
}
