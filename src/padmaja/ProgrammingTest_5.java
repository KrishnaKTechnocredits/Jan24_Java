package padmaja;

import java.util.Arrays;

public class ProgrammingTest_5 {
	int count = 0;

	int getOutputArrayLength(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 5 == 0)
				count++;
		}
		return count;
	}

	int[] getNosDivisibleby5(int[] arr) {
		int count = getOutputArrayLength(arr);
		int[] output = new int[count];
		int temp = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 5 == 0) {
				output[temp] = arr[index];
				temp++;
			}
		}
		System.out.println(Arrays.toString(output));
		return output;
	}

	public static void main(String[] args) {
		int[] input = { 10, 32, 44, 55, 25, 23 };
		new ProgrammingTest_5().getNosDivisibleby5(input);
	}
}
