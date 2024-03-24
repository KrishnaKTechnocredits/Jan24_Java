package akshada_marne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindNonUniqueNumbers {
	int nonUniqueNumUsingArray(int[] arr, int num) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num)
				count++;
		}
		return count;
	}

	boolean isNumberProcessed(int[] arr, int num, int index) {
		for (int i = 0; i < index; i++) {
			if (arr[i] == num)
				return true;
		}
		return false;
	}

	void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			boolean flag = isNumberProcessed(arr, arr[i], i);

			if (!flag) {
				int count = nonUniqueNumUsingArray(arr, arr[i]);

				if (count != 1)
					System.out.println(arr[i]);
			}
		}
	}

	ArrayList<Integer> convertToArrayList(int[] arr) {

		ArrayList<Integer> numbersList = new ArrayList<Integer>();

		for (int num : arr) {
			numbersList.add(num);
		}
		return numbersList;
	}

	void findnonUniqueNumberUsingArrayList(int[] arr) {
		ArrayList<Integer> listOfNumbers = convertToArrayList(arr);

		Set<Integer> hs = new HashSet<Integer>();

		for (int num : listOfNumbers) {

			if (listOfNumbers.indexOf(num) != listOfNumbers.lastIndexOf(num))
				hs.add(num);
		}
		System.out.println(hs);
	}

	void findNonUniqueNumberUsingHashMap(int[] arr) {

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
			if (count != 1) {
				System.out.println(num);
			}
		}

	}

	public static void main(String[] args) {
		FindNonUniqueNumbers findNonUniqueNumbers = new FindNonUniqueNumbers();
		int[] arr = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		System.out.println("----Non-unique numbers using Array----");
		findNonUniqueNumbers.display(arr);
		System.out.println("----Non-unique numbers using ArrayList----");
		findNonUniqueNumbers.findnonUniqueNumberUsingArrayList(arr);
		System.out.println("----Non-unique numbers using Hash Map----");
		findNonUniqueNumbers.findNonUniqueNumberUsingHashMap(arr);

	}
}
