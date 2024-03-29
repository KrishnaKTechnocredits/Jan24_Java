/*Assignment - 89 : 24th March'2024 [20-25 mins]
Find frequency of elements in integer array and find max frequency  number [Map]
input : {10,20,30,10,20,20,55,55,13,13,13,13,13,10}
 */
package sasmita;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment89 {
	
	void togetFrequency(int[]arr) {
		Map<Integer, Integer> integermap = new HashMap<Integer, Integer>();
		
		for(int num : arr) {
			if(integermap.containsKey(num)) {
				int count=integermap.get(num);
				integermap.put(num, count + 1);
			}else {
				integermap.put(num,  1);
				
			}
		}
		System.out.println(integermap);
	
	
	    Set<Integer> numKey = integermap.keySet();
	    int maxNumber = 0;
	    int max = 0;
	    for(int key : numKey ) {
	    	int num= integermap.get(key);
	    	if(max < num) {
	    		max= num;
	    		maxNumber=key;
	    	}
	    }
	    System.out.println("Maximum freq number is :" +maxNumber + "-->" + max);
}
	
	

	public static void main(String[] args) {
	int[]input= {10,20,30,10,20,20,55,55,13,13,13,13,13,10};
	Assignment89 assignment89= new Assignment89();
	assignment89.togetFrequency(input);

	}

}

