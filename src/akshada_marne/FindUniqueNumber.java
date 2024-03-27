package akshada_marne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindUniqueNumber {

	int uniqueNumUsingArray(int[] arr, int num) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num)
				count++;
		}
		return count;
	}

	void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = uniqueNumUsingArray(arr, arr[i]);

			if (count == 1)
				System.out.println(arr[i]);
		}
	}

	ArrayList<Integer> convertToArrayList(int[] arr) {

		ArrayList<Integer> numbersList = new ArrayList<Integer>();

		for (int num : arr) {
			numbersList.add(num);
		}
		return numbersList;
	}

	void findUniqueNumberUsingArrayList(int[] arr) {
		ArrayList<Integer> listOfNumbers = convertToArrayList(arr);

		for (int num : listOfNumbers) {
			if (listOfNumbers.indexOf(num) == listOfNumbers.lastIndexOf(num)) {
				System.out.println(num);
			}
		}
	}

	void findUniqueNumberUsingHashMap(int[] arr) {

		Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();

		for (int num : arr) {
			if (numbersMap.containsKey(num)) {
				int count = numbersMap.get(num);
				numbersMap.put(num, count + 1);
			} else {
				numbersMap.put(num, 1);
			}
		}

		Set<Integer> numKeySet = numbersMap.keySet();
		for (int num : numKeySet) {
			int count = numbersMap.get(num);
			if (count == 1) {
				System.out.println(num);
			}
		}

	}

	public static void main(String[] args) {
		FindUniqueNumber findUniqueNumber = new FindUniqueNumber();
		int[] arr = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		System.out.println("------------Using Array------------");
		findUniqueNumber.display(arr);
		System.out.println("------------Using Array List-------");
		findUniqueNumber.findUniqueNumberUsingArrayList(arr);
		System.out.println("------------Using Hash Map---------");
		findUniqueNumber.findUniqueNumberUsingHashMap(arr);
	}

}
