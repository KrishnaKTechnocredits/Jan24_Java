package shravani_rapelli;

import java.util.LinkedHashMap;
import java.util.Map;
public class Assignment89 {
	
	void getFrequencyOfEachInteger(int arr[]) {
		Map<Integer, Integer> numCountMap = new LinkedHashMap<Integer, Integer>();
		for(int num : arr) {
			if(numCountMap.containsKey(num)) {
				int count = numCountMap.get(num);
				numCountMap.put(num, count + 1);
			}else {
				numCountMap.put(num, 1);
			}
		}
		System.out.println(numCountMap);
	}
		
	public static void main(String[] args) {
		Assignment89 assgn89 = new Assignment89();
		int arr[] = {10,20,30,10,20,20,55,55,13,13,13,13,13,10};
		assgn89.getFrequencyOfEachInteger(arr);
	}

}
