package aanand;

public class Assignment_32 {

	void reverseArray(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Assignment_32 assignment_32 = new Assignment_32();
		int[] input = { 10, 20, 13, 27, 29, 13, 6 };
		assignment_32.reverseArray(input);
	}
}