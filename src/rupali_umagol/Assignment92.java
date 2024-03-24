/*program 1 (using map): input : abc xyz abc pqr 
O/p
abc - 2
xyz - 1
pqr - 1

Max repeating word is abc.

program 2 (without using map) [extra]
input : abc xyz abc pqr [30 mins]
O/p
abc - 2
xyz - 1
pqr - 1*/
package rupali_umagol;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment92 {

	void getFreqOfWord(String[] arr) {
		Map<String, Integer> countOfWord = new LinkedHashMap<>();
		for (String name : arr) {
			if (countOfWord.containsKey(name)) {
				int count = countOfWord.get(name);
				countOfWord.put(name, count + 1);
			} else
				countOfWord.put(name, 1);
		}
		System.out.println(countOfWord);

		Set<String> keys = countOfWord.keySet();
		int max = 0;
		String value = null;
		for (String key : keys) {
			if (countOfWord.get(key) > max) {
				max = countOfWord.get(key);
				value = key;

				System.out.println("Max Repetating word : " + value);
			}
		}
	}

	int getCount(String[] arr, String name) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (name.equals(arr[i]))
				count++;
		}
		return count;
	}

	boolean isProcessed(String[] arr, String targetString, int index) {
		for (int i = 0; i < index; i++) {
			if (targetString.equals(arr[i]))
				return true;
		}
		return false;
	}

	void getCountOfWord(String[] arr) {
		int max = 0;
		int count = 0;
		String name = null;
		for (int i = 0; i < arr.length; i++) {
			if (!isProcessed(arr, arr[i], i)) {
				count = getCount(arr, arr[i]);
				System.out.println(arr[i] + "->" + count);
				if (max < count) {
					max = count;
					name = arr[i];
				}
			}
		}
		System.out.println("Max Repetating word : " + name);
	}

	public static void main(String[] args) {
		Assignment92 assignment = new Assignment92();
		String input = "abc xyz abc pqr";
		String[] str = input.split(" ");
		assignment.getFreqOfWord(str);
		System.out.println("================");
		assignment.getCountOfWord(str);
	}
}
