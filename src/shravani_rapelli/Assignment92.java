package shravani_rapelli;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment92 {

	void printFreqAndMaxWordWithMap(String str) {
		String[] strArr = str.split(" ");
		int max = 0;
		String name = "";
		Map<String, Integer> frequencyOfWord = new LinkedHashMap<>();
		for (String word : strArr) {
			if (frequencyOfWord.containsKey(word)) {
				int count = frequencyOfWord.get(word);
				frequencyOfWord.put(word, count + 1);
			} else {
				frequencyOfWord.put(word, 1);
			}
		}
		System.out.println(frequencyOfWord);
		Set<String> arrKey = frequencyOfWord.keySet();
		for (String key : arrKey) {
			int value = frequencyOfWord.get(key);
			if (value > 0) {
				System.out.println(key + "->" + value);
				if (max < value) {
					max = value;
					name = key;
				}
			}
		}
		System.out.println("Max repeating word is " + name);
	}
	
		int getcountOfEachWord(String[] arr, String str) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (str.equals(arr[i])) {
				count++;
				if (count > 1)
					arr[i] = arr[i].replace(arr[i], "");
			}
		}
		return count;
	}

	void printFreqAndMaxWordWithArray(String str) {
		String[] strArr = str.split(" ");
		int max = 0;
		String name = "";
		for (int i = 0; i < strArr.length; i++) {
			if (!strArr[i].isEmpty()) {
				int count = getcountOfEachWord(strArr, strArr[i]);
				System.out.println(strArr[i] + "->" + count);
				if (max < count) {
					max = count;
					name = strArr[i];
				}
			}
		}
		System.out.println("Max repeating word is " + name);

	}

	public static void main(String[] args) {
		Assignment92 assgn92 = new Assignment92();
		assgn92.printFreqAndMaxWordWithMap("abc xyz abc pqr");
		System.out.println();
		System.out.println("-----With Array-----");
		assgn92.printFreqAndMaxWordWithArray("abc xyz abc pqr");
	}
}
