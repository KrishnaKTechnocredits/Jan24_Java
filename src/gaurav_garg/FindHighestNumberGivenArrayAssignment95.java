package gaurav_garg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class FindHighestNumberGivenArrayAssignment95 {

	int getHighestNumber(int aa[]) {
		int max = 0;
		for (int i = 0; i < aa.length; i++) {
			if (max < aa[i]) {
				max = aa[i];
			}
		}
		return max;
	}

	int[] replacearray(int aa[], int max) {
		int newaarray[] = new int[aa.length];
		int j = 0;
		for (int i = 0; i < aa.length; i++) {
			if (aa[i] == max) {
				newaarray[j++] = 0;
			} else {
				newaarray[j++] = aa[i];
			}
		}
		return newaarray;
	}

	void NthHighetNumberUsingArrayWithoutSorting(int arr[], int n) {

		int arr1[] = new int[arr.length];
		arr1 = Arrays.copyOf(arr, arr.length);
		int max = 0;
		if (n == 1) {
			max = getHighestNumber(arr1);
		} else {
			max = getHighestNumber(arr1);
			for (int i = 1; i < n; i++) {
				int newarr[] = replacearray(arr1, max);
				max = getHighestNumber(newarr);
				/*
				 * for (int k = 0; k < arr1.length; k++) { arr1[k] = newarr[k]; }
				 */
				arr1 = newarr;
			}
		}
		System.out.println("Highest " + n + " poition element is " + max);
	}

	void NthHighetNumberUsingArrayWithSorting(int arr[], int n) {

		int max = 0;
		int arr1[] = new int[arr.length];
		arr1 = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arr1);
		if (n == 1) {
			max = arr1[arr1.length - 1];
		} else {
			for (int i = 1; i < n; i++) {
				int newarr[] = replacearray(arr1, max);
				Arrays.sort(newarr);
				max = newarr[arr1.length - 1];
				arr1 = newarr;
			}
		}
		System.out.println("Highest " + n + " poition element is " + max);
	}

	void NthHighetNumberUsingArrayWithCollectionFramework(int arr[], int n) {
		TreeSet<Integer> hs = new TreeSet<Integer>();
		int max = 0;
		for (int num : arr) {
			hs.add(num);
		}
		ArrayList<Integer> arr1 = new ArrayList<Integer>(hs);
		if (n == 0) {
			max = arr1.get(arr1.size() - 1);
		} else {
			max = arr1.get(arr1.size() - 1);
			for (int i = 1; i < n; i++) {
				while (arr1.contains(Integer.valueOf(max))) {
					arr1.remove(Integer.valueOf(max));
				}
				Collections.sort(arr1);
				max = arr1.get(arr1.size() - 1);
			}
		}

		System.out.println("Highest " + n + " poition element is " + max);
	}

	public static void main(String[] args) {
		int arr1[] = { 2, 22, 3, 55, 66, 77, 34, 26 };
		System.out.println(Arrays.toString(arr1));
		System.out.println();
		System.out.println("Highest Number Using Array Without Sorting -:");
		new FindHighestNumberGivenArrayAssignment95().NthHighetNumberUsingArrayWithoutSorting(arr1, 1);
		new FindHighestNumberGivenArrayAssignment95().NthHighetNumberUsingArrayWithoutSorting(arr1, 2);
		new FindHighestNumberGivenArrayAssignment95().NthHighetNumberUsingArrayWithoutSorting(arr1, 3);
		new FindHighestNumberGivenArrayAssignment95().NthHighetNumberUsingArrayWithoutSorting(arr1, 4);
		System.out.println();
		System.out.println("Highest Number Using Array With Sorting -:");
		new FindHighestNumberGivenArrayAssignment95().NthHighetNumberUsingArrayWithoutSorting(arr1, 1);
		new FindHighestNumberGivenArrayAssignment95().NthHighetNumberUsingArrayWithoutSorting(arr1, 2);
		new FindHighestNumberGivenArrayAssignment95().NthHighetNumberUsingArrayWithoutSorting(arr1, 3);
		new FindHighestNumberGivenArrayAssignment95().NthHighetNumberUsingArrayWithoutSorting(arr1, 4);
		System.out.println();
		System.out.println("Second highest Number Using Array With Collection Framework -:");
		new FindHighestNumberGivenArrayAssignment95().NthHighetNumberUsingArrayWithCollectionFramework(arr1, 2);
		System.out.println();
		System.out.println("Highest Number Using Array With Collection Framework -:");
		new FindHighestNumberGivenArrayAssignment95().NthHighetNumberUsingArrayWithCollectionFramework(arr1, 1);
		new FindHighestNumberGivenArrayAssignment95().NthHighetNumberUsingArrayWithCollectionFramework(arr1, 2);
		new FindHighestNumberGivenArrayAssignment95().NthHighetNumberUsingArrayWithCollectionFramework(arr1, 3);
		new FindHighestNumberGivenArrayAssignment95().NthHighetNumberUsingArrayWithCollectionFramework(arr1, 4);
	}
}
