package lovekesh_mishra;

class AssignmentNumber54 {

	void pushZero(int[] input) {
		int j = 0;
		int[] output = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			if (input[i] != 0) {
				output[j] = input[i];
				j++;
			}
		}

		for (int i = 0; i < input.length; i++) {
			if (input[i] == 0) {
				output[j] = input[i];
				j++;
			}
			System.out.print(output[i]);
			System.out.print(",");
		}
	}

	public static void main(String[] args) {
		AssignmentNumber54 ans = new AssignmentNumber54();
		int[] arr = { 10, -12, 6, -3, 0, 0, -33, 44, 0, 4 };
		ans.pushZero(arr);
	}
}