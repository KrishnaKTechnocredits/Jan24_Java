/*-create array with max number
- create array with min number
- Create new array with elements of both array (lenght1 + length2) [union of arrays]
- add array element (index to index) and sort
*/
package rupali_umagol;

import java.util.Arrays;

public class Assignment76 {

	int[] getMaxNumArray(int[] arr1, int[] arr2) {

		int[] result = new int[arr1.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = arr1[i] > arr2[i] ? arr1[i] : arr2[i];
		}
		return result;
	}

	int[] getMinNumArray(int[] arr1, int[] arr2) {

		int[] result = new int[arr1.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = arr1[i] < arr2[i] ? arr1[i] : arr2[i];
		}
		return result;
	}

	int[] getUniounNumArray(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length + arr2.length];
		int temp = 0;
		for (int i = 0; i < arr1.length; i++) {
			result[i] = arr1[i];
			temp++;
		}
		for (int i = 0; temp < result.length; i++) {
			result[temp] = arr2[i];
			temp++;
		}
		return result;
	}

	int[] getSumAndSortNumArray(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = arr1[i] + arr2[i];
		}
		Arrays.sort(result);
		
		
		return result;
	}

	public static void main(String[] args) {

		Assignment76 assignment76 = new Assignment76();
		int[] arr1 = { 23, 34, 46, 67, 87 };
		int[] arr2 = { 65, 43, 78, 45, 90 };
		int[] output1 = assignment76.getMaxNumArray(arr1, arr2);
		System.out.println("Output of Max Arrays");
		System.out.println(Arrays.toString(output1));

		int[] output2 = assignment76.getMinNumArray(arr1, arr2);
		System.out.println("Output of Min Arrays");
		System.out.println(Arrays.toString(output2));

		int[] output3 = assignment76.getUniounNumArray(arr1, arr2);
		System.out.println("Output of Unioun of Arrays");
		System.out.println(Arrays.toString(output3));

		int[] output4 = assignment76.getSumAndSortNumArray(arr1, arr2);
		System.out.println("Output of Sum of Sort of Arrays");
		System.out.println(Arrays.toString(output4));
	}
}
