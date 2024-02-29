package akshada_marne;

public class CharOccuringTwice {

	int checkFreq(String input, char target) {
		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (target == ch) {
				count++;
			}
		}
		return count;
	}

	void display(String input) {
		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);
			int count = checkFreq(input, ch);
			if (count == 2)
				if (input.indexOf(ch) == i) {
					System.out.print(ch);
				}
		}
	}

	public static void main(String[] args) {
		CharOccuringTwice charOccuringTwice = new CharOccuringTwice();
		charOccuringTwice.display("teecccchhhnno");
	}
}