package samiksha;

public class UpperCaseLowerCaseArray {

	void printNames(String str) {
		int upperCount = 0;
		int lowerCount = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				upperCount++;
			} else if (Character.isLowerCase(ch)) {
				lowerCount++;
			}
		}
		if (upperCount > lowerCount)
			System.out.println(str);
	}

	void printArrray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			printNames(arr[i]);
		}
	}

	public static void main(String[] args) {
		String[] input = { "aAShVI", "TEchNoCRediTs", "ANSh", "dhARMma", "vIDhItA" };
		new UpperCaseLowerCaseArray().printArrray(input);
	}
}
