package phenol_verma;

public class CharMaxFreq {

	int chrFrq(String str, char toFindChar) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == toFindChar) {
				count++;
			}
		}
		return count;
	}

	void findMaxFrqChar(String str) {
		int strCharCount = 0;
		char charWithMaxFrq = '_';
		for (int index = 0; index < str.length(); index++) {
			char toFindChar = str.charAt(index);
			int countChar = chrFrq(str, toFindChar);
			if (countChar > strCharCount) {
				strCharCount = countChar;
				charWithMaxFrq = toFindChar;
			}
		}
		System.out.println(str + " -> " + charWithMaxFrq + " -> " + strCharCount);
	}

	void findUniqueChar(String str) {
		int strCharCount = 0;
		int flag = 0;
		char charWithMaxFrq = '_';
		for (int index = 0; index < str.length(); index++) {
			char toFindChar = str.charAt(index);
			int countChar = chrFrq(str, toFindChar);
			if (countChar != 1) {
				flag = 1;
			}
		}
		if (flag == 0)
			System.out.println(str + " having all unique characters");
		else
			System.out.println(str + " not having all unique characters");
	}

	public static void main(String[] args) {
		CharMaxFreq charMaxFreq = new CharMaxFreq();
		charMaxFreq.findMaxFrqChar("aakanksha");
		charMaxFreq.findMaxFrqChar("teecccchnoceredites");
		charMaxFreq.findUniqueChar("maulik");
	}

}
