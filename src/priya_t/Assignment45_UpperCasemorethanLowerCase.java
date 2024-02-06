package priya_t;

public class Assignment45_UpperCasemorethanLowerCase {

	void printNameUppercaseMorethanLowerCase(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			if (isUpperCaseMoreThanLowerCase(str)) {
				System.out.println(str);
			}
		}
	}

	boolean isUpperCaseMoreThanLowerCase(String str) {
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				upperCaseCount++;

			} else if (Character.isLowerCase(ch)) {
				lowerCaseCount++;
			}
		}
		if (upperCaseCount > lowerCaseCount) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		String[] arr = { "aAShVI", "TEchNoCRediTs", "ANSh", "dhARMma", "vIDhItA" };
		Assignment45_UpperCasemorethanLowerCase obj = new Assignment45_UpperCasemorethanLowerCase();
		obj.printNameUppercaseMorethanLowerCase(arr);
	}
}