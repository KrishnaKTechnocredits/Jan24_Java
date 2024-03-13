/*- create array with max number
- create array with min number
- Create new array with elements of both array (lenght1 + length2) [union of arrays]
- add array element (index to index) and sort
 */

package sasmita;

import java.util.Arrays;

public class Assigment76 {
	int[] getmaxNumberArrays(int[] arr1, int[] arr2) {
		int[] max = new int[arr1.length];
		for (int index = 0; index < max.length; index++) {
			max[index] = arr1[index] > arr2[index] ? arr1[index] : arr2[index];
		}
		return max;
	}

	int[] getminNumberArrays(int[] arr1, int[] arr2) {
		int[] min = new int[arr1.length];
		for (int index = 0; index < min.length; index++) {
			min[index] = arr1[index] < arr2[index] ? arr1[index] : arr2[index];
		}
		return min;
	}

	static int[] getBotharrayElements(int[] arr1, int[] arr2) {
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

	int[] getSumofArrays(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length];
		for (int index = 0; index < output.length; index++) {
			output[index] = arr1[index] + arr2[index];

		}
		Arrays.sort(output);
		return output;
	}

	int[] getAppendArrays(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length + arr2.length];
		int temp = 0;
		for (int index = 0; index < arr1.length; index++) {
			output[index] = arr1[index];
			temp++;
		}
		for (int index = 0; temp < output.length; index++) {
			output[temp] = arr2[index];
			temp++;
		}

		return output;
	}

	void display(int[] output) {
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		int[] num1 = { 23, 34, 46, 67, 87 };
		int[] num2 = { 65, 43, 78, 45, 90 };
		Assigment76 returnArrays = new Assigment76();
		int[] output = returnArrays.getmaxNumberArrays(num1, num2);
		System.out.print("Greater number of Arrays : ");
		returnArrays.display(output);

		int[] output1 = returnArrays.getminNumberArrays(num1, num2);
		System.out.print("Lesser number of Arrays : ");
		returnArrays.display(output1);

		int[] output2 = returnArrays.getSumofArrays(num1, num2);
		System.out.print("Sum of two Arrays : ");
		returnArrays.display(output2);

		int[] output3 = returnArrays.getAppendArrays(num1, num2);
		System.out.print("Append of two Arrays : ");
		returnArrays.display(output3);
	}
}
