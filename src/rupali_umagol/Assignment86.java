/*Print frequency of each character from given input. [using Map]
		Print frequency of each word from given input. [using Map]
				Print frequency of each number from given input. [using Map]*/
package rupali_umagol;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment86 {
	
	void getCountOfChar(String str) {
		Map<Character,Integer> countOfChar=new LinkedHashMap<>();
		char[] arr=str.toCharArray();
		for(char ch:arr) {
			if(countOfChar.containsKey(ch)) {
				int count=countOfChar.get(ch);
				countOfChar.put(ch, count+1);
			}else
				countOfChar.put(ch,1);
		}
		System.out.println(countOfChar);
	}
	
	void getCountOfEachWord(String[] arr) {
		Map<String,Integer> countOfWord=new LinkedHashMap<>();
		for(String word:arr) {
			if(countOfWord.containsKey(word)) {
				int count=countOfWord.get(word);
				countOfWord.put(word,count + 1);
			}else {
				countOfWord.put(word, 1);
			}
		}
		System.out.println(countOfWord);
		
	}
	
	void getCountOfNum(int[] arr) {
		Map<Integer,Integer> countOfNum=new LinkedHashMap<>();
		for(int num : arr) {
			if(countOfNum.containsKey(num)) {
				int count=countOfNum.get(num);
				countOfNum.put(num, count+1);
			}else
				countOfNum.put(num, 1);
		}
		System.out.println(countOfNum);
	}
	
	public static void main(String[] args) {
		Assignment86 assignment=new Assignment86();
		String str="tceochnonceredtits";
		assignment.getCountOfChar(str);
		String input="Hi Hello Hi Hello Hello Techno Credits Credits Hello Hi";
		String[] arr=input.split(" ");
		assignment.getCountOfEachWord(arr);
		int[] data= {10,10,3,4,3,3,3,3,55,56};
		assignment.getCountOfNum(data);


	}
}
