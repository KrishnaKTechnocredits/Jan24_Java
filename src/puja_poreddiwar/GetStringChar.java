package puja_poreddiwar;

public class GetStringChar {

	void GetCharFreq(String str) {
		int count = 0;
		char ch;
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (ch == str.charAt(i)) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] agrs) {
		GetStringChar getChar = new GetStringChar();
		getChar.GetCharFreq("technocredits");
	}
}
