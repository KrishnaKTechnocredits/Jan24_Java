/*
 * Assignment - 89 : 24th March'2024 [20-25 mins]
Find frequency of elements in integer array and find max frequency  number [Map]
input : {10,20,30,10,20,20,55,55,13,13,13,13,13,10}
output : 10 -> 3
         20 -> 3
         30 -> 1
         55 -> 2
         13 -> 5	
 */

package puja_poreddiwar;

import java.util.Map;
import java.util.LinkedHashMap;

public class Assignment89 {

	void getFreqOfNumbers(int[] arr) {
		Map<Integer, Integer> countOfNumbers = new LinkedHashMap<Integer, Integer>();
		for (int currentNum : arr) {
			if (countOfNumbers.containsKey(currentNum)) {
				int count = countOfNumbers.get(currentNum);
				countOfNumbers.put(currentNum, count + 1);
			} else
				countOfNumbers.put(currentNum, 1);
		}
		System.out.println(countOfNumbers);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 10, 20, 20, 55, 55, 13, 13, 13, 13, 13, 10 };
		new Assignment89().getFreqOfNumbers(arr);
	}
}
