/*Print numbers not presented uniquely from array using Array.
Print numbers not presented uniquely from array using ArrayList.
Print numbers not presented uniquely from array using HashMap
 */
package sasmita;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Assignment85 {

	int uniquicNumber(int[] arr, int num) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				count++;
			}
		}
		return count;
	}

	boolean isNumberProcess(int[] arr, int num, int targetIndex) {
		for (int i = 0; i < targetIndex; i++) {
			if (num == arr[i]) {
				return true;
			}
		}
		return false;
	}

	void printnotUniqueNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (!isNumberProcess(arr, arr[i], i)) {
				int count = uniquicNumber(arr, arr[i]);
				if (count > 1) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	void uniqueNumbers(int[] arr) {
		List<Integer> uniqueNumbers = new ArrayList<Integer>();
		for (int num : arr) {
			uniqueNumbers.add(num);
		}
		for (int i = 0; i < arr.length; i++) {
			if (!isNumberProcess(arr, arr[i], i)) {
				if (uniqueNumbers.indexOf(arr[i]) != uniqueNumbers.lastIndexOf(arr[i])) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	void uniqueNumberUsingMap(int[] arr) {
		Map<Integer, Integer> uniqueNumberMap = new TreeMap<Integer, Integer>();
		for (int num : arr) {
			if (uniqueNumberMap.containsKey(num)) {
				int count = uniqueNumberMap.get(num);
				uniqueNumberMap.put(num, count + 1);
			} else {
				uniqueNumberMap.put(num, 1);

			}
		}
		Set<Integer> keySet = uniqueNumberMap.keySet();
		for (int key : keySet) {
			if (uniqueNumberMap.get(key) > 1) {
				System.out.println(key);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 10, 5, 4, 6, 3, 5, 4 };
		Assignment85 assignment85 = new Assignment85();
		System.out.println("Numbers present not uniquely from array using Array :");
		assignment85.printnotUniqueNumber(arr);
		System.out.println("Numbers present not uniquely from array using ArrayList :");
		assignment85.uniqueNumbers(arr);
		System.out.println("Numbers present not uniquely from array using HashMap :");
		assignment85.uniqueNumberUsingMap(arr);
	}

}
