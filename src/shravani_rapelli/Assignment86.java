package shravani_rapelli;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment86 {
	
	void printFreqOfEachChar(String str) {
		char[] chArr = str.toCharArray();
		Map<Character, Integer> mapOfCharFreq = new LinkedHashMap<Character, Integer>();
		for (char ch : chArr) {
			if (mapOfCharFreq.containsKey(ch)) {
				int count = mapOfCharFreq.get(ch);
				mapOfCharFreq.put(ch, count + 1);
			} else {
				mapOfCharFreq.put(ch, 1);
			}
		}
		System.out.println(mapOfCharFreq);
	}

	void printFreqOfEachword(String str) {
		String[] strArr = str.split(" ");
		Map<String, Integer> mapOfWordFreq = new LinkedHashMap<String, Integer>();
		for (String word : strArr) {
			if (mapOfWordFreq.containsKey(word)) {
				int count = mapOfWordFreq.get(word);
				mapOfWordFreq.put(word, count + 1);
			} else {
				mapOfWordFreq.put(word, 1);
			}
		}
		System.out.println(mapOfWordFreq);
	}

	void printFreqOfEachnumber(int[] arr) {
		Map<Integer, Integer> mapOfNumFreq = new LinkedHashMap<Integer, Integer>();
		for (Integer num : arr) {
			if (mapOfNumFreq.containsKey(num)) {
				int count = mapOfNumFreq.get(num);
				mapOfNumFreq.put(num, count + 1);
			} else {
				mapOfNumFreq.put(num, 1);
			}
		}
		System.out.println(mapOfNumFreq);
	}

	public static void main(String[] args) {
		String str = "technocredits";
		String input = "Hi Hello Hi Hello Hello Techno Credits Credits Hello Hi";
		int[] data = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		Assignment86 assgn86 = new Assignment86();
		System.out.println("-----Character Freq-------");
		assgn86.printFreqOfEachChar(str);
		System.out.println();
		System.out.println("-----Word Freq-------");
		assgn86.printFreqOfEachword(input);
		System.out.println();
		System.out.println("-----Number Freq-------");
		assgn86.printFreqOfEachnumber(data);
	}

}
