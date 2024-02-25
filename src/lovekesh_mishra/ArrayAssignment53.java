package lovekesh_mishra;

class ArrayAssignment53 {

	void rearrange(int[] input) {
		int j = 0;
		int[] output = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			if (input[i] < 0) {
				output[j] = input[i];
				j++;
			}

		}
		for (int i = 0; i < input.length; i++) {
			if (input[i] > 0) {
				output[j] = input[i];
				j++;
			}
			System.out.print(output[i]);
			System.out.print(",");
		}

	}

	public static void main(String[] args) {
		ArrayAssignment53 ans = new ArrayAssignment53();
		int[] input = { 10, -12, 6, -3, -33, 44, 4 };
		ans.rearrange(input);
	}

}