package akshay_gaikwad;
import java.util.*;
public class NotUniqueArrayHashMap {
	 
	void printNotUniqueNum(Integer [] arr) {
		HashMap<Integer,Integer> freqMap = getFreqMap(arr);
		Set<Integer> setOfNum = freqMap.keySet();
		for(Integer num : setOfNum) {
			if(freqMap.get(num) != 1) {
				System.out.print(num + " ");
			}
		}
	}
	
	HashMap<Integer, Integer> getFreqMap(Integer[] arr){
		HashMap<Integer,Integer> hashMap = new LinkedHashMap<>();
		for(int num : arr) {
			if(hashMap.containsKey(num)) {
				int count = hashMap.get(num);
				hashMap.put(num, ++count);
			}else {
				hashMap.put(num,1);
			}
		}
		return hashMap;
	}
	
	public static void main(String[] args) {
		Integer [] arr = {10,5,2,10,5,8,9,10,6,8};
		new NotUniqueArrayHashMap().printNotUniqueNum(arr);
	}
	
}


