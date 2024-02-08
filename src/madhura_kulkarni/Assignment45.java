/*Assignment - 45 : 4th Feb'2024
Print all the names from given array if Uppercase characters are more then lowercase characters.

input : {"aAShVI", "TEchNoCRediTs", "ANSh","dhARMma","vIDhItA"}		 
Output : aAShVI
		 ANSh
		 vIDhItA*/

package madhura_kulkarni;

public class Assignment45 {

	public static void main(String[] args) {
		String[] S = { "aAShVI", "TEchNoCRediTs", "ANSh", "dhARMma", "vIDhItA" };
		new Assignment45().printNames(S);

	}

	int getUpperCaseLettersCountInString(String input) {
		int countUpper = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch) == true) {
				countUpper++;
			}
		}
		return countUpper;
	}

	int getLowerCaseLettersCountInString(String input) {
		int countLower = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isLowerCase(ch) == true) {
				countLower++;
			}
		}
		return countLower;
	}

	void printNames(String[] str) {
		System.out.println("Printing the names from given array when Uppercase characters are more then lowercase characters :");
		for (int i = 0; i < str.length; i++) {
			int countUpperCase = getUpperCaseLettersCountInString(str[i]);
			int countLowerCase = getLowerCaseLettersCountInString(str[i]);
			if (countUpperCase > countLowerCase)
				System.out.println(str[i]);
		}
	}
}
