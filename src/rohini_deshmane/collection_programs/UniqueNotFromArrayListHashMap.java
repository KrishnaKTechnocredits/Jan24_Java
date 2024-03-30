package rohini_deshmane.collection_programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class UniqueNotFromArrayListHashMap {
	
	int getPresentCount(int arr[], int num) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				count++;
			}
		}
		return count;
	}
	
	void printUniqueUsingHashMap(int[] arr) {
		HashMap<Integer, Integer> hashmap = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			int count = getPresentCount(arr, arr[i]);
			hashmap.put(arr[i], count);
		}
		System.out.println("Not Unique numbers = Using Hashmap");
		
		Set<Integer> keySet = hashmap.keySet();
		for(int key : keySet) {
			if(hashmap.get(key) != 1) {
				System.out.println(key);
			}
		}
	}
	
	void printUniqueUsingArraylist(int[] arr) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		int count=0;
		for(int num : arr) {
			count = getPresentCount(arr, num);
			if(!arrayList.contains(num)) 
				if(count >1)
					arrayList.add(num);
		}
		System.out.println("Not Unique numbers = using Arraylist ");
		
		for(int num :arrayList) {
				System.out.println(num);
		}
		
	}
	
	public static void main(String[] args) {
		UniqueNotFromArrayListHashMap uniqueNotFromArrayListHashMap = new UniqueNotFromArrayListHashMap();
		int[] arr = {3,5,6,3,5,8,9,10,9,10}; //3,5,9,10
		uniqueNotFromArrayListHashMap.printUniqueUsingArraylist(arr);
		uniqueNotFromArrayListHashMap.printUniqueUsingHashMap(arr);
	}
}
