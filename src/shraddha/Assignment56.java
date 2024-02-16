package shraddha;

/*"Print only unique vowels:
input: technocredits
output: eo"
*/
public class Assignment56 {

	int getCountOfVowels(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			if (ch == ch1)
				count++;
		}
		return count;
	}

	boolean processData(String str, char ch, int target) {
		for (int i = 0; i < target; i++) {
			if (str.charAt(i) == ch)
				return true;
		}
		return false;
	}

	void getUniqueVowel(String str) {
		for (int i = 0; i < str.length(); i++) {
			String input = str.toLowerCase();
			char ch = input.charAt(i);
			if (!processData(input, ch, i)) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					int count = getCountOfVowels(input, ch);
					if (count == 1)
						System.out.println(ch);
				}
			}
		}
	}

	public static void main(String[] args) {
		String str = "technocredits";
		new Assignment56().getUniqueVowel(str);
	}
}
