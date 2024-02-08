package varsha;

public class ProgramTest4 {

	void printConsonant(String input) {
		for (int index = input.length() - 1; index >= 0; index--) {
			char ch = input.charAt(index);
			if ((ch != 'a') && (ch != 'e') && (ch != 'i') && (ch != 'o') && (ch != 'u')) {
				System.out.println("Consonant character in given string is : " + ch);
				break;
			}
		}
	}

	public static void main(String[] args) {
		ProgramTest4 programTest4 = new ProgramTest4();
		programTest4.printConsonant("aakansha");
	}

}
