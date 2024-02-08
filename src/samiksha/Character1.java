package samiksha;

public class Character1 {

	void findDigit(String str) {
		int count = 0;
		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println("total digits are " + count);
	}

	public static void main(String[] args) {
		Character1 character = new Character1();
		character.findDigit("te3c3hn5o2cre3dits");

	}
}
