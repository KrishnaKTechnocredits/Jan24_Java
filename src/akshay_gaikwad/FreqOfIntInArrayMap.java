package akshay_gaikwad;
/*Find frequency of elements in integer array and find max frequency  number [Map]
input : {10,20,30,10,20,20,55,55,13,13,13,13,13,10}
output : 10 -> 3
         20 -> 3
         30 -> 1
         55 -> 2
         13 -> 5
18 mins */

import java.util.*;

class FreqOfIntInArrayMap{
	
	Map<Integer,Integer> getFreqMap(Integer[] arr){
		Map<Integer,Integer> freqMap = new LinkedHashMap<>();
		for(Integer num : arr){
			if(freqMap.containsKey(num)){
				int count = freqMap.get(num);
				freqMap.put(num,++count);
			}else{
				freqMap.put(num,1);
			}
		}
		return freqMap;
	}
	
	void maxFreqInt(Integer [] arr){
		Map<Integer, Integer> mapOfFreq = getFreqMap(arr);
		Set<Integer> setOfKeys = mapOfFreq.keySet();
		int maxCount = 0;
		int maxFreq = 0;
		for(Integer num : setOfKeys){
			if(maxCount < mapOfFreq.get(num)){
				maxCount = mapOfFreq.get(num);
				maxFreq = num;
			}
		}
		System.out.println("Frequency of each element " + mapOfFreq);
		System.out.println("Most frequent number in given array is "+ maxFreq + " having frequency of " + maxCount);

	}
	
	public static void main(String[] args){
		Integer[] input = {10,20,30,10,20,20,55,55,13,13,13,13,13,10};
		new FreqOfIntInArrayMap().maxFreqInt(input);
	}
		
}