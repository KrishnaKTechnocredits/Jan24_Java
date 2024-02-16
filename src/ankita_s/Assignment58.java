package ankita_s;

public class Assignment58 {
	int frqcount(String input, char ch) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch1 = input.charAt(i);
			if (ch == ch1)
				count++;
		}
		return count;
	}

	void printlastchar(String str) {
		for (int index = str.length() - 1; index >= 0; index--) {
			char ch1 = str.charAt(index);
			int count = frqcount(str, ch1);
			if (count == 1) {
				System.out.println(ch1 + " -> " + count);
				break;
			}
		}
	}

	public static void main(String[] args) {
		String str = "aakanksha";
		Assignment58 ass58 = new Assignment58();
		ass58.printlastchar(str);
	}
}
