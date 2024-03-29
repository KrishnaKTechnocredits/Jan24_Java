/*Using Map, find out frequency of each special characters.

String name = "h#i#ra_l_tec#h!n!o!"
output : # -> 3
         _ -> 2
		 ! -> 3
*/
package akshay_gaikwad;

import java.util.*;

public class FindFreqChar {

	HashMap<Character, Integer> getFreqMap(String str) {
		HashMap<Character, Integer> hashMap = new HashMap<>();
		char[] arr = str.toCharArray();
		for (char ch : arr) {
			if (hashMap.containsKey(ch)) {
				int count = hashMap.get(ch);
				hashMap.put(ch, ++count);
			} else {
				hashMap.put(ch, 1);
			}
		}
		return hashMap;
	}
	
	void printFreqOfSpecialChar(String str) {
		HashMap<Character,Integer> hashMap = getFreqMap(str);
		Set<Character> chSet = hashMap.keySet();
		for(Character ch : chSet) {
			if(!(Character.isDigit(ch) || Character.isLetter(ch))) {
				System.out.println(ch + " -> " + hashMap.get(ch));
			}
		}
	}
	
	public static void main(String[] args) {
		String name = "h#i#ra_l_tec#h!n!o!";
		new FindFreqChar().printFreqOfSpecialChar(name);
	}
}
