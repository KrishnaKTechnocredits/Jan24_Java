package varsha;

public class ProgramTest2 {

	void printSumofDigit(String text) {
		int sum = 0;
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("\"Sum of numberic value in given string is : " + sum);
	}

	public static void main(String[] args) {
		ProgramTest2 programTest2 = new ProgramTest2();
		programTest2.printSumofDigit("technocredits");
	}
}
