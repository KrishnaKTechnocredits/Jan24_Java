package lovekesh_mishra;

class ReverseOrderArrayAssignment32 {

	void reverse(int[] input) {
		for (int index = input.length - 1; index >= 0; index--) {
			System.out.println(input[index]);

		}
	}

	public static void main(String[] args) {
		ReverseOrderArrayAssignment32 reverseOrder = new ReverseOrderArrayAssignment32();
		int[] arr = { 10, 20, 13, 27, 13, 6 };
		reverseOrder.reverse(arr);

	}
}
