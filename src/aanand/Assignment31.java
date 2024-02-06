package aanand;
public class Assignment31 {

	int findCharMaxFerqInString(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char freq = str.charAt(i);
			if (freq == ch) {
				count++;
			}
		}
		return count;
	}

	void printMaxCharFreq(String str) {
		int max = 0;
		char targetchar = ' ';
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int count = findCharMaxFerqInString(str, ch);
			if (max < count) {
				max = count;
				targetchar = ch;
			}
		}
		System.out.println(str + " -> " + targetchar + " - > " + max);
	}

	public static void main(String[] args) {
		Assignment31 assignment31 = new Assignment31();
		assignment31.printMaxCharFreq("aakanksha");
		assignment31.printMaxCharFreq("teecccchnoceredites");
	}
}