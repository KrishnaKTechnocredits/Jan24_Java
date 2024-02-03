package priya_t;

public class ProgrammingTest_2_LastEvenNofromString {
	String str = "te3ch4nocred8its";

	public void getDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int modifiedstring = Integer.parseInt(String.valueOf(ch));
			}
		}
	}

	public void printlastEvenno(int startIndex, int endIndex) {
		for (int num = endIndex; num >= startIndex; num--) {
			if (num % 2 == 0) {
				System.out.println("Last Even No.from the given String is:" + num);
				break;
			}
		}
	}

	public static void main(String[] args) {
		ProgrammingTest_2_LastEvenNofromString obj = new ProgrammingTest_2_LastEvenNofromString();
		obj.getDigit("te3ch4nocred8its");
		obj.printlastEvenno(4, 8);

	}
}