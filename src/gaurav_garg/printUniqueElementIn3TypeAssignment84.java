/*
 * int arr[]= {10, 10, 3, 4, 3, 3, 3, 3, 55, 56};
 * output-: 4 55 56
 */

package gaurav_garg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class printUniqueElementIn3TypeAssignment84 {

	void usingArrayList(int arr[]) {
		ArrayList<Integer> hg = new ArrayList<Integer>();
		for (int num : arr) {
			hg.add(num);
		}
		System.out.println("Unique Element in Array List -: ");
		for (int num : arr) {
			if (hg.indexOf(num) == hg.lastIndexOf(num)) {
				System.out.println(num);
			}
		}
	}

	int getCountofOccurance(int nums[], int num) {
		int count = 0;
		for (int num1 : nums) {
			if (num1 == num) {
				count++;
			}
		}
		return count;
	}

	void usingArray(int arr[]) {
		System.out.println("Unique Element in Array -: ");

		for (int num : arr) {
			int count = getCountofOccurance(arr, num);
			if (count == 1) {
				System.out.println(num);
			}
		}
	}

	void usingHashmap(int arr[]) {
		HashMap<Integer, Integer> hg = new HashMap<Integer, Integer>();
		System.out.println("Unique Element in Hash Map -: ");

		for (int num : arr) {
			if (hg.containsKey(num)) {
				int count = hg.get(num);
				hg.put(num, count + 1);
			} else {
				hg.put(num, 1);
			}
		}

		Set<Integer> all = hg.keySet();

		for (int key : all) {
			if (hg.get(key) == 1) {
				System.out.println(key);
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		new printUniqueElementIn3TypeAssignment84().usingArrayList(arr);
		new printUniqueElementIn3TypeAssignment84().usingArray(arr);
		new printUniqueElementIn3TypeAssignment84().usingHashmap(arr);
	}
}
