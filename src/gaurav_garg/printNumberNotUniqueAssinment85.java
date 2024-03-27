package gaurav_garg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class printNumberNotUniqueAssinment85 {

	boolean isNumProcessed(int[] arr, int targetnum, int index) {
		for (int i = 0; i < index; i++) {
			if (targetnum == arr[i]) {
				return true;
			}
		}
		return false;
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

	void usingHashmap(int arr[]) {
		HashMap<Integer, Integer> hg = new LinkedHashMap<Integer, Integer>();
		System.out.println("Repatative Element in Hash Map -: ");

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
			if (hg.get(key) > 1) {
				System.out.println(key);
			}
		}
	}

	void usingArrayList(int arr[]) {
		ArrayList<Integer> hg = new ArrayList<Integer>();
		for (int num : arr) {
			hg.add(num);
		}
		System.out.println("Repatative Element in Array List -: ");
		for (int i = 0; i < hg.size(); i++) {
			int num = hg.get(i);
			if (hg.indexOf(num) != hg.lastIndexOf(num) && hg.indexOf(num) == i) {
				System.out.println(num);
			}
		}
	}

	void usingArray(int arr[]) {
		System.out.println("Repatative Element in Array -: ");

		for (int i = 0; i < arr.length; i++) {
			int count = getCountofOccurance(arr, arr[i]);
			if (!isNumProcessed(arr, arr[i], i)) {
				if (count > 1) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		new printNumberNotUniqueAssinment85().usingArrayList(arr);
		new printNumberNotUniqueAssinment85().usingArray(arr);
		new printNumberNotUniqueAssinment85().usingHashmap(arr);
	}
}
