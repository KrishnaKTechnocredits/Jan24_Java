/*-create array with max number
- create array with min number
- Create new array with elements of both array (lenght1 + length2) [union of arrays]
- add array element (index to index) and sort
*/

package garima_s;

import java.util.Arrays;

public class ReturnArrays {
	int[] getGreaterArrays(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length];
		for (int index = 0; index < output.length; index++) {
			output[index] = arr1[index] > arr2[index] ? arr1[index] : arr2[index];
		}
		return output;
	}

	int[] getlesserArrays(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length];
		for (int index = 0; index < output.length; index++) {
			output[index] = arr1[index] < arr2[index] ? arr1[index] : arr2[index];
		}
		return output;
	}

	int[] getSumArrays(int[] arr1, int[] arr2) {
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
		ReturnArrays returnArrays = new ReturnArrays();
		int[] output = returnArrays.getGreaterArrays(num1, num2);
		System.out.print("Greater number of Arrays : ");
		returnArrays.display(output);

		int[] output1 = returnArrays.getlesserArrays(num1, num2);
		System.out.print("Lesser number of Arrays : ");
		returnArrays.display(output1);

		int[] output2 = returnArrays.getSumArrays(num1, num2);
		System.out.print("Sum of two Arrays : ");
		returnArrays.display(output2);

		int[] output3 = returnArrays.getAppendArrays(num1, num2);
		System.out.print("Append of two Arrays : ");
		returnArrays.display(output3);
	}
}
