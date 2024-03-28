package technocredits.collectionsframework.mapdemo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Example6 {
	
	void printUniqueNumbers(int[] arr) {
		Map<Integer,Integer> mapOfNumFreq = new LinkedHashMap<>();
		for(int num : arr) {
			if(mapOfNumFreq.containsKey(num)) {
				int count = mapOfNumFreq.get(num);
				mapOfNumFreq.put(num, count+1);
			}else {
				mapOfNumFreq.put(num, 1);
			}
		}
		System.out.println(mapOfNumFreq);
		
		Set<Integer> setOfKeys = mapOfNumFreq.keySet();
		for(int key : setOfKeys) {
			int value = mapOfNumFreq.get(key);
			if(value == 1)
				System.out.println(key + "-->"+value);
		}
		
	}
	
	void printDuplicateNumbers(int[] arr) {
		Map<Integer,Integer> mapOfNumFreq = new LinkedHashMap<>();
		for(int num : arr) {
			if(mapOfNumFreq.containsKey(num)) {
				int count = mapOfNumFreq.get(num);
				mapOfNumFreq.put(num, count+1);
			}else {
				mapOfNumFreq.put(num, 1);
			}
		}
		System.out.println(mapOfNumFreq);
		
		Set<Integer> setOfKeys = mapOfNumFreq.keySet();
		for(int key : setOfKeys) {
			int value = mapOfNumFreq.get(key);
			if(value > 1)
				System.out.println(key + "-->"+value);
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {10,10,3,4,3,3,3,3,55,56,9,9};
		Example6 example6 = new Example6();
		example6.printDuplicateNumbers(arr);
	}
}
