package garima_s;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PrintUniquelyElement {

	void getPrintUniquely(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = uniquelyNumber(arr, arr[i]);
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}
	}

	int uniquelyNumber(int[] arr, int num) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				count++;
			}
		}
		return count;
	}

	void listUniquelyNumber(int[] arr) {
		List<Integer> listOfNumbers = new ArrayList<Integer>();
		for (int num : arr) {
			listOfNumbers.add(num);
		}
		for (int num : arr) {
			if (listOfNumbers.indexOf(num) == listOfNumbers.lastIndexOf(num)) {
				System.out.println(num);
			}
		}
	}

	void mapUniquelyNumber(int[] arr) {
		Map<Integer, Integer> charCountMap = new TreeMap<Integer, Integer>();
		for (int num : arr) {
			if (charCountMap.containsKey(num)) {
				int count = charCountMap.get(num);
				charCountMap.put(num, count + 1);
			} else {
				charCountMap.put(num, 1);
			}
		}
		Set<Integer> keySet = charCountMap.keySet();
		for (int key : keySet) {
			if (charCountMap.get(key) == 1) {
				System.out.println(key);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 2, 4, 10, 5, 4, 6, 3, 5, 4 };
		PrintUniquelyElement printUniquelyElement = new PrintUniquelyElement();
		System.out.println("Uniquely Number through Arrays : ");
		printUniquelyElement.getPrintUniquely(arr);
		System.out.println("Uniquely Number through List : ");
		printUniquelyElement.listUniquelyNumber(arr);
		System.out.println("Uniquely Number through Map : ");
		printUniquelyElement.mapUniquelyNumber(arr);
	}
}
