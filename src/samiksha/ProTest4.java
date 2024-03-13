package samiksha;

import java.util.Arrays;

public class ProTest4 {

	void printSum(int[] arr) {
		int[] sum = new int[(arr.length) / 2];
		int a = 0;
		int[] arr1 = new int[(arr.length) / 2];
		int[] arr2 = new int[(arr.length) / 2];
		int j = 0;
		for (int index = 0; index < (arr.length) / 2; index++) {
			arr1[index] = arr[j];
			j++;
		}
		System.out.println(Arrays.toString(arr1));

		for (int index = 0; index < (arr.length) / 2; index++) {
			arr2[index] = arr[j];
			j++;

		}
		System.out.println(Arrays.toString(arr2));

		for (int index = 0; index < arr1.length; index++) {
			sum[a] = arr1[index] + arr2[index];
			a++;
		}
		System.out.println(Arrays.toString(sum));
	}

	public static void main(String[] args) {
		int[] arr = { 1, 10, 20, 12, 15, 6 };
		new ProTest4().printSum(arr);
	}
}
