package samiksha;

import java.util.LinkedHashMap;
import java.util.Map;

public class FreqByMap1 {
	
	void printFreq(int[]arr) {
		Map<Integer,Integer> listOfFreq= new LinkedHashMap<Integer, Integer>();
		int max=0;
		int count=0;
		int maxNum=0;
		for(int num :arr) {
			if(listOfFreq.containsKey(num)) {
				count = listOfFreq.get(num);
				listOfFreq.put(num, count+1);
				if(max<count) {
					max=count;
					maxNum = num;
				}
			}else
				listOfFreq.put(num, 1);
			
		}
			System.out.println(maxNum + " having max frequency " + (max+1));
			System.out.println(listOfFreq);
	}
			
	public static void main(String[] args) {
		int[] data = { 10, 20, 30, 10, 20, 20, 55, 55, 13, 13, 13, 13, 13, 10 };
		new FreqByMap1().printFreq(data);
	}

}		
		
			
		
	
