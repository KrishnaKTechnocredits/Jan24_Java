package aanand;

public class Assignment23 {

	int getCharFreq(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char freq = str.charAt(i);
			if (freq == ch) {
				count++;
			}
		}
		return count;
	}

	void printUniqChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int output = getCharFreq(str, ch);
			if (output == 1) {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();
		assignment23.printUniqChar("technocredits");
	}
}