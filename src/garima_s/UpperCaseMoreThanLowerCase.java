package garima_s;

public class UpperCaseMoreThanLowerCase {

	int getUpperCase(String name) {
		int countUpperCase = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isUpperCase(ch) == true) {
				countUpperCase++;
			}
		}
		return countUpperCase;
	}

	int getLowerCase(String name) {
		int countLowerCase = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isLowerCase(ch) == true) {
				countLowerCase++;
			}
		}
		return countLowerCase;
	}

	void printNames(String[] names) {
		for (int index = 0; index < names.length; index++) {
			if (getUpperCase(names[index]) > getLowerCase(names[index])) {
				System.out.println(names[index]);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "aAShVI", "TEchNoCRediTs", "ANSh", "dhARMma", "vIDhItA" };
		new UpperCaseMoreThanLowerCase().printNames(names);
	}
}
