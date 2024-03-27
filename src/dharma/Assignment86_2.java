package dharma;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment86_2 {

	void getFreqOfEachNumber(int[] arr) {
		Map<Integer, Integer> numCountMap = new LinkedHashMap<Integer, Integer>();
		for(int num : arr) {
			if(numCountMap.containsKey(num)) {
				int count = numCountMap.get(num);
				numCountMap.put(num, count + 1);
			}else {
				numCountMap.put(num, 1);
			}
		}System.out.println(numCountMap);
	}
	
	public static void main(String[] args) {
		Assignment86_2 ass86_2 = new Assignment86_2();
		int[] arr = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		ass86_2.getFreqOfEachNumber(arr);
	}
}
