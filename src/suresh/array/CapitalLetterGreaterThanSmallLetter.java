package suresh.array;

public class CapitalLetterGreaterThanSmallLetter {

	int getCoutOfLetters(String input) {
		int count1 = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			boolean flag1 = Character.isUpperCase(ch);
			if (flag1 == true)
				count1 = count1 + 1;
		}
		return count1;
	}

	int getLowerCase(String input) {
		int count2 = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			boolean flag2 = Character.isLowerCase(ch);
			if (flag2 == true)
				count2 = count2 + 1;
		}
		return count2;
	}

	void getString(String[] index) {
		String str1 = " ";
		for (int i = 0; i < index.length; i++) {
			String str = index[i];
			int count1 = getCoutOfLetters(str);
			int count2 = getLowerCase(str);
			if (count1 > count2) {
				str1 = str;
				System.out.println(str1);
			}
		}
	}

	public static void main(String[] args) {
		String[] arry = { "aAShVI", "TEchNoCRediTs", "ANSh", "dhARMma", "vIDhItA" };
		new CapitalLetterGreaterThanSmallLetter().getString(arry);
	}
}
