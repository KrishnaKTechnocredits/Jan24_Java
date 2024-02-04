package ashwini_b;

/*
Print all the characters from given String having frequency 1 (print unique characters from given string) [without indexOf & lastIndexOf]
String str = "technocredits";
output : hnordis
 */
public class GetCharFreq {

	int charFreq(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch1 = str.charAt(index);
			if (ch == ch1) {
				count++;
			}
		}
		return (count);

	}

	void uniqueChar(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int charcount = charFreq(str, ch);
			if (charcount == 1) {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		GetCharFreq getCharFreq = new GetCharFreq();
		getCharFreq.uniqueChar("technocredits");

	}

}
