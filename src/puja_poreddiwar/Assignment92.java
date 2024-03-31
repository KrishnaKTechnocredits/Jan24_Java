/*
 * Assignment - 92 : 25th March'2024 [15 mins]
program 1 (using map): input : abc xyz abc pqr 
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
pqr - 1
 */
package puja_poreddiwar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment92 {

	void getMaxMaxRepeatingWordMaps(String[] arr1) {

		Map<String, Integer> mapOfWords = new LinkedHashMap<String, Integer>();
		for (String currentName : arr1) {
			if (mapOfWords.containsKey(currentName)) {
				int count = mapOfWords.get(currentName);
				mapOfWords.put(currentName, count + 1);
			} else {
				mapOfWords.put(currentName, 1);
			}
		}

		System.out.println(mapOfWords);
		Set<String> keys = mapOfWords.keySet();
		int max = 0;
		String value = "";

		for (String key : keys) {
			if (mapOfWords.get(key) > max) {
				max = mapOfWords.get(key);
				value = key;
			}
		}
		System.out.println("Max Repeating word is : " + value);
	}

//-----------------------------------Assignment 92.2-----------------------------------------
	int getMaxMaxRepeatingWordArray(String[] str, String input1) {
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			String input2 = str[i];
			if (input1.equals(input2)) {
				count++;
			}
		}
		return count;
	}

	boolean isNumberProcessed(String word, int index, String[] str) {
		for (int i = 0; i < index; i++) {
			if (str[i].equals(word)) {
				return true;
			}
		}
		return false;
	}

	void printFreq(String[] str) {
		
		int count = 0;
		String maxRepeatingWord = "";
		for (int i = 0; i < str.length; i++) {
			String name = str[i];
			if (!isNumberProcessed(name, i, str)) {
			int	temp = getMaxMaxRepeatingWordArray(str, name);
				System.out.println(name + " -> " + temp);
				if (temp > count) {
					count = temp;
					maxRepeatingWord = name;
				}
			}
		}
		System.out.println("Max Repeating word is : " + maxRepeatingWord);
	}

	public static void main(String[] args) {
		String arr = "abc xyz abc pqr";
		String[] arr1 = arr.split(" ");
		System.out.println("----------Assignment 92.1----------");
		new Assignment92().getMaxMaxRepeatingWordMaps(arr1);

		System.out.println("----------Assignment 92.2----------");
		new Assignment92().printFreq(arr1);
	}
}
