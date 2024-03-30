package rohini_deshmane.collection_programs;

import java.util.HashMap;

public class FrequencyOfEachCharacter {

	void getFrequencyOfChar(String str) {
		HashMap<Character, Integer> charFrequency = new HashMap<>();
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(charFrequency.containsKey(str.charAt(i))) {
				count=charFrequency.get(str.charAt(i))+1;
				charFrequency.put(str.charAt(i), count);
			} else 
				charFrequency.put(str.charAt(i), 1);
		}
		System.out.println("Character Frequency : ");
		System.out.println(charFrequency);
	}
	
	void getFrequencyOfWords(String str) {
		HashMap<String, Integer> wordFrequency = new HashMap<>();
		String[] strArr = str.split(" ");
		int count=0;
		for(int i=0; i<strArr.length; i++) {
			if(wordFrequency.containsKey(strArr[i])) {
				count=wordFrequency.get(strArr[i])+1;
				wordFrequency.put(strArr[i], count);
			} else 
				wordFrequency.put(strArr[i], 1);
		}
		System.out.println("\n Word Frequency : ");
		System.out.println(wordFrequency);
	}
	
	void getFrequencyOfNumbers(int[] numberArr) {
		HashMap<Integer, Integer> numberFrequency = new HashMap<>();
		int count=0;
		for(int i=0; i<numberArr.length; i++) {
			if(numberFrequency.containsKey(numberArr[i])) {
				count=numberFrequency.get(numberArr[i])+1;
				numberFrequency.put(numberArr[i], count);
			} else 
				numberFrequency.put(numberArr[i], 1);
		}
		System.out.println("\n Number Frequency : ");
		System.out.println(numberFrequency);
	}
	
	public static void main(String[] args) {
		FrequencyOfEachCharacter freqency = new FrequencyOfEachCharacter();
		String str = "AmazonTechnology";
		freqency.getFrequencyOfChar(str);
		String str1 ="Hello World Hello Technology Hi credits Hi Hi";
		freqency.getFrequencyOfWords(str1);
		int[] numbers= {2,5,10,6,10,10,7,8,2,10,4,6,6,6,9,10};
		freqency.getFrequencyOfNumbers(numbers);
	}
}
