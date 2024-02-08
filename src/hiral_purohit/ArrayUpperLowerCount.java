package hiral_purohit;

public class ArrayUpperLowerCount {

	int upperCaseCount(String input) {
		int count1 = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch) == true) {
				count1++;
			}
		}
		return count1;
	}

	int lowerCaseCount(String input) {
		int count2 = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isLowerCase(ch) == true) {
				count2++;
			}
		}
		return count2;
	}

	void printString(String[] input) {
		for (int index = 0; index < input.length; index++) {
			String name = input[index];
			int count1 = upperCaseCount(name);
			int count2 = lowerCaseCount(name);
			if (count1 > count2) {
				System.out.println(name);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = { "aAShVI", "TEchNoCRediTs", "ANSh", "dhARMma", "vIDhItA" };
		new ArrayUpperLowerCount().printString(arr);
	}
}
