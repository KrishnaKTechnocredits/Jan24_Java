//int[] arr = {10,5,5,6,9,7,15,12,15,18,8};
package akshay_gaikwad;
import java.util.*;

public class UniqueNumberHashMap {
	
	LinkedHashMap<Integer,Integer> getHashMapOfFreq(int [] arr) {
		LinkedHashMap<Integer, Integer> mapOfNum = new LinkedHashMap<>();
		for(int num : arr) {
			if(mapOfNum.containsKey(num)) {
				int count = mapOfNum.get(num);
				mapOfNum.put(num, ++count);
			}else {
				mapOfNum.put(num, 1);
			}
		}
		return mapOfNum;
	}
	
	void printUniqueNum(int [] arr) {
		LinkedHashMap <Integer,Integer> freqOfNum =  getHashMapOfFreq(arr);
		Set <Integer> setOfKeys = freqOfNum.keySet();
		for(Integer num : setOfKeys) {
			if(freqOfNum.get(num) == 1) {
				System.out.print(num + " ");
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {10,5,5,6,9,7,15,12,15,18,8};
		new UniqueNumberHashMap().printUniqueNum(arr);
		
	}
}
