package gaurav_garg;

import java.util.Arrays;

public class ArrayOutputAssignment76 {

	void maxElementInComparingTwoArray(int arr1[], int arrr2[]) {
		int outputarray[] = new int[arr1.length];
		int j = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > arrr2[i]) {
				outputarray[j++] = arr1[i];
			} else
				outputarray[j++] = arrr2[i];
		}
		System.out.println("Output of 2 array with Comparing Max Element");
		System.out.println(Arrays.toString(outputarray));
	}

	void minElementInComparingTwoArray(int arr1[], int arrr2[]) {
		int outputarray[] = new int[arr1.length];
		int j = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > arrr2[i]) {
				outputarray[j++] = arrr2[i];
			} else
				outputarray[j++] = arr1[i];
		}
		System.out.println("Output of 2 array with Comparing Min Element");
		System.out.println(Arrays.toString(outputarray));
	}

	void unionOfTwoArray(int arr1[], int arrr2[]) {
		int leangth = arr1.length + arrr2.length;
		int outputarray[] = new int[leangth];
		int j = 0;
		for (int i = 0; i < arr1.length; i++) {
			outputarray[j++] = arr1[i];
		}
		for (int i = 0; i < arrr2.length; i++) {
			outputarray[j++] = arrr2[i];
		}
		System.out.println("Union Output of 2 array ");
		System.out.println(Arrays.toString(outputarray));
	}

	void sumOfElementInTwoArray(int arr1[], int arrr2[]) {
		int outputarray[] = new int[arr1.length];
		int j = 0;
		for (int i = 0; i < arr1.length; i++) {
			outputarray[j++] = arr1[i] + arrr2[i];
		}
		System.out.println("Sum of Output of 2 array");
		System.out.println(Arrays.toString(outputarray));
	}

	public static void main(String[] args) {
		int arr1[] = { 23, 34, 46, 67, 87 };
		int arr2[] = { 65, 43, 78, 45, 90 };
		ArrayOutputAssignment76 arrayOutputAssignment76 = new ArrayOutputAssignment76();
		arrayOutputAssignment76.maxElementInComparingTwoArray(arr1, arr2);
		arrayOutputAssignment76.minElementInComparingTwoArray(arr1, arr2);
		arrayOutputAssignment76.unionOfTwoArray(arr1, arr2);
		arrayOutputAssignment76.sumOfElementInTwoArray(arr1, arr2);
	}
}
