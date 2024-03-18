package shraddha;

import java.util.Arrays;

public class Assignment_76 {

	int[] getMaxNumArray(int[] arr1, int[] arr2) {

		int[] max = new int[arr1.length];
		for (int i = 0; i < max.length; i++) {
			max[i] = arr1[i] > arr2[i] ? arr1[i] : arr2[i];
		}
		return max;
	}

	int[] getMinNumArray(int[] arr1, int[] arr2) {

		int[] min = new int[arr1.length];
		for (int i = 0; i < min.length; i++) {
			min[i] = arr1[i] < arr2[i] ? arr1[i] : arr2[i];
		}
		return min;
	}

	int[] uniounArray(int[] arr1, int[] arr2) {
		int[] union = new int[arr1.length + arr2.length];
		int temp = 0;
		for (int i = 0; i < arr1.length; i++) {
			union[i] = arr1[i];
			temp++;
		}
		for (int i = 0; temp < union.length; i++) {
			union[temp] = arr2[i];
			temp++;
		}
		return union;
	}

	int[] sumAndSortArray(int[] arr1, int[] arr2) {
		int[] sum = new int[arr1.length];
		for (int i = 0; i < sum.length; i++) {
			sum[i] = arr1[i] + arr2[i];
		}
		Arrays.sort(sum);
		
		
		return sum;
	}

	public static void main(String[] args) {

		Assignment_76 assignment_76 = new Assignment_76();
		int[] arr1 = { 23, 34, 46, 67, 87 };
		int[] arr2 = { 65, 43, 78, 45, 90 };
		
		int[] output1 = assignment_76.getMaxNumArray(arr1, arr2);
		System.out.println("Max of Arrays");
		System.out.println(Arrays.toString(output1));
		System.out.println();

		int[] output2 = assignment_76.getMinNumArray(arr1, arr2);
		System.out.println("minimum of Arrays");
		System.out.println(Arrays.toString(output2));
		System.out.println();

		int[] output3 = assignment_76.uniounArray(arr1, arr2);
		System.out.println("Union of Arrays");
		System.out.println(Arrays.toString(output3));
		System.out.println();

		int[] output4 = assignment_76.sumAndSortArray(arr1, arr2);
		System.out.println("Sum and Sort of Arrays");
		System.out.println(Arrays.toString(output4));
	}
}
