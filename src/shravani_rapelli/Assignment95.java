package shravani_rapelli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assignment95 {
	
	int getMaxNumber(int arr[]) {
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	void findNthMaxNumber(int[] numbers, int target) {
		int[] arr = Arrays.copyOf(numbers, numbers.length);
		int max = 0;
		if (target == 1) {
			max = getMaxNumber(arr);
		} else {
			for (int i = 0; i < target; i++) {
				max = getMaxNumber(arr);
				if (i < target - 1) {
					for (int num = 0; num < arr.length; num++) {
						if (arr[num] == max) {
							arr[num] = 0;
						}
					}
				}
			}
		}
		System.out.println(max);
	}
	
	int findNthMaxNumberUsingSorting(int[] numbers, int target) {
		int[] arr = Arrays.copyOf(numbers, numbers.length);
		Arrays.sort(arr);
		int distinctCount = 1;
		int prev = arr[arr.length - 1];

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] != prev) {
				distinctCount++;
				prev = arr[i];
			}
			if (distinctCount == target) {
				return arr[i];
			}
		}
		return arr[0];
	}
	
	void printNthMaxNumUsingCollection(Integer arr1[], int n) {
		Set<Integer> setOfNum = new TreeSet<Integer>(Arrays.asList(arr1));
		System.out.println(setOfNum);
		
		List<Integer> listOfNum = new ArrayList<Integer>(setOfNum);
		System.out.println(listOfNum.get(listOfNum.size()-n));
	}

	public static void main(String[] args) {
		Assignment95 assgn95 = new Assignment95();
		int arr[] = {2,22,3,55,66,77,34,26};
		System.out.println("nth highest numbe without using sorting and using array");
		assgn95.findNthMaxNumber(arr,2);
		assgn95.findNthMaxNumber(arr,3);
		assgn95.findNthMaxNumber(arr,4);
		System.out.println("\nnth highest number using sorting and using array");
		System.out.println(assgn95.findNthMaxNumberUsingSorting(arr,2));
		System.out.println(assgn95.findNthMaxNumberUsingSorting(arr,5));
		System.out.println("\n2nd highest number using collection framework");
		Integer arr1[] = {2,22,3,55,66,77,34,26};
		assgn95.printNthMaxNumUsingCollection(arr1,2);
		
	}
}
