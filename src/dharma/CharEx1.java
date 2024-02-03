package dharma;

public class CharEx1 {

		void getUniqueChar(String input) {
			for (int index = 0; index < input.length(); index++) {
				char ch = input.charAt(index);
				if (getCountOfChar(input, ch) == 1) {
					System.out.print(ch);
				}
			}
		}

		int getCountOfChar(String str, char ch) {
			int count = 0;
			for (int index = 0; index < str.length(); index++) {
				if (str.charAt(index) == ch) {
					count++;
				}
			}
			return count;
		}

		public static void main(String[] args) {
			new CharEx1().getUniqueChar("technocredits");
		}
}
