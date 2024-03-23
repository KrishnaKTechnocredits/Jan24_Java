package garima_s;

import java.util.HashMap;
import java.util.Map;

public class Frequency {

	void getFreqCountWord(String str) {
		String[] name = str.split(" ");
		Map<String, Integer> wordCountMap = new HashMap<String, Integer>();
		for (String name1 : name) {
			if (wordCountMap.containsKey(name1)) {
				int count = wordCountMap.get(name1);
				wordCountMap.put(name1, count + 1);
			} else {
				wordCountMap.put(name1, 1);
			}
		}
		System.out.println(wordCountMap);
	}

	void getFreqCountChar(String str) {
		char[] arr = str.toCharArray();
		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		for (char ch : arr) {
			if (charCountMap.containsKey(ch)) {
				int count = charCountMap.get(ch);
				charCountMap.put(ch, count + 1);
			} else {
				charCountMap.put(ch, 1);
			}
		}
		System.out.println(charCountMap);
	}

	void getFreqCountNum(int[] arr) {
		Map<Integer, Integer> numCountMap = new HashMap<Integer, Integer>();
		for (int num : arr) {
			if (numCountMap.containsKey(num)) {
				int count = numCountMap.get(num);
				numCountMap.put(num, count + 1);
			} else {
				numCountMap.put(num, 1);
			}
		}
		System.out.println(numCountMap);
	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Hello Hello Techno Credits Credits Hello Hi";
		String str1 = "technocredits";
		int[] arr = { 12, 23, 44, 12, 44, 56, 3, 56, 8, 3, 44 };
		Frequency frequency = new Frequency();
		System.out.print("Frequency of words : ");
		frequency.getFreqCountWord(str);
		System.out.print("Frequency of Characters : ");
		frequency.getFreqCountChar(str1);
		System.out.print("Frequency of Numbers : ");
		frequency.getFreqCountNum(arr);
	}
}
