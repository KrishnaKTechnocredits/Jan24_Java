package akshada_marne;

public class UpperCaseMoreThanLoweCase {

	int countofUpperCase(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isUpperCase(ch) == true)
				count++;
		}
		return count;
	}

	int countofLowerCase(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isLowerCase(ch) == true)
				count++;
		}
		return count;
	}

	void compareAndDisplayString(String[] input) {
		for (int i = 0; i < input.length; i++) {
			int uppercasecount = countofUpperCase(input[i]);
			int lowercasecount = countofLowerCase(input[i]);

			if (uppercasecount > lowercasecount)
				System.out.println(input[i]);
		}

	}

	public static void main(String args[]) {
		UpperCaseMoreThanLoweCase upperCaseMoreThanLoweCase = new UpperCaseMoreThanLoweCase();
		String[] arr = { "aAShVI", "TEchNoCRediTs", "ANSh", "dhARMma", "vIDhItA" };
		upperCaseMoreThanLoweCase.compareAndDisplayString(arr);

	}

}
