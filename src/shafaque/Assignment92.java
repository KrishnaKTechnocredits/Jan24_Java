package shafaque;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment92 {

	void getMaxRepeatingWordUsingMap(String input) {
		String[] str = input.split(" ");
		Map<String, Integer> wordCountMap = new LinkedHashMap<String, Integer>();
		for (String word : str) {
			if (wordCountMap.containsKey(word)) {
				int count = wordCountMap.get(word);
				wordCountMap.put(word, count + 1);
			} else
				wordCountMap.put(word, 1);
		}
		Set<String> keySet = wordCountMap.keySet();
		String tempWord = "";
		int maxCount = 0;
		for (String strWord : keySet) {
			if (wordCountMap.get(strWord) > maxCount) {
				maxCount = wordCountMap.get(strWord);
				tempWord = strWord;
			}
		}
		System.out.println("Max repeating word in given string is : " + tempWord + "-->" + maxCount + "(Using Map)");
	}

	int getWordFreq(String[] str1, String word) {
		int count = 0;
		for (int i = 0; i < str1.length; i++) {
			if (str1[i].equals(word))
				count++;
		}
		return count;
	}

	boolean isWordProccessed(String[] input, String targetWord, int index) {
		for (int i = 0; i < index; i++) {
			if (input[i].equals(targetWord))
				return true;
		}
		return false;
	}

	void getMaxRepeatingWordUsingArray(String input) {
		String[] str = input.split(" ");
		int maxWordCount = 0;
		String tempWord = "";
		for (int i = 0; i < str.length; i++) {
			if (!isWordProccessed(str, str[i], i)) {
				int wordFreq = getWordFreq(str, str[i]);
				if (wordFreq > maxWordCount) {
					maxWordCount = wordFreq;
					tempWord = str[i];
				}
			}
		}
		System.out.println(
				"Max repeating word in given string is : " + tempWord + "-->" + maxWordCount + "(Using Arrays)");
	}

	public static void main(String[] args) {
		String input = "abc xyz abc pqr";
		Assignment92 ass92 = new Assignment92();
		ass92.getMaxRepeatingWordUsingMap(input);
		ass92.getMaxRepeatingWordUsingArray(input);
	}

}
