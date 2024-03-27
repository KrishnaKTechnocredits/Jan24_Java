package dharma;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment84 {

	int findUniqueNumberUsingArray(int[] arr, int num) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				count++;
			}
		}
		return count;
	}
	
	void display(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int count = findUniqueNumberUsingArray(arr, arr[i]);
			if(count == 1)
				System.out.println("Using Array -> " + arr[i]);
		}
	}
	
	ArrayList<Integer> convertToArrayList(int[] arr){
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for(int num: arr) {
			numList.add(num);
		}
		return numList;
	}
	
	void findUniqueNumberUsingArrayList(int[] arr) {
		ArrayList<Integer> ListOfNumbers = convertToArrayList(arr);
		for(int num :ListOfNumbers) {
			if(ListOfNumbers.indexOf(num) == ListOfNumbers.lastIndexOf(num)) {
				System.out.println("Using ArrayList -> " + num);
			}
		}
	}
	
	void findUniqueNumberUsingHashmap(int[] arr) {
		Map<Integer, Integer> mapNum = new HashMap<Integer, Integer>();
		for(int num : arr) {
			if(mapNum.containsKey(num)) {
				int count = mapNum.get(num);
				mapNum.put(num, count + 1);
			}else {
				mapNum.put(num, 1);
			}
		}
		
		Set<Integer> keySetOfNum = mapNum.keySet();
		for(int num : keySetOfNum) {
			int count = mapNum.get(num);
			if(count == 1) {
				System.out.println("Using HashMap -> " + num);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment84 ass84 = new Assignment84();
		int[] arr = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		ass84.display(arr);
		ass84.findUniqueNumberUsingArrayList(arr);
		ass84.findUniqueNumberUsingHashmap(arr);
	}
}
