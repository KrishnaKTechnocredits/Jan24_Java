package aanand;

/*Print only unique vowels:
input: technocredits
output: oi*/

public class Assignment56 {

	void countOfUniqueChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			str = str.toLowerCase();
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				if (str.indexOf(ch) == str.lastIndexOf(ch))
					System.out.println(ch);
		}
	}

	public static void main(String[] args) {
		Assignment56 assignment56 = new Assignment56();
		assignment56.countOfUniqueChar("technocredits");
	}
}