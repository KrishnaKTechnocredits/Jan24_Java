package technocredits.collectionsframework.mapdemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FreqOfEachElement {

	void getFreqOfEachChar(String str) {
		char[] arr = str.toCharArray();
		Map<Character, Integer> charCountMap = new TreeMap<Character,Integer>(Collections.reverseOrder());
		
		for(char ch : arr){
			if(charCountMap.containsKey(ch)){
				int count = charCountMap.get(ch);
				charCountMap.put(ch,count + 1);
			}else{
				charCountMap.put(ch,1);
			}
		}
		System.out.println(charCountMap);
	}
	
	void getFreqOfEachWord(String str) {
		String[] arr = str.split(" ");
		Map<String, Integer> wordCountMap = new LinkedHashMap<String,Integer>();
		
		for(String word : arr){
			if(wordCountMap.containsKey(word)){
				int count = wordCountMap.get(word);
				wordCountMap.put(word,count + 1);
			}else{
				wordCountMap.put(word,1);
			}
		}
		System.out.println(wordCountMap);
	}
	
	void getNumberFreq(int[] arr) {
		Map<Integer,Integer> numFreqMap = new LinkedHashMap<Integer,Integer>();
		
		for(int num : arr) {
			if(numFreqMap.containsKey(num)) {
				int count = numFreqMap.get(num);
				numFreqMap.put(num, count+1);
			}else {
				numFreqMap.put(num, 1);
			}
		}
		System.out.println(numFreqMap);
	}
	
	public static void main(String[] args) {
		FreqOfEachElement freqOfEachelement = new FreqOfEachElement();
		int[] data = {10,10,3,4,3,3,3,3,55,56};
		
		freqOfEachelement.getFreqOfEachChar("technocredits");
		freqOfEachelement.getFreqOfEachWord("Hi Hello Hi Hello Hello Techno Credits Credits Hello Hi");
		freqOfEachelement.getNumberFreq(data);
	}
}
