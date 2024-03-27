/*
Assignment - 85 : 23th March'2024
Print numbers not presented uniquely from array using Array.
Print numbers not presented uniquely from array using ArrayList.
Print numbers not presented uniquely from array using HashMap.
 */

package phenol_verma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NotUniqueNumberArray {

	int countFrequency(int[] arrTemp, int digit) {
		int count = 0;
		for (int index = 0; index < arrTemp.length; index++) {
			if (digit == arrTemp[index]) {
				count++;
				arrTemp[index] = -1;
			}
		}
		return count;
	}

	void findUsingArray(int[] arr) {
		int[] arrTemp = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			arrTemp[index] = arr[index];
		}

		for (int num : arr) {
			int digitFreq = countFrequency(arrTemp, num);
			if (digitFreq > 1) {
				System.out.println(num);
			}
		}
	}

	void findUsingArrayList(int[] arr) {
		List<Integer> listOfDigit = new ArrayList<Integer>();
		for (int num : arr) {
			listOfDigit.add(num);
		}

		Set<Integer> uniqueElements = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();

		for (int num : listOfDigit) {
			if (!uniqueElements.add(num)) {
				duplicates.add(num);
			}
		}
		System.out.println(duplicates);
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
			if (value > 1) {
				System.out.println(key);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		System.out.println("Original Array - " + Arrays.toString(arr));
		NotUniqueNumberArray notUniqueNumberArray = new NotUniqueNumberArray();

		System.out.println("************Output Using Array************");
		notUniqueNumberArray.findUsingArray(arr);

		System.out.println("************Output Using ArrayList************");
		notUniqueNumberArray.findUsingArrayList(arr);

		System.out.println("************Output Using HashMap************");
		notUniqueNumberArray.findUsingHashMap(arr);
	}
}
