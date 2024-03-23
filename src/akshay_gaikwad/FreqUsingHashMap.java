//"Hi Hello Hi Hello Hello Techno Credits Credits Hello Hi"
package akshay_gaikwad;

import java.util.*;

public class FreqUsingHashMap {
	
	void printFreqChar(String str) {
		char [] arr = str.toCharArray();
		Map< Character , Integer> mapCharFreq = new LinkedHashMap<>();
		for(char ch : arr) {
			if(mapCharFreq.containsKey(ch)) {
				int count  = mapCharFreq.get(ch);
				mapCharFreq.put(ch, ++count);
			}else {
				mapCharFreq.put(ch, 1);
			}
		}
		System.out.println(mapCharFreq);
	}
	
	void printFreqWord(String str) {
		String [] strArr = str.split(" ");
		Map<String, Integer> mapFreq = new LinkedHashMap<>();
		for(String name : strArr) {
			if(mapFreq.containsKey(name)) {
				int count = mapFreq.get(name);
				mapFreq.put(name, ++count);
			}else {
				mapFreq.put(name, 1);
			}
		}
		System.out.println(mapFreq);
	}
	
	void printFreqNum(int [] arr) {
		Map<Integer,Integer> mapFreq = new TreeMap<>();
		for(int num: arr) {
			if(mapFreq.containsKey(num)) {
				int count = mapFreq.get(num);
				mapFreq.put(num, ++count);
			}else {
				mapFreq.put(num, 1);
			}
		}
		System.out.println(mapFreq);
	}
	
	public static void main(String[] args) {
		new FreqUsingHashMap().printFreqWord("Hi Hello Hi Hello Hello Techno Credits Credits Hello Hi");
		int[] data = {10,10,3,4,3,3,3,3,55,56};
		new FreqUsingHashMap().printFreqNum(data);	
		String str = "HiHelloTechnoCredits";
		new FreqUsingHashMap().printFreqChar(str);	
	}
}
