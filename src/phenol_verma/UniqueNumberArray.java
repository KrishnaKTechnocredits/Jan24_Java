/*
Assignment - 84 : 23th March'2024
Print numbers present uniquely from array using Array.
Print numbers present uniquely from array using ArrayList.
Print numbers present uniquely from array using HashMap.
 */

package phenol_verma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UniqueNumberArray {

	int countFrequency(int[] arr, int digit) {
		int count = 0;
		for (int num : arr) {
			if (digit == num) {
				count++;
			}
		}
		return count;
	}

	void findUsingArray(int[] arr) {

		for (int num : arr) {
			int digitFreq = countFrequency(arr, num);
			if (digitFreq == 1) {
				System.out.println(num);
			}
		}
	}

	void findUsingArrayList(int[] arr) {
		List<Integer> listOfDigit = new ArrayList<Integer>();
		for (int num : arr) {
			listOfDigit.add(num);
		}
		for (int num : listOfDigit) {
			if (listOfDigit.indexOf(num) == listOfDigit.lastIndexOf(num)) {
				System.out.println(num);
			}
		}
	}

	void findUsingHashMap(int[] arr) {
		Map<Integer, Integer> mapWordCount = new HashMap<Integer, Integer>();

		for (int num : arr) {
			if (mapWordCount.containsKey(num)) {
				int count = mapWordCount.get(num);
				mapWordCount.put(num, count + 1);
			} else {
				mapWordCount.put(num, 1);
			}
		}

		Set<Integer> arrKeys = mapWordCount.keySet();

		for (int key : arrKeys) {
			int value = mapWordCount.get(key);
			if (value == 1) {
				System.out.println(key);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		System.out.println("Original Array - " + Arrays.toString(arr));
		UniqueNumberArray uniqueNumberArray = new UniqueNumberArray();

		System.out.println("************Output Using Array************");
		uniqueNumberArray.findUsingArray(arr);

		System.out.println("************Output Using ArrayList************");
		uniqueNumberArray.findUsingArrayList(arr);

		System.out.println("************Output Using HashMap************");
		uniqueNumberArray.findUsingHashMap(arr);
	}
}
