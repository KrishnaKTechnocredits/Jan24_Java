package ankita_s;

public class Assignment60 {

	int charFreq(String str, char ch) {
		str = str.toLowerCase();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			if (ch1 == ch)
				count++;
		}
		return count;
	}

	char maxFreq(String input) {
		int maxCount = 0;
		char targetch = ' ';
		for (int i = 0; i < input.length(); i++) {
			int count = charFreq(input, input.charAt(i));
			if (maxCount < count) {
				maxCount = count;
				targetch = input.charAt(i);
			}
		}
		return targetch;
	}

	void getnthMaximum(String str, int nthMax) {
		char maxchar = ' ';
		if (nthMax == 1) {
			maxchar = maxFreq(str);
		} else {
			for (int i = 2; i <= nthMax; i++) {
				maxchar = maxFreq(str);
				str = str.replace(Character.toString(maxchar), "");
				maxchar = maxFreq(str);
			}
		}
		int maxCharCount = charFreq(str, maxchar);
		System.out.println(maxchar + "->" + maxCharCount);
	}

	public static void main(String[] args) {
		String str = "aakanksha";
		Assignment60 ass60 = new Assignment60();
		ass60.getnthMaximum(str, 2);
	}
}