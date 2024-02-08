package suresh;

public class ReverseOrder {
	void method(String input) {
		for (int index = input.length() - 1; index >= 0; index--) {
			char ans = input.charAt(index);
			System.out.println(ans);
		}

	}

	public static void main(String[] args) {
		ReverseOrder reverseOrder = new ReverseOrder();
		reverseOrder.method("techno");

	}
}