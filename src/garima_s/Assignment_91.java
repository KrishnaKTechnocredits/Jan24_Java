package garima_s;

import java.util.Arrays;

public class Assignment_91 {

	void push0AtEnd(int[] arr) {
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

	void push0AtBeginning(int[] arr) {
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
		Assignment_91 assignment_91 = new Assignment_91();
		assignment_91.push0AtEnd(arr);
		assignment_91.push0AtBeginning(arr);
	}
}
