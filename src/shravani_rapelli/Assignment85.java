package shravani_rapelli;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment85 {
	
	int getCountOfEveryNumber(int arr[],int num) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num)
				count++;
		}
		return count;
	}
	
	boolean isNumberProcessed(int arr[],int targetNum ,int index) {
		for(int i=0; i<index; i++) {
			if(targetNum == arr[i])
				return true;
		}
		return false;
	}
	
	void printNumbersNotUniquelyPresent(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			int count = getCountOfEveryNumber(arr,arr[i]);
			if(!isNumberProcessed(arr,arr[i],i)) {
				if(count>1)
					System.out.println(arr[i]);
			}
		}
	}
	
	void printNumbersNotUniquelyPresentUsingArrayList(int arr[]) {
		List<Integer> listOfNumbers = new ArrayList<Integer>();
		for(int num : arr) {
			listOfNumbers.add(num);
		}
		for(int i=0; i<arr.length; i++) {
			if(!isNumberProcessed(arr,arr[i],i)) {
				if(listOfNumbers.indexOf(arr[i]) != listOfNumbers.lastIndexOf(arr[i]))
					System.out.println(arr[i]);
			}
		}
	}
	
	void printNumbersNotUniquelyPresentUsingHashMap(int arr[]) { 
	Map<Integer, Integer> mapOfNum = new LinkedHashMap<Integer, Integer>();
	for (int num : arr) {
		if (mapOfNum.containsKey(num)) {
			int count = mapOfNum.get(num);
			mapOfNum.put(num, count + 1);
		} else {
			mapOfNum.put(num, 1);
		}
	}
	Set<Integer> arrKeys = mapOfNum.keySet();

	for (int key : arrKeys) {
		int value = mapOfNum.get(key);
		if (value > 1) {
			System.out.println(key);
		}
	}
}
	
	public static void main(String[] args) {
		Assignment85 assgn85 = new Assignment85();
		int arr[] = {10,34,45,10,62,85,34,45};
		System.out.println("********Using Array********");
		assgn85.printNumbersNotUniquelyPresent(arr);
		System.out.println("********Using ArrayList********");
		assgn85.printNumbersNotUniquelyPresentUsingArrayList(arr);
		System.out.println("********Using HashMap********");
		assgn85.printNumbersNotUniquelyPresentUsingHashMap(arr);
	}
}
