package ankita_s;

public class RemoveVowels {

	void printRemoveVowels(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			{
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					String temp = str.valueOf(ch);
					str = str.replace(temp, "*");
				}
			}
		}
		str = str.replace("*", "");
		System.out.println(str);
	}

	public static void main(String[] args) {
		RemoveVowels removeVowels = new RemoveVowels();
		removeVowels.printRemoveVowels("technocredits");
	}
}
