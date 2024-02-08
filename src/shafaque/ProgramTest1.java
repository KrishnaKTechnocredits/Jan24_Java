package shafaque;

public class ProgramTest1 {

	void getsumofdigits(String str) {
		int sum = 0;

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				sum = sum + Character.getNumericValue(ch);

			}

		}

		System.out.println(sum);
	}

	public static void main(String[] args) {
		new ProgramTest1().getsumofdigits("te3ch4nocred8its");
		new ProgramTest1().getsumofdigits("technocredits");
	}
}
