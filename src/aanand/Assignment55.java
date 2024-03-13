package aanand;

/*Print only characters occurring exactly twice:
input: teecccchhhnno;
output: en*/

public class Assignment55 {
	int charOccurance(String str, char targetChar) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == targetChar) {
				count++;
			}
		}
		return count;
	}

	void print(String str) {
		char ch = ' ';
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			int output = charOccurance(str, ch);
			if (output == 2) {
				if (str.indexOf(ch) == i) {
					System.out.println(ch);
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment55 assignment55 = new Assignment55();
		assignment55.print("teecccchhhnno");
	}
}