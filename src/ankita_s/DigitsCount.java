package ankita_s;

public class DigitsCount {

	void printDigitsCount(String Str) {
		int count = 0;
		{
			for (int index = 0; index < Str.length(); index++) {
				char ch = Str.charAt(index);
				boolean temp = Character.isDigit(ch);
				if (temp == true) {
					count++;
				}
			}
			System.out.println("Total count of digits is :" + count);
		}
	}

	public static void main(String[] args) {
		DigitsCount digitsCount = new DigitsCount();
		digitsCount.printDigitsCount("te3c3hn5o2cre3dits");
	}
}
