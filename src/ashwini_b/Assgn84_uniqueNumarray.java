package ashwini_b;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * Assignment 84:
input ={10,10,3,4,3,3,3,3,55,56}
Print numbers present uniquely from array using Array.
Print numbers present uniquely from array using ArrayList.
Print numbers present uniquely from array using HashMap.
 */
public class Assgn84_uniqueNumarray {
	// Program1: Print numbers present uniquely from array using Array.
	int getFreqOfNum(int[] inputArray, int targetnum) {
		int count = 0;
		for (int num : inputArray) {
			if (num == targetnum) {
				count++;
			}
		}
		return count;
	}

	void countUniqueNum(int[] inputArray) {
		System.out.println("Unique number Frequency by using Array");
		for (int i = 0; i < inputArray.length; i++) {
			int count = getFreqOfNum(inputArray, inputArray[i]);
			if (count == 1) {
				System.out.println(inputArray[i]);
			}
		}
	}

	//Program2: Print numbers present uniquely from array using ArrayList.
	void getFreq(int[] arr) {
		System.out.println("Unique number Frequency by using ArrayList");
		List<Integer> list = new ArrayList<Integer>();
		for (int num : arr) {
			list.add(num);
		}
		for (int index = 0; index < list.size(); index++) {
			int num = list.get(index);
			if (list.indexOf(num) == list.lastIndexOf(num)) {
				System.out.println(list.get(index));
			}
		}
	}

	//Program3:Print numbers present uniquely from array using HashMap.
	void getFreq1(int[] arr) {
		System.out.println("Unique number Frequency by using Hashmap");
		Map<Integer, Integer> listOfCount = new LinkedHashMap<Integer, Integer>();
		int count =0;
		
		for(int num :arr) {
			if(listOfCount.containsKey(num)) {
				count = listOfCount.get(num);
				listOfCount.put(num, count+1);
			}else {
				listOfCount.put(num, 1);
			}
		}
		for (int index =0 ; index<arr.length;index++) {
			if(listOfCount.get(arr[index])==1) {
				System.out.println(arr[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		Assgn84_uniqueNumarray assgn84_uniqueNumarray = new Assgn84_uniqueNumarray();
		assgn84_uniqueNumarray.countUniqueNum(array);
		assgn84_uniqueNumarray.getFreq(array);
		assgn84_uniqueNumarray.getFreq1(array);
	}

}
