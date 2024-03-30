package akshada_marne;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindCharStringNumFreqUsingMap {

	void findUniqueNumber(int[] arr) {

		Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();

		for (int num : arr) {
			if (numbersMap.containsKey(num)) {
				int count = numbersMap.get(num);
				numbersMap.put(num, count + 1);
			} else {
				numbersMap.put(num, 1);
			}
		}

		Set<Integer> numKeySet = numbersMap.keySet();

		for (int num : numKeySet) {
			int count = numbersMap.get(num);
			if (count == 1) {
				System.out.println(num);
			}
		}

	}

	void findUniqueString(String[] arr) {

		Map<String, Integer> strMap = new HashMap<String, Integer>();

		for (String str : arr) {
			if (strMap.containsKey(str)) {
				int count = strMap.get(str);
				strMap.put(str, count + 1);

			} else {
				strMap.put(str, 1);
			}
		}

		Set<String> strKeySet = strMap.keySet();

		for (String str : strKeySet) {
			int count = strMap.get(str);

			if (count == 1)
				System.out.println(str);
		}
	}

	void findUniqueChar(char[] arr) {

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (char ch : arr) {
			if (charMap.containsKey(ch)) {
				int count = charMap.get(ch);
				charMap.put(ch, count + 1);
			} else {
				charMap.put(ch, 1);
			}

		}

		Set<Character> charKeySet = charMap.keySet();

		for (char ch : charKeySet) {
			int count = charMap.get(ch);
			if (count == 1)
				System.out.print(ch + " ");

		}
	}

	public static void main(String[] args) {
		FindCharStringNumFreqUsingMap findCharStringNumFreqUsingMap = new FindCharStringNumFreqUsingMap();
		int[] arr = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		String[] strarr = { "techno", "credits", "hi", "hello", "techno", "credits", "JAN2024" };
		String str = "Akshada";
		str = str.toLowerCase();
		char[] chararr = str.toCharArray();
		System.out.println("-----Unique numbers using Map-----");
		findCharStringNumFreqUsingMap.findUniqueNumber(arr);
		System.out.println("-----Unique String using Map-----");
		findCharStringNumFreqUsingMap.findUniqueString(strarr);
		System.out.println("-----Unique char using Map-----");
		findCharStringNumFreqUsingMap.findUniqueChar(chararr);

	}
}
