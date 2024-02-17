package samiksha;

public class SecondHighFreq {

	int getSecMaxFreq(String str, char targetCh) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == targetCh) {
				count++;
			}
		}
		return count;
	}

	char printSecFreq(String str) {
		int secCount = 0;
		char SecChar = ' ';
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int count = getSecMaxFreq(str, ch);
			if (secCount < count) {
				secCount = count;
				SecChar = ch;
			}
		}
		return SecChar;
	}

	void getFreq(String str) {
		for (int index = 0; index < str.length(); index++) {
			char secMax = printSecFreq(str);
			str = str.replaceAll(Character.toString(secMax), "");
			secMax = printSecFreq(str);
			int count = getSecMaxFreq(str, secMax);
			System.out.println(secMax + " -> " + count);
			break;
		}
	}

	public static void main(String[] args) {
		String str = "aakanksha";
		new SecondHighFreq().getFreq(str);
	}
}
