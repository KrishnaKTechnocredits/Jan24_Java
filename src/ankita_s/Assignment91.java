package ankita_s;

import java.util.Arrays;

public class Assignment91 {

	void getZerosAtEnd(int[] arr) {
		int count = 0;
		int[] output = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				output[count] = arr[i];
				count++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				output[count] = arr[i];
				count++;
			}
		}
		System.out.println(Arrays.toString(output));
	}

	void getZerosAtBeginning(int[] arr) {
		int count = 0;
		int[] output = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				output[count] = arr[i];
				count++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				output[count] = arr[i];
				count++;
			}
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 12, 63, 4, 0, 0, 5, 6, 7 };
		Assignment91 ass91 = new Assignment91();
		ass91.getZerosAtEnd(arr);
		ass91.getZerosAtBeginning(arr);
	}
}
