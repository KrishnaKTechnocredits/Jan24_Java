package madhura_kulkarni;

import java.util.Arrays;

public class ProgrammingTest5 {
	int reqSizeOfArray(int[] arr) {
		int count = -0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0) {
				count++;
			}
		}
		return count;
	}

	int[] getNumbers(int[] arr) {
		int[] output = new int[reqSizeOfArray(arr)];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0) {
				output[index] = arr[i];
				index++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] input = { 10, 32, 44, 55, 25, 23 };
		ProgrammingTest5 pr = new ProgrammingTest5();
		int[] output = pr.getNumbers(input);
		System.out.println("Input array is : " + Arrays.toString(input));
		System.out.println("Input array is : " + Arrays.toString(output));
	}
}
