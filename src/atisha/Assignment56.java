//"Print only unique vowels: //input: technocredits //output: oi"
package atisha;

public class Assignment56 {

	void getCountOfChar(String nStr) {
		String str = nStr.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')

				if (str.indexOf(ch) == str.lastIndexOf(ch))
					System.out.print(ch);
		}
	}

	public static void main(String[] args) {
		new Assignment56().getCountOfChar("technocredits");
	}

}
