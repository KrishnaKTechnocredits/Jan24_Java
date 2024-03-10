package hiral_purohit;

import java.util.Arrays;

/*- create array with max number
- create array with min number
- Create new array with elements of both array (lenght1 + length2) [union of arrays]
- add array element (index to index) and sort*/

public class Assignment_76_1 {

	int[] getMaxElementOfArray(int[] arr1, int[] arr2) {
		int max[] = new int[arr1.length];
		for (int i = 0; i < max.length; i++) {
			max[i] = arr1[i] > arr2[i] ? arr1[i] : arr2[i];
		}
		return max;
	}

	int[] togetMinElementOfArray(int[] arr1, int[] arr2) {
		int[] min = new int[arr1.length];
		for (int i = 0; i < min.length; i++) {
			min[i] = arr1[i] < arr2[i] ? arr1[i] : arr2[2];
		}
		return min;
	}

	int[] getNewArrayFromBothArray(int[] arr1, int[] arr2) {
		int length = arr1.length + arr2.length;
		int[] output = new int[length];
		int j = 0;
		for (int i = 0; i < arr1.length; i++) {
			output[j] = arr1[i];
			j++;
		}
		for (int i = 0; i < arr2.length; i++) {
			output[j] = arr2[i];
			j++;
		}
		return output;
	}

	int[] toGetSumOfArrays(int[] arr1, int[] arr2) {
		int[] sum = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			sum[i] = arr1[i] + arr2[i];
		}
		Arrays.sort(sum);
		return sum;
	}

	public static void main(String[] args) {
		int[] arr1 = { 23, 34, 46, 67, 87 };
		int[] arr2 = { 65, 43, 78, 45, 90 };
		Assignment_76_1 assignment_76_1 = new Assignment_76_1();
		System.out.println("array with max number");
		int[] output1 = assignment_76_1.getMaxElementOfArray(arr1, arr2);
		System.out.println(Arrays.toString(output1));
		System.out.println("---------------------------------");
		System.out.println("array with minimim number");
		int[] output2 = assignment_76_1.togetMinElementOfArray(arr1, arr2);
		System.out.println(Arrays.toString(output2));
		System.out.println("---------------------------------");
		System.out.println("new array with elements of both array");
		int[] output3 = assignment_76_1.getNewArrayFromBothArray(arr1, arr2);
		System.out.println(Arrays.toString(output3));
		System.out.println("---------------------------------");
		System.out.println("add array element (index to index) and sort");
		int[] output4 = assignment_76_1.toGetSumOfArrays(arr1, arr2);
		System.out.println(Arrays.toString(output4));
	}
}
