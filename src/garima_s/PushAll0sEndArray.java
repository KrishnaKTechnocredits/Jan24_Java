package garima_s;

import java.util.Arrays;

public class PushAll0sEndArray {

	int[] pushAll0sArray(int[] input) {
		int[] output = new int[input.length];
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[count] = input[index];
				count++;
			}
		}
		for (int index = 0; index < input.length; index++) {
			if (input[index] == 0) {
				output[count] = input[index];
				count++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, 0, 0, -33, 44, 0, 4 };
		int[] output = new PushAll0sEndArray().pushAll0sArray(arr);
		System.out.println(Arrays.toString(output));
	}
}