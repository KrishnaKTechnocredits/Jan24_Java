/*Assignment - 84 : 23th March'2024
Print numbers present uniquely from array using Array.
Print numbers present uniquely from array using ArrayList.
Print numbers present uniquely from array using HashMap.*/
package madhura_kulkarni;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment85 {
	int isNumberDuplicate(int[] numArr, int num) {
		int count = 0;
		for (int num1 : numArr) {
			if (num1 == num)
				count++;
		}
		return count;
	}

	boolean isNumProcessed(int[] numArr, int tagetNum, int index) {
		for (int i = 0; i < index; i++) {
			if (numArr[i] == tagetNum)
				return true;
		}
		return false;
	}

	void printDuplicateNumUsingArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if (!isNumProcessed(arr, num, i)) {
				int count = isNumberDuplicate(arr, num);
				if (count > 1)
					System.out.println(num);
			}
		}
	}

	void printDuplicateNumUsingArrayList(int[] arr) {
		List<Integer> numList = new ArrayList<Integer>();
		for (int num : arr) {
			numList.add(num);
		}
		Set<Integer> numDuplicateList = new HashSet<Integer>();
		for (int num : numList) {
			if (numList.indexOf(num) != numList.lastIndexOf(num)) {
				numDuplicateList.add(num);
			}
		}
		System.out.println(numDuplicateList);
	}

	void printDuplicateNumUsingHashmap(int[] arr) {
		Map<Integer, Integer> numCountMap = new HashMap<Integer, Integer>();
		for (int num : arr) {
			if (numCountMap.containsKey(num)) {
				int count = numCountMap.get(num);
				numCountMap.put(num, count + 1);
			} else {
				numCountMap.put(num, 1);
			}
		}
		Set<Integer> numkeySet = numCountMap.keySet();
		for (int numKey : numkeySet) {
			if (numCountMap.get(numKey)> 1)
				System.out.println(numKey);
		}
	}

	public static void main(String[] args) {
		int[] data = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		Assignment85 assignment85 = new Assignment85();
		System.out.println("-------Printing Duplicate numbers using Array-------");
		assignment85.printDuplicateNumUsingArray(data);
		System.out.println("-------Printing Duplicate numbers using ArrayList-------");
		assignment85.printDuplicateNumUsingArrayList(data);
		System.out.println("-------Printing Duplicate numbers using Hashmap-------");
		assignment85.printDuplicateNumUsingHashmap(data);
	}
}
