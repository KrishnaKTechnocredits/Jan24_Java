package akshada_marne;

import java.util.Arrays;

public class RearrangeIntegerArray {

	int[] printArray(int[] input) {

		int[] output = new int[input.length];
		int j = 0;

		for (int i = 0; i < input.length; i++) {
			if (input[i] < 0) {
				output[j] = input[i];
				j++;
			}
		}

		for (int i = 0; i < input.length; i++) {
			if (input[i] >= 0) {
				output[j] = input[i];
				j++;
			}
		}
		return output;
	}

	public static void main(String args[]) {
		RearrangeIntegerArray rearrangeIntegerArray = new RearrangeIntegerArray();
		int[] arr = { 10, -12, 6, -3, -33, 44, 4 };
		int[] printoutput = rearrangeIntegerArray.printArray(arr);
		System.out.println(Arrays.toString(printoutput));

	}

}
