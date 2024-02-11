/*Assignment - 45 : 4th Feb'2024
Print all the names from given array if Uppercase characters are more then lowercase characters.

input : {"aAShVI", "TEchNoCRediTs", "ANSh","dhARMma","vIDhItA"}		 
Output : aAShVI
		 ANSh
		 vIDhItA
*/

package padmaja;

public class ArrayUpperCaseLowerCasecharacters {
	int upperCaseCount = 0;
	int lowerCaseCount = 0;

	boolean count(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch))
				upperCaseCount++;
			else if (Character.isLowerCase(ch))
				lowerCaseCount++;
		}
		if (upperCaseCount > lowerCaseCount) {
			return true;
		} else
			return false;
	}

	void printNames(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			if (count(str)) {
				System.out.println(str);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = { "aAShVI", "TEchNoCRediTs", "ANSh", "dhARMma", "vIDhItA" };
		ArrayUpperCaseLowerCasecharacters array = new ArrayUpperCaseLowerCasecharacters();
		array.printNames(arr);
	}
}