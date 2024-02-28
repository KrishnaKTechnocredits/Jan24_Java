package akshada_marne;

import java.util.Arrays;

public class IntegerArrayEndingWithZeros {

	int[] performOperation(int[] input) {

		int j = 0;

		int[] intArr = new int[input.length];

		for (int i = 0; i < intArr.length; i++) {

			if (input[i] != 0) {
				intArr[j] = input[i];
				j++;
			}
		}

		for (int i = 0; i < intArr.length; i++) {

			if (input[i] == 0) {
				intArr[j] = input[i];
				j++;
			}
		}

		return intArr;
	}

	public static void main(String args[]) {
		IntegerArrayEndingWithZeros integerArrayEndingWithZeros = new IntegerArrayEndingWithZeros();
		int[] arr = { 10, -12, 6, -3, 0, 0, -33, 44, 0, 4 };
		int[] output = integerArrayEndingWithZeros.performOperation(arr);
		System.out.println(Arrays.toString(output));
	}

}
