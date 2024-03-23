/*Assignment - 86 : 23th March'2024 [VIMP]
Print frequency of each character from given input. [using Map]
Print frequency of each word from given input. [using Map]
Print frequency of each number from given input. [using Map]*/
package madhura_kulkarni;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment86 {

	void printCharFreqUsingHashmap(String str) {
		Map<Character, Integer> charCountMap = new LinkedHashMap<Character, Integer>();
		char[] arr = str.toCharArray();
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
	
	void printWordFreqUsingHashmap(String str1) {
		String[] str=str1.split(" ");
		Map<String, Integer> wordCountMap = new LinkedHashMap<String, Integer>();
		for (String word: str) {
			if (wordCountMap.containsKey(word)) {
				int count = wordCountMap.get(word);
				wordCountMap.put(word, count + 1);
			} else {
				wordCountMap.put(word, 1);
			}
		}
		System.out.println(wordCountMap);
	}
	
	void printNumberFreqUsingHashmap(int[] arr) {
		Map<Integer, Integer> numberCountMap = new LinkedHashMap<Integer, Integer>();
		for (int num: arr) {
			if (numberCountMap.containsKey(num)) {
				int count = numberCountMap.get(num);
				numberCountMap.put(num, count + 1);
			} else {
				numberCountMap.put(num, 1);
			}
		}
		System.out.println(numberCountMap);
	}

	public static void main(String[] args) {
		int[] data = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		String str = "madhurakulkarni";
		String str1 = "Madhura Bhargav Gargi Bhargav Gargi Gargi Kulkarni";
		Assignment86 ass = new Assignment86();
		System.out.println("-------Printing frequency of each character from given input-------");
		ass.printCharFreqUsingHashmap(str);
		System.out.println("-------Printing frequency of word character from given input-------");
		ass.printWordFreqUsingHashmap(str1);
		System.out.println("-------Printing frequency of each number from given input-------");
		ass.printNumberFreqUsingHashmap(data);
	}
}
