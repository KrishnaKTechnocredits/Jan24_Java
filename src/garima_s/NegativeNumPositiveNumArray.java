package garima_s;

import java.util.Arrays;

public class NegativeNumPositiveNumArray {

	int[] negativePositiveArray(int[] input) {
		int[] output = new int[input.length];
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] < 0) {
				output[count] = input[index];
				count++;
			}
		}
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0) {
				output[count] = input[index];
				count++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, -33, 44, 4 };
		int[] output = new NegativeNumPositiveNumArray().negativePositiveArray(arr);
		System.out.println(Arrays.toString(output));
	}
}
