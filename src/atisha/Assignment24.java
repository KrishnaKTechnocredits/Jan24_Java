package atisha;
//print all the character from given string having frequency 1 without using indexOf & lastIndexOf
class Assignment24 
{
	void getUniqueChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (getCountOfChar(input, ch) == 1) {
				System.out.println(ch);
			}
		}
	}

		int getCountOfChar(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		new Assignment24().getUniqueChar("technocredits");
	}
}

