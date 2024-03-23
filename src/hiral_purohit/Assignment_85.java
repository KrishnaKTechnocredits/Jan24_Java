package hiral_purohit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*Print numbers not presented uniquely from array using Array.
Print numbers not presented uniquely from array using ArrayList.
Print numbers not presented uniquely from array using HashMap.*/

public class Assignment_85 {

	int getCount(int[] arr, int target) {
		int count = 0;
		for (int num : arr) {
			if (num == target) {
				count++;
			}
		}
		return count;
	}

	boolean isProcessed(int[] arr, int target, int index) {
		for (int i = 0; i < index; i++) {
			if (arr[i] == target)
				return true;
		}
		return false;
	}

	void toGetDuplicatesInArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (!isProcessed(arr, arr[i], i)) {
				int count = getCount(arr, arr[i]);
				if (count > 1) {
					System.out.println("Duplicates number is: " + arr[i]);
				}
			}
		}
	}

	void printDupNumArrayList(int[] arr) {
		List<Integer> dupList = new ArrayList<Integer>();
		for (int num : arr) {
			dupList.add(num);
		}
		Set<Integer> dupSet = new HashSet<Integer>();
		for (int num : dupList) {
			if (dupList.indexOf(num) != dupList.lastIndexOf(num)) {
				if (dupSet.add(num) == false)
					dupSet.add(num);
			}
		}
		System.out.println(dupSet);

	}

	void toGetDuplicatesHashSet(int[] arr) {
		Map<Integer, Integer> dupNum = new HashMap<Integer, Integer>();
		for (int num : arr) {
			if (dupNum.containsKey(num)) {
				int count = dupNum.get(num);
				dupNum.put(num, count + 1);
			} else {
				dupNum.put(num, 1);
			}
		}
		Set<Integer> numKey = dupNum.keySet();
		for (int k : numKey) {
			int num = dupNum.get(k);
			if (num > 1) {
				System.out.println("Duplicate Number: " + k);
			}
		}
	}

	public static void main(String[] args) {
		int[] data = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		Assignment_85 assignment_85 = new Assignment_85();
		System.out.println("Duplicates numbers by Using Array");
		assignment_85.toGetDuplicatesInArray(data);
		System.out.println("---------------------------");
		System.out.println("Duplicates numbers by Using ArrayList");
		assignment_85.printDupNumArrayList(data);
		System.out.println("---------------------------");
		System.out.println("Duplicates numbers by Using HashMap");
		assignment_85.toGetDuplicatesHashSet(data);
	}
}
