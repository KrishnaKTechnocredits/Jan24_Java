package suresh;

public class PrintCharFrequ {

	int printCharFrequecy(String input, char ch) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (ch == input.charAt(i))
				count++;

		}
		return count;
	}

	void getUniuqChar() {

		{
			String str = "technocredits";
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				int count = printCharFrequecy(str, ch);
				if (count == 1)

					System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		PrintCharFrequ printCharFrequ = new PrintCharFrequ();
		printCharFrequ.getUniuqChar();
	}
}
