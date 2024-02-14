package hiral_purohit;
//"Print the character with maximum frequency

public class Assignment_59 {

	int toGetFrequencyOfChar(String str, char target) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == target) {
				count++;
			}
		}
		return count;
	}

	void toPrintMaxFreqChar(String str) {
		str = str.toLowerCase();
		char maxChar = ' ';
		int max = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (str.indexOf(ch) == i) {
				int count = toGetFrequencyOfChar(str, ch);
				if (count > max) {
					max = count;
					maxChar = ch;
				}
			}

		}
		System.out.print(maxChar + " --> " + max);
	}

	public static void main(String[] args) {
		new Assignment_59().toPrintMaxFreqChar("TeeCccChH");
	}

}
