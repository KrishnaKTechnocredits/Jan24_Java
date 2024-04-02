/*Assignment - 86 : 23th March'2024 [VIMP]
Print frequency of each character from given input. [using Map]
Print frequency of each word from given input. [using Map]
Print frequency of each number from given input. [using Map]*/
package sveta;

import java.util.HashMap;
import java.util.Map;

public class Assignment_86 {
	//Character Count
	int countFreq(String str, char ch){
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch1=str.charAt(i);
			if(ch==ch1) {
				count++;
			}
		}
		return count;
	}
	void charFreq(String str) {
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int count=countFreq(str, ch);
			if(!(ch==' ')) {
				if(!map.containsKey(ch)) 
					map.put(ch, count);	
			}
		}
		System.out.println(map);
	}
	
	//Word Count
	int countwordFreq(String[] arr, String str){
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(str.equals(arr[i])){
				count++;
			}
		}
		return count;
	}
	void wordFreq(String str) {
		String[] arr = str.split(" ");
		Map<String,Integer> hm=new HashMap<String,Integer> ();
		for(int i=0;i<arr.length;i++) {
			int count=countwordFreq(arr, arr[i]);
			if(!hm.containsKey(arr[i])) {
				hm.put(arr[i], count);
			}
		}
		System.out.println(hm);
	}
	
	
	public static void main(String[] args) {
		String str="Hi Hello Hi Hello Hello Techno Credits Credits Hello Hi";
		
		Assignment_86 ass_86 = new Assignment_86();
		ass_86.charFreq(str);
		ass_86.wordFreq(str);
	}

}
