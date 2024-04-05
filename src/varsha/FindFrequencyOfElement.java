package varsha;

import java.util.LinkedHashMap;
import java.util.Map;

//Print frequency of each character from given input. [using Map]
//Print frequency of each word from given input. [using Map]
//Print frequency of each number from given input. [using Map]

public class FindFrequencyOfElement {

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
		FindFrequencyOfElement findFrequencyOfElement = new FindFrequencyOfElement();
		System.out.println("-----Character Freq-------");
		findFrequencyOfElement.printFreqOfEachChar(str);
		System.out.println();
		System.out.println("-----Word Freq-------");
		findFrequencyOfElement.printFreqOfEachword(input);
		System.out.println();
		System.out.println("-----Number Freq-------");
		findFrequencyOfElement.printFreqOfEachnumber(data);
	}
}
