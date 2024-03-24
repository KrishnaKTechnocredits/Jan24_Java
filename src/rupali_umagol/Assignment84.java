/*Print numbers present uniquely from array using Array.
Print numbers present uniquely from array using ArrayList.
Print numbers present uniquely from array using HashMap.
*/
package rupali_umagol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment84 {
	int getCount(int[] arr, int num) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i])
				count++;
		}
		return count;
	}

	void printUniqueNum(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = getCount(arr, arr[i]);
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}
	}

	void printUniqueUsingList(int[] arr) {
		List<Integer> listOfNum = new ArrayList<>();
		for (int num : arr) {
			listOfNum.add(num);
		}
		for (int num : listOfNum) {
			if (listOfNum.indexOf(num) == listOfNum.lastIndexOf(num))
				System.out.println(num);
		}
	}

	void printUniqueNumUsingHashMap(int[] arr) {
		Map<Integer, Integer> countOfNum = new HashMap<>();
		for (int num : arr) {
			if (countOfNum.containsKey(num)) {
				int count = countOfNum.get(num);
				countOfNum.put(num, count + 1);
			} else
				countOfNum.put(num, 1);
		}
		Set<Integer> keys = countOfNum.keySet();
		for (int key : keys) {
			if (countOfNum.get(key) == 1) {
				System.out.println(key);
			}
		}
	}

	public static void main(String[] args) {
		Assignment84 assignment = new Assignment84();
		int[] input = { 10, 2, 4, 10, 5, 4, 6, 3, 5, 4 };
		System.out.println("Unique numbers Using Array :");
		assignment.printUniqueNum(input);
		System.out.println("Unique numbers Using ArrayList :");
		assignment.printUniqueUsingList(input);
		System.out.println("Unique numbers Using Map :");
		assignment.printUniqueNumUsingHashMap(input);
	}
}