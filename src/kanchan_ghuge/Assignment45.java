
/*Assignment - 45 : 4th Feb'2024
Print all the names from given array if Uppercase characters are more then lowercase characters.

input : {"aAShVI", "TEchNoCRediTs", "ANSh","dhARMma","vIDhItA"}		 
Output : aAShVI
		 ANSh
		 vIDhItA */

package kanchan_ghuge;

class Assignment45 {

	int getUpperCaseLettersCountfromString(String str) {
		int countUpper = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch) == true) {
				countUpper++;
			}
		}
		return countUpper;
	}

	int getLowerCaseLettersCountfromString(String str) {
		int countLower = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isLowerCase(ch) == true) {
				countLower++;
			}
		}
		return countLower;
	}

	void printNames(String[] str) {
		System.out.println(
				"Print all the names from given array if Uppercase characters are more then lowercase characters are =");
		for (int index = 0; index < str.length; index++) {
			int countUpperCase = getUpperCaseLettersCountfromString(str[index]);
			int countLowerCase = getLowerCaseLettersCountfromString(str[index]);
			if (countUpperCase > countLowerCase)
				System.out.println(str[index]);
		}
	}

	public static void main(String[] args) {
		String[] s = { "aAShVI", "TEchNoCRediTs", "ANSh", "dhARMma", "vIDhItA" };
		new Assignment45().printNames(s);
	}
}
