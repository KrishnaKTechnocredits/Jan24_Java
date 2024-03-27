package samiksha;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import hiral_purohit.IndexOf;

public class FrequencyByMap {

	// program 1: Print numbers present uniquely from array using Array.
	int printFrq(int[] arr, int targetNum) {
		int count = 0;
		for (int num : arr) {
			if (num == targetNum) {
				count++;
			}
		}
		return count;
	}

	void getCount(int[] arr) {
		System.out.println("frequency by using Array : ");
		for (int index = 0; index < arr.length; index++) {
			int count = printFrq(arr, arr[index]);
			if (count == 1) {
				System.out.println(arr[index] + " > " + count);
			}
		}
	}

	// Program2: Print numbers present uniquely from array using ArrayList.
	void getFreq(int[] arr) {
		System.out.println("Frequncy by ArrayList : ");

		List<Integer> list = new ArrayList<Integer>();
		for (int num : arr) {
			list.add(num);
		}

		for (int index = 0; index < list.size(); index++) {
			if (list.indexOf(list.get(index)) == list.lastIndexOf(list.get(index))) {
				System.out.println(list.get(index) + " >= " + 1);
			}
		}
	}

	// Program 3: print numbers present uniquely from array using Hashmap.
	void getFreq1(int[] arr) {
		
		System.out.println("Frequency by using Hashmap : ");
		Map<Integer, Integer> listOfCount = new LinkedHashMap<Integer, Integer>();
		int count=0;
		
		for (int num : arr) {
			if (listOfCount.containsKey(num)) {
				 count = listOfCount.get(num);
				listOfCount.put(num, count + 1);
			}else {
				listOfCount.put(num, 1);
			}
		}
		for(int index=0;index<arr.length;index++) {
			if(listOfCount.get(arr[index])==1) {
				System.out.println(arr[index]+ " > "+ listOfCount.get(arr[index]));
			}
		}
	}
	
	public static void main(String[] args) {
		int[] data = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		FrequencyByMap freq = new FrequencyByMap();
		freq.getCount(data);
		freq.getFreq(data);
		freq.getFreq1(data);
	}
}
			
		

