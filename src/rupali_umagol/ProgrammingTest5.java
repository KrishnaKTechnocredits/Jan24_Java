package rupali_umagol;

import java.util.Arrays;

public class ProgrammingTest5 {

	int getCount(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0)
				count++;
		}
		return count;
	}

	void getNumberFromArray(int[] arr) {
		int temp = 0;
		int count = getCount(arr);
		int[] output = new int[count];
		for (int i = 0; i < arr.length  ; i++) {
			if (arr[i] % 5 == 0) {
				output[temp] = arr[i];
				temp++;
			}
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		ProgrammingTest5 programmingTest = new ProgrammingTest5();
		int[] input = { 10, 32, 44, 55, 25, 23 };
		programmingTest.getNumberFromArray(input);
	}
}
