//Assignment 18 :Print character of given String in reverse order.

package padmaja;

public class CharacterInReverseOrder {
	void printCharInReverse(String input) {
		for (int index = input.length() - 1; index >= 0; index--) {
			System.out.println(input.charAt(index));
		}
	}

	public static void main(String[] args) {
		CharacterInReverseOrder characterInReverseOrder = new CharacterInReverseOrder();
		characterInReverseOrder.printCharInReverse("techno");
	}
}
