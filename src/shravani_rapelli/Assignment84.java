package shravani_rapelli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment84 {
	
	int getCountOfNumbers(int[] arr, int num) {
		int count =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num)
				count++;
		}
		return count;
	}
	
	void printUniqueNumbersUsingArray(int arr[]) {
		System.out.println("*******Using Array*********");
		for(int i=0; i<arr.length; i++) {
			int count = getCountOfNumbers(arr,arr[i]);
			if(count ==1) {
				System.out.println(arr[i]);
			}
		}
	}
	
	void uniqueNumberUsingArrayList(int arr[]) {
		System.out.println("\n*******Using Array List*********");
		List<Integer> uniqueNumber = new ArrayList<Integer>();
		for (int num : arr) {
			uniqueNumber.add(num);
		}
		for (int num : arr) {
			if (uniqueNumber.indexOf(num) == uniqueNumber.lastIndexOf(num)) {
				System.out.println(num);
			}

		}
	}
	
	void uniqueNumbersUsingHashMap(int arr[]) {
		Map<Integer, Integer> numcountMap = new HashMap<Integer, Integer>();
		System.out.println("\n*******Using Hash Map*********");
		for (int num : arr) {
			if (numcountMap.containsKey(num)) {
				int count = numcountMap.get(num);
				numcountMap.put(num, count + 1);
			} else {
				numcountMap.put(num, 1);
			}
		}
		Set<Integer> keySet = numcountMap.keySet();

		for (int key : keySet) {
			int value =numcountMap.get(key);
			if (value == 1) {
				System.out.println(key);
			}
		}
	}

	
	public static void main(String[] args) {
		Assignment84 assgn84 = new Assignment84();
		int arr[] = {12,34,2,12,18,35,4,34,8};
		assgn84.printUniqueNumbersUsingArray(arr);
		assgn84.uniqueNumberUsingArrayList(arr);
		assgn84.uniqueNumbersUsingHashMap(arr);
	}

}
