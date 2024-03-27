package garima_s;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrintNotUniquelyNumbers {

	void getNotPrintUniquely(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (!isNumProcessed(arr, arr[i], i)) {
				int count = uniquelyNumber(arr, arr[i]);
				if (count > 1) {
					System.out.println(arr[i]);
				}
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

	boolean isNumProcessed(int[] arr, int num, int targetIndex) {
		for (int i = 0; i < targetIndex; i++) {
			if (num == arr[i]) {
				return true;
			}
		}
		return false;
	}

	void listNotUniquelyNumber(int[] arr) {
		List<Integer> listOfNumbers = new ArrayList<Integer>();
		for (int num : arr) {
			listOfNumbers.add(num);
		}
		for (int i = 0; i < arr.length; i++) {
			if (!isNumProcessed(arr, arr[i], i)) {
				if (listOfNumbers.indexOf(arr[i]) != listOfNumbers.lastIndexOf(arr[i])) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	void mapNotUniquelyNumber(int[] arr) {
		Map<Integer, Integer> charCountMap = new HashMap<Integer, Integer>();
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
			if (charCountMap.get(key) > 1) {
				System.out.println(key);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 2, 4, 10, 5, 4, 6, 3, 5, 4 };
		PrintNotUniquelyNumbers printNotUniquelyNumbers = new PrintNotUniquelyNumbers();
		System.out.println("Not Presented Uniquely Number through Arrays : ");
		printNotUniquelyNumbers.getNotPrintUniquely(arr);
		System.out.println("Not Presented Uniquely Number through ArrayList : ");
		printNotUniquelyNumbers.listNotUniquelyNumber(arr);
		System.out.println("Not Presented Uniquely Number through HashMap : ");
		printNotUniquelyNumbers.mapNotUniquelyNumber(arr);
	}
}
