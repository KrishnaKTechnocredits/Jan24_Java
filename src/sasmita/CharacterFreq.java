package sasmita;

import java.util.Map;
import java.util.TreeMap;

public class CharacterFreq {
	
	void getGetfreqofCharacter(String str) {
		char[] arr=str.toCharArray();
		Map<Character, Integer>CharacterCountMap= new TreeMap<Character, Integer>();
		for(char ch:arr) {
			if(CharacterCountMap.containsKey(ch)) {
			int count=CharacterCountMap.get(ch);
			CharacterCountMap.put(ch, count +1);
			}else {
				CharacterCountMap.put(ch,1);
			}
		}
		System.out.println(CharacterCountMap);
	}

	public static void main(String[] args) {
		CharacterFreq characterFreq= new CharacterFreq();
		characterFreq.getGetfreqofCharacter("technocredits");

	}

}
