package sasmita;

public class Assignemnt45 {

	int UpperCaseCh(String name) {
		int countUpperCase = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isUpperCase(ch) == true) {
				countUpperCase++;
			}
		}
		return countUpperCase;
	}

	int LowerCaseCh(String name) {
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
			if (UpperCaseCh(names[index]) > LowerCaseCh(names[index])) {
				System.out.println(names[index]);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "aAShVI", "TEchNoCRediTs", "ANSh", "dhARMma", "vIDhItA" };
		new Assignemnt45().printNames(names);
	}
}
