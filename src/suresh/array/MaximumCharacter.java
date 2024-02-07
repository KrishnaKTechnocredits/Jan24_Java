package suresh.array;

public class MaximumCharacter {

	void reverseOrder(int[] input) {

		for (int i = input.length - 1; i >= 0; i--) {
			System.out.println(input[i]);
		}

	}

	public static void main(String[] args) {

		MaximumCharacter maximumCharacter = new MaximumCharacter();
		int arr[] = { 10, 20, 13, 27, 29, 13, 6 };
		maximumCharacter.reverseOrder(arr);
	}

}
