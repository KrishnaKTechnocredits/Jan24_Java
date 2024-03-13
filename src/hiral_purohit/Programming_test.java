package hiral_purohit;

import java.util.Arrays;

public class Programming_test {
	void toGetSplitArray(int[] arr) {
		int[] arr1 = new int[arr.length / 2];
		int[] arr2 = new int[arr.length / 2];
		int[] sum = new int[arr1.length];
		int j = 0;
		int k = 0;
		int n = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			arr1[j] = arr[i];
			j++;
		}
		for (int i = arr.length / 2; i < arr.length; i++) {
			arr2[k] = arr[i];
			k++;
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		for (n = 0; n < arr1.length; n++) {
			sum[n] = arr1[n] + arr2[n];
		}
		System.out.println(Arrays.toString(sum));
	}

	public static void main(String[] args) {
		Programming_test pt = new Programming_test();
		int[] arr = { 1, 10, 20, 12, 15, 6 };
		pt.toGetSplitArray(arr);
	}
}
