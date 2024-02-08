package shramika_vaidya;

public class LastEvenNum {

	void printLastEvenNum(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				if (num % 2 == 0) {
					System.out.print(ch);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		new LastEvenNum().printLastEvenNum("tech4nocred8its");
	}
}
