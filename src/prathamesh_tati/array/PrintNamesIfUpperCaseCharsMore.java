//Assignment - 45 : 4th Feb'2024
//Print all the names from given array if Uppercase characters are more then lowercase characters.
//
//input : {"aAShVI", "TEchNoCRediTs", "ANSh","dhARMma","vIDhItA"}		 
//Output : aAShVI
//		 ANSh
//		 vIDhItA

package prathamesh_tati.array;

public class PrintNamesIfUpperCaseCharsMore {

	void getNamesIfUpperCasesCharsMore(String[] input) {
		for (int i = 0; i < input.length; i++) {
			int uppercaseCount = 0;
			int lowercaseCount = 0;

			for (int j = 0; j < input[i].length(); j++) {
				char ch = input[i].charAt(j);

				if (Character.isUpperCase(ch))
					uppercaseCount++;
				else
					lowercaseCount++;
			}
			if (uppercaseCount > lowercaseCount)
				System.out.println(input[i]);
		}
	}

	public static void main(String[] args) {
		PrintNamesIfUpperCaseCharsMore printNamesIfUpperCaseCharsMore = new PrintNamesIfUpperCaseCharsMore();
		String[] input = { "aAShVI", "TEchNoCRediTs", "ANSh", "dhARMma", "vIDhItA" };
		printNamesIfUpperCaseCharsMore.getNamesIfUpperCasesCharsMore(input);
	}
}