/*
 * Assignment - 86 : 23th March'2024 [VIMP]
Print frequency of each character from given input. [using Map]
Print frequency of each word from given input. [using Map]
Print frequency of each number from given input. [using Map]
 */

package puja_poreddiwar;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment86_1 {
	
	void getFreqOfEachCharacterUsingArray(String str) {
		System.out.println("Using Array : ");
		System.out.println("Frequency of Character ");
		while (str.length()>0) {
			char ch = str.charAt(0);
			int orginalLen = str.length();
			str= str.replace(ch+"", "");
			int newLen = str.length();
			System.out.println( ch + " --> " + (orginalLen-newLen));
		}
	}
	
	void getFreqOfEachCharacterUsingMap(String str) {
		System.out.println("Using Map : ");
		char[] ch = str.toCharArray();
		Map<Character, Integer> CharMap = new LinkedHashMap<Character, Integer>();
		for(char currentChar : ch) {
			if(CharMap.containsKey(currentChar)) {
				int count = CharMap.get(currentChar);
				CharMap.put(currentChar, count +1);
			}else {
				CharMap.put(currentChar, 1);
			}
		}
		System.out.println(CharMap);
	}
	
	public static void main(String[] args) {
		new Assignment86_1().getFreqOfEachCharacterUsingArray("technocredits");
		System.out.println("-------------------------------------------------");
		new Assignment86_1().getFreqOfEachCharacterUsingMap("technocredits");
	}
}
