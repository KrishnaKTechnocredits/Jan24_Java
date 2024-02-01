package ashwini_b;

/*
 WAP to find out how many digits are there in given string. 
input : te3c3hn5o2cre3dits
output : 5

Hint : boolean Character.isDigit(char ch)

 */
public class CountDigitsInString {
	void digitCount(String input) {
		int count = 0;
		for (int index = 0; index <= input.length() - 1; index++) {
			char ch = input.charAt(index);
			// System.out.println(ch + " = " + Character.isDigit(ch));
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println("output : " + count);
	}

	public static void main(String[] args) {
		CountDigitsInString countDigitsInString = new CountDigitsInString();
		countDigitsInString.digitCount("te3c3hn5o2cre3dits");
	}

}
