package lovekesh_mishra;

class Assignment55 {

	int getCount(String input, char c) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == c) {
				count++;
			}
		}
		return count;

	}

	void printGetCount(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int getCount = getCount(str, ch);
			if (getCount == 2) {
				if (str.indexOf(ch) == i) {
					System.out.println(ch);
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment55 ans = new Assignment55();
		ans.printGetCount("teecccchhhnno");
	}

}
