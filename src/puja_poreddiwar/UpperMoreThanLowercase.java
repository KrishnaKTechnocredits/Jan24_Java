package puja_poreddiwar;

public class UpperMoreThanLowercase {

	boolean isUpperCaseMoreLowerCase(String str) {
		int count1 = 0;
		int count2 = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isLowerCase(ch)) {
				count1++;
			} else if (Character.isUpperCase(ch)) {
				count2++;
			}
		}
		if (count1 < count2) {
			return true;
		} else {
			return false;
		}
	}

	void printNames(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String input = arr[index];
			if (isUpperCaseMoreLowerCase(input)) {
				System.out.println(input);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "aAShVI", "TEchNoCRediTs", "ANSh", "dhARMma", "vIDhItA" };
		new UpperMoreThanLowercase().printNames(names);
	}
}
