package shafaque;

public class Assignment55 {

	int countChar(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char c = str.charAt(index);
			if (ch == c)
				count++;

		}
		return count;
	}

	void printChar(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int count = countChar(str, ch);
			if (count == 2)
				if (str.indexOf(ch) == index)
					System.out.print(str.charAt(index));
		}
	}

	public static void main(String[] args) {
		String input = "teecccchhhnno";
		new Assignment55().printChar(input);
	}

}
