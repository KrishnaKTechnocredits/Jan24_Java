/*Print numbers not presented uniquely from array using Array.
Print numbers not presented uniquely from array using ArrayList.
Print numbers not presented uniquely from array using HashMap*/
package rupali_umagol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment85 {
	int getCount(int[] arr, int num) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i])
				count++;
		}
		return count;
	}

	boolean isProcessed(int[] arr, int targetnum, int index) {
		for (int i = 0; i < index; i++) {
			if (targetnum == arr[i])
				return true;
		}
		return false;
	}

	void printDuplicateNum(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (!isProcessed(arr, arr[i], i)) {
				int count = getCount(arr, arr[i]);
				if (count > 1) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	void printDuplicateNumUsingArrayList(int[] arr) {
		List<Integer> listOfnum = new ArrayList<>();
		for (int num : arr) {
			listOfnum.add(num);
		}
		for (int i = 0; i < arr.length; i++) {
			if (!isProcessed(arr, arr[i], i)) {
				if (listOfnum.indexOf(arr[i]) != listOfnum.lastIndexOf(arr[i])) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	void printDuplicateNumUsingMap(int[] arr) {
		Map<Integer, Integer> countOfNum = new HashMap<>();
		for (int num : arr) {
			if (countOfNum.containsKey(num)) {
				int count = countOfNum.get(num);
				countOfNum.put(num, count + 1);
			} else
				countOfNum.put(num, 1);
		}
		Set<Integer> keySet = countOfNum.keySet();
		for (int key : keySet) {
			if (countOfNum.get(key) > 1) {
				System.out.println(key);
			}
		}
	}

	public static void main(String[] args) {
		Assignment85 assignement = new Assignment85();
		int[] input = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		System.out.println("Duplicate numbers Using Array :");
		assignement.printDuplicateNum(input);
		System.out.println("Duplicate numbers Using ArrayList :");
		assignement.printDuplicateNumUsingArrayList(input);
		System.out.println("Duplicate numbers Using Map :");
		assignement.printDuplicateNumUsingMap(input);
	}
}
