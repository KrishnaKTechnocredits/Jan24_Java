package varsha;

public class ProgramTest3 {

	void printEvenNum(String input) {
		for (int index = input.length()-1; index >= 0; index--) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				if (ch % 2 == 0) {
					System.out.println(ch + " : is an even number");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		ProgramTest3 programTest3 = new ProgramTest3();
		programTest3.printEvenNum("te3ch4nocred8its11");
	}
}
