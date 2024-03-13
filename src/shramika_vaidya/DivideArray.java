package shramika_vaidya;

import java.util.Arrays;

public class DivideArray {

	static int[] getFirstArrayDivided(int[] arr1) {
		int length = (arr1.length) / 2;
		int[] arr2 = new int[length];
		int j = 0;
		for (int i = 0; i < length; i++) {
			arr2[j] = arr1[i];
			j++;
		}
		String str1 = Arrays.toString(arr2);
		System.out.println(str1);
		return arr2;
	}

	static int[] get2ndArray(int[] arr) {
		int length = (arr.length) / 2;
		int[] arr3 = new int[length];
		int j = 0;
		for (int index = length; index < arr.length; index++) {
			arr3[j] = arr[index];
			j++;
		}
		String str2 = Arrays.toString(arr3);
		System.out.println(str2);
		return arr3;
	}

	int[] getSumOfIndex(int[] input1, int[] input2) {
		int sum = 0;
		int[] sum1 = new int[input1.length];
		for (int i = 0; i < input1.length; i++) {
			sum = input1[i] + input2[i];
			sum1[i] = sum;
		}
		System.out.println("sum of arrayIndex ->  " + Arrays.toString(sum1));
		return sum1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 10, 20, 12, 15, 6 };
		int[] arr4 = getFirstArrayDivided(arr);
		int[] arr5 = get2ndArray(arr);
		new DivideArray().getSumOfIndex(arr4, arr5);
	}
}
