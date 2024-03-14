package gaurav_garg;

import java.util.Arrays;

public class Gaurav_Programming_Test_4 {

	int[] printDivideArrayAndSum(int arr[]) {
		int len1 = arr.length;
		int len2 = 0;
		if (len1 % 2 == 0) {
			len2 = arr.length / 2;
		}
		int arr1[] = new int[len2];
		int arr2[] = new int[len2];
		int sum[] = new int[len2];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[len2 + i];
		}
		for (int i = 0; i < arr2.length; i++) {
			sum[i] = arr1[i] + arr2[i];
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		return sum;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 10, 20, 12, 15, 6 };
		int sum[] = new Gaurav_Programming_Test_4().printDivideArrayAndSum(arr);
		System.out.println("Sum of 2 array");
		System.out.println(Arrays.toString(sum));
	}
}
