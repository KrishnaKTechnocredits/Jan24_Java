package ashwini_b;

/*
 Return last even number of string As3h4wi6ni
 */
public class LastEvenNumOfString {

	void evenNum(String input) {
		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);

			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				if (num % 2 == 0) {
					System.out.println("Last even number is " + num);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		LastEvenNumOfString lastEvenNumOfString = new LastEvenNumOfString();
		lastEvenNumOfString.evenNum("As3h4wi6ni");
	}

}
