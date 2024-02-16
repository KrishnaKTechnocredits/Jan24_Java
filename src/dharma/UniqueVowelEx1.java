package dharma;

public class UniqueVowelEx1 {

	void getVowel(String str) {
		for(int input = 0; input < str.length(); input++) {
			str = str.toLowerCase();
			char ch = str.charAt(input);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				if(str.indexOf(ch) == str.lastIndexOf(ch))
				System.out.println(ch);
			}
		}
	}
	public static void main(String[] args) {
		UniqueVowelEx1 uvex1 = new UniqueVowelEx1();
		uvex1.getVowel("technocredits");

	}

}
