package akshay_gaikwad;
/*Assignment - 92 : 25th March'2024 [15 mins]
program 1 (using map): input : abc xyz abc pqr 
O/p
abc - 2
xyz - 1
pqr - 1

Max repeating word is abc.
10 min
 */
import java.util.*;
class MaxRepeatingWord{
	
	HashMap<String,Integer> getFreqWord(String str){
		String [] strArr = str.split(" ");
		HashMap<String,Integer> freqWord = new HashMap<>();
		for(String name : strArr){
			if(freqWord.containsKey(name)){
				int count = freqWord.get(name);
				freqWord.put(name, ++count);
			}else{
				freqWord.put(name,1);
			}
		}
		return freqWord;
	}
	
	void maxFreqWord(String str){
		HashMap<String,Integer> freqWord = getFreqWord(str);
		Set<String> setOfKeys = freqWord.keySet();
		int maxCount = 0;
		String maxFreqString = "";
		for(String name : setOfKeys){
			if(maxCount < freqWord.get(name)){
				maxCount = freqWord.get(name);
				maxFreqString = name;
			}
		}
		System.out.println(freqWord);
		System.out.println("Most frequent word in given string is " + maxFreqString + " having frequency of " + maxCount); 
	}
	
	public static void main(String[] args){
		String input = "abc xyz abc pqr";
		new MaxRepeatingWord().maxFreqWord(input);
	}
}