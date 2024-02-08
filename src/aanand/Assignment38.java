package aanand;

public class Assignment38 {

	void getMax(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Max number of array: " + max);
	}

	void getMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Min number of array: " + min);
	}

	public static void main(String[] args) {
		int[] input = { 10, 20, 50, 60, 30 };
		Assignment38 assignment38 = new Assignment38();
		assignment38.getMax(input);
		assignment38.getMin(input);
	}
}