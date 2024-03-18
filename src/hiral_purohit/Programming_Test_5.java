package hiral_purohit;

import java.util.Arrays;

public class Programming_Test_5 {

	int toGetCount(int[] arr) {
		int count = 0;
		for (int n : arr) {
			if (n % 5 == 0) {
				count++;
			}
		}
		return count;
	}

	void toGetArray(int[] arr) {
		int count = toGetCount(arr);
		int[] output = new int[count];
		int j = 0;
		for (int num : arr) {
			if (num % 5 == 0) {
				output[j++] = num;
			}
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] str) {
		int[] arr = { 10, 32, 44, 55, 25, 23 };
		new Programming_Test_5().toGetArray(arr);
	}

}
