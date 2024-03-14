package ankita_s;

import java.util.Arrays;

public class Assignment76 {
	int[] getMaxArrays(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length];
		for (int index = 0; index < result.length; index++) {
			result[index] = arr1[index] > arr2[index] ? arr1[index] : arr2[index];
		}
		return result;
	}

	int[] getMinArrays(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length];
		for (int index = 0; index < result.length; index++) {
			result[index] = arr1[index] < arr2[index] ? arr1[index] : arr2[index];
		}
		return result;
	}

	int[] getSumArrays(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length];
		for (int index = 0; index < result.length; index++) {
			result[index] = arr1[index] + arr2[index];
		}
		Arrays.sort(result);
		return result;
	}

	int[] getBothArrays(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length + arr2.length];
		int temp = 0;
		for (int index = 0; index < arr1.length; index++) {
			result[index] = arr1[index];
			temp++;
		}
		for (int index = 0; temp < result.length; index++) {
			result[temp] = arr2[index];
			temp++;
		}

		return result;
	}

	void display(int[] output) {
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		int[] num1 = { 23, 34, 46, 67, 87 };
		int[] num2 = { 65, 43, 78, 45, 90 };
		Assignment76 ass76 = new Assignment76();
		int[] result = ass76.getMaxArrays(num1, num2);
		System.out.print("MAX number of Arrays : ");
		ass76.display(result);

		int[] result1 = ass76.getMinArrays(num1, num2);
		System.out.print("min number of Arrays : ");
		ass76.display(result1);

		int[] result2 = ass76.getSumArrays(num1, num2);
		System.out.print("Sum of Arrays : ");
		ass76.display(result2);

		int[] result3 = ass76.getBothArrays(num1, num2);
		System.out.print("Append of two Arrays : ");
		ass76.display(result3);
	}
}