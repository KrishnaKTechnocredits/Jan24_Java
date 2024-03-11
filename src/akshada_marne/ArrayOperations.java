package akshada_marne;

import java.util.Arrays;

public class ArrayOperations {

	int[] maxNumberArray(int[] arr1, int[] arr2) {
		int num = 0;
		int[] output = new int[arr1.length];

		for (int i = 0; i < output.length; i++) {
			/*
			 * if(arr1[i]>arr2[i]) { num=arr1[i]; } else { num=arr2[i]; }
			 */

			num = arr1[i] > arr2[i] ? arr1[i] : arr2[i];
			output[i] = num;

		}
		return output;

	}

	int[] minNumberArray(int[] arr1, int[] arr2) {
		int num = 0;
		int[] output = new int[arr1.length];
		for (int i = 0; i < output.length; i++) {

			num = arr1[i] < arr2[i] ? arr1[i] : arr2[i];
			output[i] = num;

			/*
			 * if(arr1[i]<arr2[i]) { output[i]=arr1[i]; } else { output[i]=arr2[i]; }
			 */
		}
		return output;
	}

	int[] addArrayElementAndSort(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length];
		for (int i = 0; i < output.length; i++) {
			int sum = 0;
			sum = sum + arr1[i] + arr2[i];
			output[i] = sum;
		}
		Arrays.sort(output);

		return output;
	}

	int[] arrayUnion(int[] arr1, int[] arr2) {

		int len = arr1.length + arr2.length;
		int[] output = new int[len];
		int j = 0;
		for (int i = 0; i < arr1.length; i++) {
			output[i] = arr1[i];
			j++;
		}
		for (int index = 0; j < output.length; index++) {

			output[j] = arr2[index];
			j++;

		}
		return output;
	}

	void display(int[] arr) {

		System.out.println(Arrays.toString(arr));

	}

	public static void main(String args[]) {

		int[] arr1 = { 23, 34, 46, 67, 87 };
		int[] arr2 = { 65, 43, 78, 45, 90 };

		ArrayOperations arrayOperations = new ArrayOperations();

		int[] maxNumberArrayOutput = arrayOperations.maxNumberArray(arr1,arr2);
		arrayOperations.display(maxNumberArrayOutput);

		int[] minNumberArrayOutput = arrayOperations.minNumberArray(arr1,arr2);
		arrayOperations.display(minNumberArrayOutput);

		int[] addArrayElementAndSortOutput = arrayOperations.addArrayElementAndSort(arr1,arr2);
		arrayOperations.display(addArrayElementAndSortOutput);

		int[] arrayUnionOutput = arrayOperations.arrayUnion(arr1,arr2);
		arrayOperations.display(arrayUnionOutput);
	}

}
