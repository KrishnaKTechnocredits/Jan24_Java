package gaurav_garg;

public class Programming_Test_2a {

	void printLastEvenIntegerInString(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			char char1 = str.charAt(i);
			boolean flag = Character.isDigit(char1);

			if (flag == true) {

				if (Character.getNumericValue(char1) % 2 == 0) {
					System.out.print(char1);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		new Programming_Test_2a().printLastEvenIntegerInString("te3ch4nocred8it71s");
	}
}
