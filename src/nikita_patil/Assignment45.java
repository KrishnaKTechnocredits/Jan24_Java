package nikita_patil;

public class Assignment45 {
	int getMaxUpperCharCount(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				count++;
			}
		}
		return count;
	}
	int getMinLowerCharCount(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isLowerCase(ch)) {
				count++;
			}
		}
		return count;
	}
	void printWithMaxUpperCharString(String[] str) {
		for (int i = 0; i < str.length; i++) {
			String input = str[i];
			int count1 = getMaxUpperCharCount(input);
			int count2 = getMinLowerCharCount(input);
			if (count1 > count2) {
				System.out.println(input);
			}
		}
	}

	public static void main(String[] args) {
		 Assignment45 a = new Assignment45();
		String[] arr = { "aAShVI", "TEchNoCRediTs", "ANSh", "dhARMma", "vIDhItA" };
		a.printWithMaxUpperCharString(arr);
	}
}


