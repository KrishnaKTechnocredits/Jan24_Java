package shramika_vaidya;

class StringVowelRemove {

	void removeVowel(String str) {
		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				String vowel = String.valueOf(ch);
				str = str.replace(vowel, "");
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		new StringVowelRemove().removeVowel("technocredits");
	}
}