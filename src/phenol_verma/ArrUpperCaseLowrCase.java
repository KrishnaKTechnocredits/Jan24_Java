/*Assignment - 44 : 4th Feb'2024
PhenolV_Assignment_50
Print all the names from given array if Uppercase characters are more then lowercase characters.
input : {"aAShVI", "TEchNoCRediTs", "ANSh","dhARMma","vIDhItA"}		 
Output : aAShVI
		 ANSh
		 vIDhItA
*/

package phenol_verma;

public class ArrUpperCaseLowrCase {
	void charCaseCount(String arr[]) {
		int countLowCase = 0;
		int countUprCase = 0;
		for (int index = 0; index < arr.length; index++) {
			String testStr = arr[index];
			for (int chIndex = 0; chIndex < testStr.length(); chIndex++) {
				if (Character.isLowerCase(testStr.charAt(chIndex)))
					countLowCase++;
				else
					countUprCase++;
			}
			if (countUprCase > countLowCase)
				System.out.println(testStr);

			countLowCase = 0;
			countUprCase = 0;
		}
	}

	public static void main(String[] args) {
		ArrUpperCaseLowrCase arrUpperCaseLowrCase = new ArrUpperCaseLowrCase();
		String arr[] = { "aAShVI", "TEchNoCRediTs", "ANSh", "dhARMma", "vIDhItA" };
		arrUpperCaseLowrCase.charCaseCount(arr);
	}
}
