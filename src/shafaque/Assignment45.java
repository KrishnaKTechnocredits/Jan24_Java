package shafaque;

public class Assignment45 {

	void countofupperandlower(String[] str) {
		for (int index = 0; index < str.length; index++) {
			int CountUpperCase = isupper(str[index]);
			int CountLowerCase = islower(str[index]);
			if (CountUpperCase > CountLowerCase) {
				System.out.println(str[index]);
			}
		}
	}

	int isupper(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			boolean temp = Character.isUpperCase(ch);
			if (temp == true)
				count++;
		}
		return count;
	}

	int islower(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			boolean temp = Character.isLowerCase(ch);
			if (temp == true)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String[] arr = { "aAShVI", "TEchNoCRediTs", "ANSh", "dhARMma", "vIDhItA" };
		Assignment45 assi45 = new Assignment45();
		assi45.countofupperandlower(arr);
	}
}
