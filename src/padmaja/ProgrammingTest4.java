package padmaja;

import java.util.Arrays;

public class ProgrammingTest4 {

	void divideArrayWithEquqlLength(int[] num) {
		int[] arr1 = new int[num.length / 2];
		int[] arr2 = new int[num.length / 2];
		int[] sumarr = new int[arr1.length];
		int count = 0;
		for (int index = 0; index < arr1.length; index++) {
			arr1[count] = num[index];
			count++;
		}
		System.out.println(Arrays.toString(arr1));
		for (int index = 0; index < arr2.length; index++) {
			arr2[index] = num[count];
			count++;
		}
		System.out.println(Arrays.toString(arr2));

		for (int index = 0; index < arr1.length; index++) {
			sumarr[index] = (arr1[index] + arr2[index]);
		}
		System.out.println(Arrays.toString(sumarr));
	}

	public static void main(String[] args) {
		int[] input = { 1, 10, 20, 12, 15, 6 };
		ProgrammingTest4 test = new ProgrammingTest4();
		test.divideArrayWithEquqlLength(input);
	}
}
