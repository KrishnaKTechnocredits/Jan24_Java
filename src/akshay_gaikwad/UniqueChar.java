//Print all the characters from given String having frequency 1 (print unique characters from given string) [without indexOf & lastIndexOf]
package akshay_gaikwad;

public class UniqueChar {
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
		new UniqueChar().getUniqueChar("technocredits");
	}
}
