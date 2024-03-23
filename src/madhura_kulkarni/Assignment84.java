/*Assignment - 84 : 23th March'2024
Print numbers present uniquely from array using Array.
Print numbers present uniquely from array using ArrayList.
Print numbers present uniquely from array using HashMap.*/
package madhura_kulkarni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment84 {
	boolean isNumberUnique(int[] numArr, int num) {
		int count = 0;
		for (int num1 : numArr) {
			if (num1 == num)
				count++;
		}
		if (count == 1)
			return true;
		else
			return false;
	}

	void printUniqueNumUsingArray(int[] arr) {
		for (int num : arr) {
			boolean flag = isNumberUnique(arr, num);
			if (flag)
				System.out.println(num);
		}
	}

	void printUniqueNumUsingArrayList(int[] arr) {
		List<Integer> numList = new ArrayList<Integer>();
		for (int num : arr) {
			numList.add(num);
		}
		for (int num : numList) {
			if (numList.indexOf(num) == numList.lastIndexOf(num)) {
				System.out.println(num);
			}
		}

	}

	void printUniqueNumUsingHashmap(int[] arr) {
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
			int num1 = numCountMap.get(numKey);
			if (num1 == 1)
				System.out.println(numKey);
		}
	}

	public static void main(String[] args) {
		int[] data = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		Assignment84 assignment84 = new Assignment84();
		System.out.println("-------Printing unique numbers using Array-------");
		assignment84.printUniqueNumUsingArray(data);
		System.out.println("-------Printing unique numbers using ArrayList-------");
		assignment84.printUniqueNumUsingArrayList(data);
		System.out.println("-------Printing unique numbers using Hashmap-------");
		assignment84.printUniqueNumUsingHashmap(data);
	}
}
