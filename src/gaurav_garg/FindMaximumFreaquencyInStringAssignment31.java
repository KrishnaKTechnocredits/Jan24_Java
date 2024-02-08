package gaurav_garg;

public class FindMaximumFreaquencyInStringAssignment31 {

	int getFreaquencyCount(String str1, char char2) {
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			char match = str1.charAt(i);
			if (match == char2)
				count++;
		}
		return count;
	}

	void printMaxCharacterInString(String str) {
		int freaquency = 0;
		char char2 = ' ';
		for (int i = 0; i < str.length(); i++) {
			char char1 = str.charAt(i);
			int countchar = getFreaquencyCount(str, char1);
			if (freaquency < countchar) {
				freaquency++;
				char2 = char1;
			}

		}
		if (freaquency != 1)
			System.out.println(str + " -> " + char2 + " -> " + freaquency);
		else
			System.out.println(str + " having all unique characters");
	}

	public static void main(String[] args) {
		new FindMaximumFreaquencyInStringAssignment31().printMaxCharacterInString("aakanksha");
		new FindMaximumFreaquencyInStringAssignment31().printMaxCharacterInString("teecccchnoceredites");
		new FindMaximumFreaquencyInStringAssignment31().printMaxCharacterInString("maulik");
	}
}
 