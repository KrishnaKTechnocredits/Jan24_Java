package rohini_deshmane.collection_programs;
/*
Print numbers present uniquely from array using ArrayList.
Print numbers present uniquely from array using HashMap.

 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class UniqueFromArrayListHashMap {

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
		System.out.println("Unique numbers =Using Hashmap");
		
		Set<Integer> keySet = hashmap.keySet();
		for(int key : keySet) {
			if(hashmap.get(key) == 1) {
				System.out.println(key);
			}
		}
	}
	
	void printUniqueUsingArraylist(int[] arr) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for(int num : arr)
			arrayList.add(num);
		
		System.out.println("Unique numbers = using Arraylist ");
		
		for(int num :arrayList) {
			if(arrayList.indexOf(num) == arrayList.lastIndexOf(num)) {
				System.out.println(num);
			}
		}
		
	}
	
	public static void main(String[] args) {
		UniqueFromArrayListHashMap uniqueFromArrayListHashMap = new UniqueFromArrayListHashMap();
		int[] arr = {3,5,6,3,5,8,9,10,9,10};
		uniqueFromArrayListHashMap.printUniqueUsingArraylist(arr);
		uniqueFromArrayListHashMap.printUniqueUsingHashMap(arr);
	}
}
