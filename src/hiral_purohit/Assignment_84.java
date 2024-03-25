package hiral_purohit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*Print numbers present uniquely from array using Array.
Print numbers present uniquely from array using ArrayList.
Print numbers present uniquely from array using HashMap.*/

public class Assignment_84 {

	int toGetCount(int[] arr, int target) {
		int count = 0;
		for (int num : arr) {
			if (num == target) {
				count++;
			}
		}
		return count;
	}

	void toGetUniquelyNumArray(int[] arr) {
		for (int num : arr) {
			int count = toGetCount(arr, num);
			if (count == 1) {
				System.out.println("uniquely number in array is: " + num);
			}
		}
	}

	void toGetUniqueNumArrayList(int[] arr) {
		List<Integer> listNum = new ArrayList<Integer>();
		for (int num : arr) {
			listNum.add(num);
		}
		for (int num : listNum) {
			if (listNum.indexOf(num) == listNum.lastIndexOf(num)) {
				System.out.println("Unique number using Arraylist: " + num);
			}
		}
	}

	void toGetUniqueNumHashMap(int[] arr) {
		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		for (int num : arr) {
			if (numMap.containsKey(num)) {
				int count = numMap.get(num);
				numMap.put(num, count + 1);
			} else {
				numMap.put(num, 1);
			}
		}
		Set<Integer> setOfKeys = numMap.keySet();
		for (int k : setOfKeys) {
			int num = numMap.get(k);
			if (num == 1) {
				System.out.println("Unique number using HashMap: " + k);
			}
		}
	}

	public static void main(String[] args) {
		int[] input = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		Assignment_84 assignment_84 = new Assignment_84();
		assignment_84.toGetUniquelyNumArray(input);
		System.out.println("---------------------------------------");
		assignment_84.toGetUniqueNumArrayList(input);
		System.out.println("---------------------------------------");
		assignment_84.toGetUniqueNumHashMap(input);
		System.out.println("---------------------------------------");
	}
}
