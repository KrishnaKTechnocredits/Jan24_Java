/*Assignment - 45 : 4th Feb'2024
Print all the names from given array if Uppercase characters are more then lowercase characters.

input : {"aAShVI", "TEchNoCRediTs", "ANSh","dhARMma","vIDhItA"}		 
Output : aAShVI
		 ANSh
		 vIDhItA         --------------------------*/
package pallavi_raut;

public class FindStringUpperMoreThanLower {

	public static void main(String[] args) {
		String[] arr = { "aAShVI", "TEchNoCRediTs", "ANSh", "dhARMma", "vIDhItA" };
		FindStringUpperMoreThanLower findStringUpperMoreThanLower = new FindStringUpperMoreThanLower();
		findStringUpperMoreThanLower.printStringUpperMoreThanLower(arr);
	}

	int isLetterUpper(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			boolean flag = Character.isUpperCase(ch);
			if (flag == true) {
				count++;
			}
		}
		return count;
	}

	int isLetterLower(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			boolean flag = Character.isLowerCase(ch);
			if (flag == true) {
				count++;
			}
		}
		return count;
	}

	void printStringUpperMoreThanLower(String[] str) {
		for (int index = 0; index < str.length; index++) {
			int CountUpperCase = isLetterUpper(str[index]);
			int CountLowerCase = isLetterLower(str[index]);
			if (CountUpperCase > CountLowerCase) {
				System.out.println(str[index]);
			}
		}
	}
}