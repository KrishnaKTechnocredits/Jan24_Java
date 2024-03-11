package varsha.intArray;

import java.util.Arrays;

//- create array with max number
//- create array with min number
//- Create new array with elements of both array (lenght1 + length2) [union of arrays]
//- add array element (index to index) and sort
//int[]arr1 = [23, 34, 46, 67, 87]
//int[]arr2 = [65, 43, 78, 45, 90]
//Condition 1 output - create array with max number - [65, 43, 78, 67, 90]
//Condition 2 output - create array with max number - [23, 34, 46, 45, 87]
//Condition 3 output - Create new array with elements of both array (lenght1 + length2) [union of arrays] - [23, 34, 46, 67, 87, 65, 43, 78, 45, 90]
//Condition 4 output - add array element (index to index) and sort - [88, 77, 124, 112, 177]

public class IntegerArray {

	static int[] getMaxNumArray(int[] arr1, int[] arr2) {
		int length = arr1.length > arr2.length ? arr1.length : arr2.length;
		int[] result = new int[length];
		for (int index = 0; index < result.length; index++) {
			result[index] = arr1[index] > arr2[index] ? arr1[index] : arr2[index];
		}
		return result;
	}

	static int[] getMinNumArray(int[] arr1, int[] arr2) {
		int length = arr1.length > arr2.length ? arr1.length : arr2.length;
		int[] result = new int[length];
		for (int index = 0; index < result.length; index++) {
			result[index] = arr1[index] < arr2[index] ? arr1[index] : arr2[index];
		}
		return result;
	}

	static int[] getConcatenateNumArray(int[] arr1, int[] arr2) {
		int length = arr1.length + arr2.length;
		int[] result = new int[length];
		int count = 0;
		for (int index = 0; index < arr1.length; index++) {
			result[count] = arr1[index];
			count++;
		}

		for (int index = 0; index < arr2.length; index++) {
			result[count] = arr2[index];
			count++;
		}
		return result;
	}

	static int[] getSumOfNumArray(int[] arr1, int[] arr2) {
		int length = arr1.length > arr2.length ? arr1.length : arr2.length;
		int[] result = new int[length];
		for (int index = 0; index < result.length; index++) {
			result[index] = arr1[index] + arr2[index];
		}
		Arrays.sort(result);
		return result;
	}

	public static void main(String[] args) {
		int[] arr1 = { 23, 34, 46, 67, 87 };
		int[] arr2 = { 65, 43, 78, 45, 90 };
		System.out.println("-----MaxNumArray-----");
		int[] output = IntegerArray.getMaxNumArray(arr1, arr2);
		System.out.println(Arrays.toString(output));
		System.out.println("-----MinNumArray-----");
		int[] output1 = IntegerArray.getMinNumArray(arr1, arr2);
		System.out.println(Arrays.toString(output1));
		System.out.println("-----ConcatenateNumArray-----");
		int[] output2 = IntegerArray.getConcatenateNumArray(arr1, arr2);
		System.out.println(Arrays.toString(output2));
		System.out.println("-----SumOfNumArray-----");
		int[] output3 = IntegerArray.getSumOfNumArray(arr1, arr2);
		System.out.println(Arrays.toString(output3));
	}
}
